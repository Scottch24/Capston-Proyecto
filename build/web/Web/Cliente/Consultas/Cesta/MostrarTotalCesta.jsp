<%@page import="Modelo.Productos"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="ModeloDAO.daoCesta"%>
<%
    daoCesta c = (daoCesta) session.getAttribute("Cesta2");

    if (c == null) {
%>
<p class="precio-total">Total:</p>
<p>S/.<span>0.00</span></p>
<%
    } else {
    DecimalFormat df = new DecimalFormat("0.00");
        List<Productos> lista = c.getLista();
        double total = 0.0;

        for (Productos b : lista) {
            total = total + (b.getStock() * b.getPrecio());
        }
%>
<p class="precio-total">Total:</p>
<p>S/.<span><%=df.format(total)%></span></p>
<a href="${pageContext.request.contextPath}/Web/Cliente/Pedidos.jsp" class="Total_RealizaPago"  >Realizar Pago</a>
<%

    }

%>

