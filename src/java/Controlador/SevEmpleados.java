/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cargo;
import Modelo.CategoriaProductos;
import Modelo.Empleados;
import Modelo.Productos;
import ModeloDAO.daoCargo;
import ModeloDAO.daoEmpleados;
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
public class SevEmpleados extends HttpServlet {

    Empleados emp = new Empleados();
    daoEmpleados daoemp = new daoEmpleados();
    daoCargo daoCar = new daoCargo();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevEmpleados</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevEmpleados at " + request.getContextPath() + "</h1>");
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
                    List<Empleados> lista = daoemp.Buscar(CajaBuscar);
                    request.setAttribute("listaEmpleados", lista);
                    request.getRequestDispatcher("Web/Empresa/Empleados.jsp").forward(request, response);
                    break;
                } catch (Exception e) {

                }
            }
            case "Listar": {
                try {
                    List<Empleados> lista = daoemp.Listar();
                    request.setAttribute("listaEmpleados", lista);
                    List<Cargo> CargEmp = daoCar.Listar();
                    request.setAttribute("CargoEmp", CargEmp);
                    request.getRequestDispatcher("Web/Empresa/Empleados.jsp").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Guardar": {
                try {
                    String Nombre = request.getParameter("txtNombre");
                    String apellido = request.getParameter("txtApellido");
                    int dni = Integer.parseInt(request.getParameter("txtDNI"));
                    String Fecha = request.getParameter("txtFecha");
                    String Telefono = request.getParameter("txtTelefono");
                    String Correo = request.getParameter("txtCorreo");
                    int idCate = Integer.parseInt(request.getParameter("selCargo"));
                    String Usuario = request.getParameter("txtUsuario");
                    String Contraseña = request.getParameter("txtContra");

                    emp.setNombres(Nombre);
                    emp.setApellidos(apellido);
                    emp.setDni(dni);
                    emp.setNacimiento(Fecha);
                    emp.setTelefono(Telefono);
                    emp.setCorreo(Correo);
                    emp.setIdCargo(idCate);
                    emp.setUsuario(Usuario);
                    emp.setContraseña(Contraseña);
                    daoemp.Registrar(emp);
                 //   request.getRequestDispatcher("SevEmpleados?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Actualizar": {
                try {
                    String idEmpleados = request.getParameter("txtIdEmpleado");
                    String Nombre = request.getParameter("txtNombre");
                    String apellido = request.getParameter("txtApellido");
                    int dni = Integer.parseInt(request.getParameter("txtDNI"));
                    String Fecha = request.getParameter("txtFecha");
                    String Telefono = request.getParameter("txtTelefono");
                    String Correo = request.getParameter("txtCorreo");
                    int idCate = Integer.parseInt(request.getParameter("selCargo"));
                    String Usuario = request.getParameter("txtUsuario");
                    String Contraseña = request.getParameter("txtContra");

                    emp.setIdEmpleado(idEmpleados);
                    emp.setNombres(Nombre);
                    emp.setApellidos(apellido);
                    emp.setDni(dni);
                    emp.setNacimiento(Fecha);
                    emp.setTelefono(Telefono);
                    emp.setCorreo(Correo);
                    emp.setIdCargo(idCate);
                    emp.setUsuario(Usuario);
                    emp.setContraseña(Contraseña);
                    daoemp.Actualizar(emp);

                    //request.getRequestDispatcher("SevEmpleados?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Eliminar": {
                try {
                    String idProductos = request.getParameter("idEmpleado");
                    daoemp.Eliminar(idProductos);
                   // request.getRequestDispatcher("SevEmpleados?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SevEmpleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            default: {
                request.getRequestDispatcher("SevEmpleados?accion=Listar").forward(request, response);
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
