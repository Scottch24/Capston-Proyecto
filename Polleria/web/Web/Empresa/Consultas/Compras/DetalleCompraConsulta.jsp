
<%@page import="Modelo.DetalleCompras"%>
<%@page import="ModeloDAO.daoCompraDetalle"%>
<%@page import="Modelo.DetalleVenta"%>
<%@page import="ModeloDAO.daoVentaDetalle"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%
    daoCompraDetalle daoPro = new daoCompraDetalle();
    String id = request.getParameter("Cod");
    List<DetalleCompras> lista = daoPro.Listar(id);
%>
<table>
    <thead>
        <tr>
            <th>idCompra</th>
            <th>idInsumo</th>
            <th>Insumo</th>
            <th>cantidad</th>
            <th>Precio</th>
            <th>SubTotal</th>
        </tr>
    </thead>
    <tbody>
        <%        for (DetalleCompras c : lista) {
        %>
        <tr>
            <td><%=c.getIdCompra()%></td>
            <td><%=c.getIdIngredientes()%></td>
            <td><%=c.getNombre()%></td>
            <td><%=c.getCantidad()%></td>
            <td><%=c.getPrecio()%></td>
            <td><%=c.getSubTotal()%></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

