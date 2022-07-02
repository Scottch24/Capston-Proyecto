<%@page import="Modelo.Productos"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.daoCesta"%>
<%
    daoCesta c = (daoCesta) session.getAttribute("Cesta2");
    if (c == null) {
%>
S/.<span>0.0</span>
<%
} else {
    List<Productos> lista = c.getLista();
    double total = 0.0;

    for (Productos b : lista) {
        total = total + (b.getStock() * b.getPrecio());
    }
%>
S/.<span><%=total%></span>
<%

    }

%>

