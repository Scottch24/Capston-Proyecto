/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CategoriaProductos;
import Modelo.Productos;
import ModeloDAO.daoCategoriaProductos;
import ModeloDAO.daoProductos;
import com.mysql.cj.Session;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Miguel
 */
@MultipartConfig
public class SevProductos extends HttpServlet {

    Productos p = new Productos();
    daoProductos daoPro = new daoProductos();

    CategoriaProductos cat = new CategoriaProductos();
    daoCategoriaProductos daocat = new daoCategoriaProductos();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevProductos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevProductos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        String ResultadoProceso = "";
        switch (accion) {
            case "Buscar": {
                try {
                    String CajaBuscar = request.getParameter("txtLetra");
                    List<Productos> lista = daoPro.Buscar(CajaBuscar);
                    request.setAttribute("listaT", lista);
                    request.getRequestDispatcher("Web/Empresa/Productos.jsp").forward(request, response);
                    break;
                } catch (Exception e) {

                }
            }

            case "Guardar": {
                String Nombre = request.getParameter("txtNombre");
                double Precio = Double.parseDouble(request.getParameter("txtPrecio"));
                int Stock = Integer.parseInt(request.getParameter("txtStock"));
                String Descripcion = request.getParameter("txtDescripcion");
                Part part = request.getPart("txtFileFoto");
                int idCate = Integer.parseInt(request.getParameter("selCategoria"));

                InputStream inputStream = part.getInputStream();
                if (inputStream.available() == 0) {
                    p.setImagen(null);
                } else {
                    p.setImagen(inputStream);
                }
                p.setNombre(Nombre);
                p.setPrecio(Precio);
                p.setStock(Stock);
                p.setDescripcion(Descripcion);
                p.setIdCategoria(idCate);
                p.setNombreArchivo(part.getSubmittedFileName());
                daoPro.Registrar(p);
                break;
            }

            case "Actualizar": {
                try {
                    String idProductos = request.getParameter("txtIdProducto");
                    String Nombre = request.getParameter("txtNombre");
                    double Precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int Stock = Integer.parseInt(request.getParameter("txtStock"));
                    String Descripcion = request.getParameter("txtDescripcion");
                    Part part = request.getPart("txtFileFoto");
                    int idCate = Integer.parseInt(request.getParameter("selCategoria"));
                    InputStream inputStream = part.getInputStream();
                    if (inputStream.available() == 0) {
                        p.setImagen(null);
                    } else {
                        p.setImagen(inputStream);
                    }
                    p.setIdProductos(idProductos);
                    p.setNombre(Nombre);
                    p.setPrecio(Precio);
                    p.setStock(Stock);
                    p.setDescripcion(Descripcion);
                    p.setIdCategoria(idCate);
                    p.setNombreArchivo(part.getSubmittedFileName());
                    if (p.getDescripcion() != null && p.getDescripcion().isEmpty()) {
                        ResultadoProceso = "Faltan Llenar Campos";
                    } else {
                        ResultadoProceso = "Actualizado Correctamente";
                    }
                    daoPro.Actualizar(p);
                    break;
                } catch (Exception ex) {
                    ResultadoProceso = "Error: " + ex.getMessage();
                }

            }

            case "Eliminar": {
                try {
                    String idProductos = request.getParameter("idProducto");
                    daoPro.Eliminar(idProductos);
                    break;
                } catch (Exception ex) {
                    Logger.getLogger(SevProductos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            default:
                request.getRequestDispatcher("SevProductos?accion=Listar").forward(request, response);
                break;
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
