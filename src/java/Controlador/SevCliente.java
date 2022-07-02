/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import ModeloDAO.daoCliente;
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
public class SevCliente extends HttpServlet {

    Cliente c = new Cliente();
    daoCliente daoc = new daoCliente();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevCliente</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevCliente at " + request.getContextPath() + "</h1>");
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
                    List<Cliente> lista = daoc.Buscar(CajaBuscar);
                    request.getSession().setAttribute("listaT", lista);
                    request.getRequestDispatcher("Web/Empresa/Clientes.jsp").forward(request, response);
                    break;
                } catch (Exception e) {

                }
            }
            case "Listar": {
                try {
                    List<Cliente> lista = daoc.Listar();
                    request.getSession().setAttribute("listaT", lista);
                    request.getRequestDispatcher("Web/Empresa/Clientes.jsp").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            case "ListarTabla": {
                request.getRequestDispatcher("SevCliente?accion=Listar").forward(request, response);
                break;
            }

            case "Guardar": {
                try {
                    String Nombre = request.getParameter("txtNombre");
                    String Apellido = request.getParameter("txtApellido");
                    String Telefono = request.getParameter("txtTelefono");
                    int dni = Integer.parseInt(request.getParameter("txtDNI"));
                    String Direccion = request.getParameter("txtCorreo");
                    String Usuario = request.getParameter("txtUsuario");
                    String Contraseña = request.getParameter("txtContra");
                    String Genero = request.getParameter("selGenero");
                    //boolean Estado = Boolean.parseBoolean(request.getParameter("txtEstado"));
                    System.out.println(Nombre + Apellido + Telefono+Direccion);
                    c.setNombres(Nombre);
                    c.setApellidos(Apellido);
                    c.setTelefono(Telefono);
                    if (Genero.equals("")) {
                        c.setGenero("NoSeleccionado");
                    } else {
                        c.setGenero(Genero);
                    }
                    c.setDni(dni);
                    if (Direccion.equals("")) {
                        c.setDireccion("av");
                    } else {
                        c.setDireccion(Genero);
                    }
                    c.setUsuario(Usuario);
                    c.setContraseña(Contraseña);
                    daoc.Registrar(c);
                    ///request.getRequestDispatcher("SevCliente?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {
                    System.out.println("Error en clientes Sverlt " + ex.getMessage());
                }
            }

            case "Actualizar": {
                try {
                    String idCliente = request.getParameter("txtIdCliente");
                    String Nombre = request.getParameter("txtNombre");
                    String Apellido = request.getParameter("txtApellido");
                    String Telefono = request.getParameter("txtTelefono");
                    int dni = Integer.parseInt(request.getParameter("txtDNI"));
                    String Direccion = request.getParameter("txtCorreo");
                    String Usuario = request.getParameter("txtUsuario");
                    String Contraseña = request.getParameter("txtContra");
                    String Genero = request.getParameter("selGenero");
                    String Estado = request.getParameter("txtEstado");
                    c.setIdCliente(idCliente);
                    c.setNombres(Nombre);
                    c.setApellidos(Apellido);
                    c.setTelefono(Telefono);
                    c.setGenero(Genero);
                    c.setDni(dni);
                    c.setDireccion(Direccion);
                    c.setUsuario(Usuario);
                    c.setContraseña(Contraseña);
                    if (Estado != null) {
                        c.setEstado("Habilitado");
                    } else {
                        c.setEstado("Deshabilitado");
                    }
                    daoc.Actualizar(c);
                    request.getRequestDispatcher("SevCliente?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            case "Eliminar": {
                try {
                    String idCliente = request.getParameter("idCliente");
                    daoc.Eliminar(idCliente);
                    request.getRequestDispatcher("SevCliente?accion=Listar").forward(request, response);
                    break;
                } catch (ClassNotFoundException ex) {

                }
            }

            default:
                request.getRequestDispatcher("SevCliente?accion=Listar").forward(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
