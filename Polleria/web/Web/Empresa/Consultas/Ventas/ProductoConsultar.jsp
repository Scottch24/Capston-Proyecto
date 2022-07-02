
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%

    Productos pro = new Productos();
    daoProductos daoPro = new daoProductos();

    List<Productos> lista = daoPro.Listar();


%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>Nombre</th>
            <th>Imagen</th>
            <th>Stock</th>
            <th>Precio</th>
            <th>Categoria</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%        for (Productos c : lista) {
        %>
        <tr>
            <td style="font-size: 15px"><%=c.getNombre()%></td>
            <td><img src="${pageContext.request.contextPath}/SevProductosImg?idProducto=<%=c.getIdProductos()%>" style="width: 150px; height: 80px;" alt="alt"  class="imgProducto"/></td>
            <td><%=c.getStock()%></td>
            <td><%=c.getPrecio()%></td>
            <td><%=c.getCategoria()%></td>
            <td><a href="#" data-bs-dismiss="modal" onclick="SeleccionarProducto('<%=c.getIdProductos()%>','<%=c.getNombre()%>','<%=c.getPrecio()%>','<%=c.getStock()%>')">
                    <img style="width:30px; height: 30px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAQlJREFUSEvNlMEVATEQhr+tgBKoAB1QAR3gygEdUAEXrqgAHVABKkAFqIA33mbf2pVNWPHMNZP55s8/Ew/H4Tmuz08BN1/NBZgBvW+oCytQAFW3AqzTQl49URcYAiug5gKQBc5+4TxwTAPRmSwe1FMU3gElua8DFIFtCsAJyCUB5Ey6KGggqrHoYKj0AdA3ARrA9ENA4J1p0WQnMiGILj+sZAOU1R0TYAR03gQ0/UV9XDMBxKjDi2fSeXD1zRXlVgBJWgLVCEQHmAPiXRAmBZIo27ywHNnY92IDMI2sYu8B2Z+nsAVYCoin2QLGQAuYAO1ImaQz4xSpWuE5jzaVdGYNcK7AuQf/C7gDNOwuGTttIPQAAAAASUVORK5CYII="/>
                </a>
            </td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

