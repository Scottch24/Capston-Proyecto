<%@page import="Modelo.Empleados"%>
<%@page import="ModeloDAO.daoLogin"%>
<%

    Empleados emp = new Empleados();
    daoLogin log = new daoLogin();

    String usuario = request.getParameter("usuario");
    String contrase�a = request.getParameter("contrase�a");
    emp.setUsuario(usuario);
    emp.setContrase�a(contrase�a);
    String Resultado = "";
    Resultado = log.InicioSesion_Empleados(emp);
    session.setAttribute("codigof", Resultado);
    session.setAttribute("Cesta", null);
    session.setAttribute("CestaCompra", null);

%>
<%=Resultado%>