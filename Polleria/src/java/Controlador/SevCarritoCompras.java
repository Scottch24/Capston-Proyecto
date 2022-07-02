/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Insumos;
import ModeloDAO.daoCestaCompra;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
public class SevCarritoCompras extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevCarritoCompras</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevCarritoCompras at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        daoCestaCompra c = (daoCestaCompra) request.getSession().getAttribute("CestaCompra");
        if (c == null) {
            c = new daoCestaCompra();
        }
       
        String opera = request.getParameter("accion");

        switch (opera) {
            case "Agregar": {
                int cod = Integer.parseInt(request.getParameter("codigo"));
                String Nom = request.getParameter("nombre");
                double Precio = Double.parseDouble(request.getParameter("precio"));
                int cantidad = Integer.parseInt(request.getParameter("cantidad"));
                Insumos prod = new Insumos();
                prod.setIdIngrediente(cod);
                prod.setNombre(Nom);
                prod.setPrecio(Precio);
                prod.setCantidad(cantidad);
                c.agregar(prod);
                break;
            }
            case "Quitar": {
                int cod = Integer.parseInt(request.getParameter("codigo"));
                Insumos prod = new Insumos();
                prod.setIdIngrediente(cod);
                c.retirar(prod);
                break;
            }
            case "Cancelar": {
                List<Insumos> lista = c.getLista();
                lista.clear();
            }
        }

        request.getSession().setAttribute("CestaCompra", c);
        request.getRequestDispatcher("Web/Empresa/NCompras.jsp").forward(request, response);
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
