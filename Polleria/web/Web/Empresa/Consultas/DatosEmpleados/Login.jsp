<%@page import="Modelo.Empleados"%>
<%@page import="ModeloDAO.daoLogin"%>
<%

    Empleados emp = new Empleados();
    daoLogin log = new daoLogin();

    String usuario = request.getParameter("usuario");
    String contraseña = request.getParameter("contraseña");
    emp.setUsuario(usuario);
    emp.setContraseña(contraseña);
    String Resultado = "";
    Resultado = log.InicioSesion_Empleados(emp);
    session.setAttribute("codigof", Resultado);
    session.setAttribute("Cesta", null);
    session.setAttribute("CestaCompra", null);

%>
<%=Resultado%>