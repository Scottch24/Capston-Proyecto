/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Productos;
import ModeloDAO.daoCesta;
import com.mysql.cj.Messages;
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
public class SevCarrito extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevCarrito</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevCarrito at " + request.getContextPath() + "</h1>");
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
        daoCesta c = (daoCesta) request.getSession().getAttribute("Cesta");
        if (c == null) {
            c = new daoCesta();
        }
       
        String opera = request.getParameter("accion");

        switch (opera) {
            case "Agregar": {
                String cod = request.getParameter("codigo");
                String Nom = request.getParameter("nombre");
                double Precio = Double.parseDouble(request.getParameter("precio"));
                int cantidad = Integer.parseInt(request.getParameter("cantidad"));
                Productos prod = new Productos();
                prod.setIdProductos(cod);
                prod.setNombre(Nom);
                prod.setPrecio(Precio);
                prod.setStock(cantidad);
                c.agregar(prod);
                break;
            }
            case "Quitar": {
                String cod = request.getParameter("codigo");
                Productos prod = new Productos();
                prod.setIdProductos(cod);
                c.retirar(prod);
                break;
            }
            case "Cancelar": {
                List<Productos> lista = c.getLista();
                lista.clear();
            }
        }

        request.getSession().setAttribute("Cesta", c);
        request.getRequestDispatcher("Web/Empresa/NVentas.jsp").forward(request, response);
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
