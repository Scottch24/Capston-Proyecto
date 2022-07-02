/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedores;
import ModeloDAO.daoProveedores;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */

@MultipartConfig
public class SevProveedores extends HttpServlet {

    Proveedores prov = new Proveedores();
    daoProveedores daoprov = new daoProveedores();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevProveedores</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevProveedores at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Buscar": {
                try {
                    String CajaBuscar = request.getParameter("txtLetra");
                    List<Proveedores> lista = daoprov.Buscar(CajaBuscar);
                    request.setAttribute("listaProveedor", lista);
                    request.getRequestDispatcher("Web/Empresa/Proveedores.jsp").forward(request, response);
                    break;
                } catch (Exception e) {

                }
            }
            case "Listar": {
                try {
                    List<Proveedores> lista = daoprov.Listar();
                    request.setAttribute("listaProveedor", lista);
                    request.getRequestDispatcher("Web/Empresa/Proveedores.jsp").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            case "Guardar": {
                try {
                    String RazonSocial = request.getParameter("txtRazonSocial");
                    String Ruc = request.getParameter("txtRuc");
                    String Telefono = request.getParameter("txtTelefono");
                    String Contacto = request.getParameter("txtContacto");
                    prov.setRazonSocial(RazonSocial);
                    prov.setRUC(Ruc);
                    prov.setTelefono(Telefono);
                    prov.setContacto(Contacto);
                    daoprov.Registrar(prov);
                    //request.getRequestDispatcher("SevProveedores?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            case "Actualizar": {
                try {
                    int idProveedor = Integer.parseInt(request.getParameter("txtIdProveedor"));
                    String RazonSocial = request.getParameter("txtRazonSocial");
                    String Ruc = request.getParameter("txtRuc");
                    String Telefono = request.getParameter("txtTelefono");
                    String Contacto = request.getParameter("txtContacto");
                    prov.setIdProveedor(idProveedor);
                    prov.setRazonSocial(RazonSocial);
                    prov.setRUC(Ruc);
                    prov.setTelefono(Telefono);
                    prov.setContacto(Contacto);
                    daoprov.Actualizar(prov);
                   // request.getRequestDispatcher("SevProveedores?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            case "Eliminar": {
                try {
                    int idCliente = Integer.parseInt(request.getParameter("idProveedor"));
                    daoprov.Eliminar(idCliente);
                   // request.getRequestDispatcher("SevProveedores?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            default:
                request.getRequestDispatcher("SevProveedores?accion=Listar").forward(request, response);
                break;
        }
    }

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
