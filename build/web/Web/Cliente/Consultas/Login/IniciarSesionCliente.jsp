<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.daoLogin"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    daoLogin l = new daoLogin();
    Cliente cli = new Cliente();

    String usuario = request.getParameter("Usuario");
    String contraseña = request.getParameter("Contraseña");
    cli.setUsuario(usuario);
    cli.setContraseña(contraseña);

    String s = l.InicioSesion_Cliente(cli);

    if (s.equalsIgnoreCase("No Se Puedo Iniciar Sesion")) {
    } else {

        session.setAttribute("CodigoCliente", s);
        request.setAttribute("CodigoCliente2", s);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("CodigoCliente3", s);

%>

<%=s%>

<%

    }


%>