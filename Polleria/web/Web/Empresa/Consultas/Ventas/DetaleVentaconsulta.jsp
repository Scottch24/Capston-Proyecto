
<%@page import="Modelo.DetalleVenta"%>
<%@page import="ModeloDAO.daoVentaDetalle"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%
    daoVentaDetalle daoPro = new daoVentaDetalle();
    String id = request.getParameter("Cod");
    List<DetalleVenta> lista = daoPro.Listar(id);
%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>Nombre</th>
            <th>Imagen</th>
            <th>cantidad</th>
            <th>Precio</th>
            <th>SubTotal</th>
        </tr>
    </thead>
    <tbody>
        <%        for (DetalleVenta c : lista) {
        %>
        <tr>
            <td><%=c.getProducto()%></td>
            <td><img src="${pageContext.request.contextPath}/SevProductosImg?idProducto=<%=c.getIdProducto()%>" style="width: 150px; height: 80px;" alt="alt"  class="imgProducto"/></td>
            <td><%=c.getCantidad()%></td>
            <td><%=c.getPrecio()%></td>
            <td><%=c.getSubTotal()%></td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

