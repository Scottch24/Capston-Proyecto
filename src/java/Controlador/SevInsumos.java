/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Insumos;
import Modelo.Marca;
import ModeloDAO.daoInsumos;
import ModeloDAO.daoMarca;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class SevInsumos extends HttpServlet {

    Insumos ins = new Insumos();
    daoInsumos daoIns = new daoInsumos();
    daoMarca daoMar = new daoMarca();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevCargos</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevCargos at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Guardar": {
                try {
                    String Nombre = request.getParameter("txtIngrediente");
                    String Fecha = request.getParameter("txtFecha");
                    int idMarca = Integer.parseInt(request.getParameter("selMarca"));
                    double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    ins.setNombre(Nombre);
                    ins.setVencimiento(Fecha);
                    ins.setPrecio(precio);
                    ins.setIdMarca(idMarca);
                    daoIns.Registrar(ins);
                    //request.getRequestDispatcher("SevInsumos?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevInsumos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Actualizar": {
                try {
                    int idIngrediente = Integer.parseInt(request.getParameter("txtIdInsumo"));
                    String Nombre = request.getParameter("txtIngrediente");
                    String Fecha = request.getParameter("txtFecha");
                    double precio = Double.parseDouble(request.getParameter("txtPrecio"));
                    int idMarca = Integer.parseInt(request.getParameter("selMarca"));
                    ins.setIdIngrediente(idIngrediente);
                    ins.setNombre(Nombre);
                    ins.setVencimiento(Fecha);
                    ins.setPrecio(precio);
                    ins.setIdMarca(idMarca);
                    daoIns.Actualizar(ins);
                    //request.getRequestDispatcher("SevInsumos?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevInsumos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Eliminar": {
                try {
                    int idIngrediente = Integer.parseInt(request.getParameter("idProducto"));
                    daoIns.Eliminar(idIngrediente);
                    //request.getRequestDispatcher("SevInsumos?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevInsumos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
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
