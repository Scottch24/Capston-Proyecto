/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cargo;
import ModeloDAO.daoCargo;
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
public class SevCargos extends HttpServlet {

    Cargo c = new Cargo();
    daoCargo daoc = new daoCargo();

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
            case "Buscar": {
                try {
                    String CajaBuscar = request.getParameter("txtLetra");
                    List<Cargo> lista = daoc.Buscar(CajaBuscar);
                    request.setAttribute("listaCargo", lista);
                    //request.getRequestDispatcher("Web/Empresa/Cargos.jsp").forward(request, response);
                    break;
                } catch (Exception e) {

                }
            }
            case "Listar": {
                try {
                    List<Cargo> lista = daoc.Listar();
                    request.setAttribute("listaCargo", lista);
                    request.getRequestDispatcher("Web/Empresa/Cargos.jsp").forward(request, response);
                    break;
                } catch (Exception ex) {

                }
            }
            case "Guardar": {
                try {
                    String Marca = request.getParameter("txtDescripcion");
                    c.setDescripcion(Marca);
                    daoc.Registrar(c);
                    //request.getRequestDispatcher("SevCargos?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }
            case "Eliminar": {
                try {
                    int IdMarca = Integer.parseInt(request.getParameter("idCargo"));
                    daoc.Eliminar(IdMarca);
                    //request.getRequestDispatcher("SevCargos?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }
            default:
                request.getRequestDispatcher("SevCargos?accion=Listar").forward(request, response);
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
