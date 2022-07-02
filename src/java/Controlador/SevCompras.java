/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Compras;
import Modelo.DetalleCompras;
import Modelo.Insumos;
import ModeloDAO.daoCestaCompra;
import ModeloDAO.daoCompra;
import ModeloDAO.daoCompraDetalle;
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
public class SevCompras extends HttpServlet {

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
            out.println("<title>Servlet SevCompras</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevCompras at " + request.getContextPath() + "</h1>");
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
        
        String VentaEleccion = request.getParameter("accion");

        switch (VentaEleccion) {
            case "Empleados": {
                try{
                //Instacias de clases
                Compras ven = new Compras();
                DetalleCompras detVen = new DetalleCompras();

                daoCompra daoven = new daoCompra();
                daoCompraDetalle daodetVen = new daoCompraDetalle();

                //Instacia De la Tabla Cesta
                List<Insumos> lista = c.getLista();

                //Variables
                String idEmpleado = request.getParameter("idEmpleado");
                int idProveedor = Integer.parseInt(request.getParameter("idProveedor"));
                double totFac = 0.0;

                //Setteo Compras
                ven.setIdEmpleado(idEmpleado);
                ven.setIdProveedor(idProveedor);
                ven.setTotal_Compra(c.getTotal());
                String idCompra = daoven.Registrar(ven); //Registra Venta Devuelve idCompra

                //Recorre filas de la tabla Cesta
                for (Insumos dat: lista) {
                    //Setteo del detalle venta
                    detVen.setIdCompra(idCompra);
                    detVen.setIdIngredientes(dat.getIdIngrediente());
                    detVen.setCantidad(dat.getCantidad());
                    detVen.setPrecio(dat.getPrecio());
                    detVen.setSubTotal(dat.getPrecio() * dat.getCantidad());
                    //guarda El total de todo el arreglo
                    totFac = totFac + (dat.getPrecio() * dat.getCantidad());
                    //Registra el detalle venta
                    daodetVen.Registrar(detVen);
                }

                //Limpiamos Cesta
                lista.clear();
                c.setTotal(0);
                //Setteamos Nueva Cesta
                request.getSession().setAttribute("CestaCompra", c);
                //Enviamos Datos al Compras.jsp
                request.getRequestDispatcher("Web/Empresa/NCompras.jsp").forward(request, response);
                }catch(Exception ex){
                    System.err.println("Erro En Envio SEVCOMPRAS: " + ex.getMessage());
                }
                break;
            }
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
