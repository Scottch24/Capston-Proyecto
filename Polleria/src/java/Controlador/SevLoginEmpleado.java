/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleados;
import ModeloDAO.daoLogin;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Miguel
 */
public class SevLoginEmpleado extends HttpServlet {

    Empleados emp = new Empleados();
    daoLogin log = new daoLogin();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        String Resultado = "";
        switch (accion) {
            case "Ingresar": {

            }
            case "MandarDatos": {
                String codigo = request.getParameter("codigof");
                List<Empleados> lista = log.DatosEmpleado(codigo);
                request.getSession().setAttribute("datoempleadosSe", lista);
                request.getRequestDispatcher("Web/Config/Sliderbar.jsp").forward(request, response);
                break;
            }
            default: {
                request.getRequestDispatcher("SevLoginEmpleado?accion=Ingresar").forward(request, response);
            }
        }

    }

}
