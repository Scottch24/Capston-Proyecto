
<%@page import="ModeloDAO.daoInsumos"%>
<%@page import="Modelo.Insumos"%>
<%@page import="java.util.List"%>
<%

    Insumos pro = new Insumos();
    daoInsumos daoPro = new daoInsumos();

    List<Insumos> lista = daoPro.Listar();

%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>id</th>
            <th>Insumo</th>
            <th>Vencimiento</th>
            <th>Marca</th>
            <th>Ultima Actualizacion</th>
            <th>Estado</th>
            <th></th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%        for (Insumos c : lista) {
        %>
        <tr>
            <td><%=c.getIdIngrediente()%></td>
            <td><%=c.getNombre()%></td>
            <td><%=c.getVencimiento()%></td>
            <td><%=c.getMarca()%></td>
            <td><%=c.getFechaActualiza()%></td>
            <td><span class="status <%=c.getEstado()%>"><%=c.getEstado()%></span></td>
            <td><a href="#" onclick="SeleccionarProducto('<%=c.getIdIngrediente()%>','<%=c.getNombre()%>','<%=c.getPrecio()%>','<%=c.getCantidad()%>')">
                    <img style="width:30px; height: 30px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAQlJREFUSEvNlMEVATEQhr+tgBKoAB1QAR3gygEdUAEXrqgAHVABKkAFqIA33mbf2pVNWPHMNZP55s8/Ew/H4Tmuz08BN1/NBZgBvW+oCytQAFW3AqzTQl49URcYAiug5gKQBc5+4TxwTAPRmSwe1FMU3gElua8DFIFtCsAJyCUB5Ey6KGggqrHoYKj0AdA3ARrA9ENA4J1p0WQnMiGILj+sZAOU1R0TYAR03gQ0/UV9XDMBxKjDi2fSeXD1zRXlVgBJWgLVCEQHmAPiXRAmBZIo27ywHNnY92IDMI2sYu8B2Z+nsAVYCoin2QLGQAuYAO1ImaQz4xSpWuE5jzaVdGYNcK7AuQf/C7gDNOwuGTttIPQAAAAASUVORK5CYII="/>
                </a>
            </td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

