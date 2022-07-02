<%@page import="java.util.List"%>
<%@page import="ModeloDAO.daoLogin"%>
<%@page import="Modelo.Empleados"%>
<%
    Empleados emp = new Empleados();
    daoLogin log = new daoLogin();
    String codig = request.getSession().getAttribute("codigof").toString();
    List<Empleados> lista = log.DatosEmpleado(codig);
    for (Empleados c : lista) {
%>
<a class="nav-link" href="#">
    <%=c.getNombres()%>
</a>
<%
    }
%>
