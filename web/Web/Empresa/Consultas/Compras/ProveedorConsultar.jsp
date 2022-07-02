
<%@page import="ModeloDAO.daoProveedores"%>
<%@page import="Modelo.Proveedores"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%
    Proveedores pro = new Proveedores();
    daoProveedores daoPro = new daoProveedores();
    List<Proveedores> lista = daoPro.Listar();
%>
<table  id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>IdProveedor</th>
            <th>RazonSocial</th>
            <th>RUC</th>
            <th>Telefono</th>
            <th>Contacto</th>
            <th>Ultima Actualizacion</th>
            <th>Estado</th>
            <th></th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%        for (Proveedores c : lista) {
        %>
        <tr>
            <td><%=c.getIdProveedor()%></td>
            <td><%=c.getRazonSocial()%></td>
            <td><%=c.getRUC()%></td>
            <td><%=c.getTelefono()%></td>
            <td><%=c.getContacto()%></td>
            <td><%=c.getUltimaFecha()%></td>
            <td><span class="status <%=c.getEstado()%>"><%=c.getEstado()%></span></td>
            <td><a href="#" data-bs-dismiss="modal" onclick="SeleccionarProveedor('<%=c.getIdProveedor()%>', '<%=c.getRazonSocial()%>','<%= c.getRUC()%>')">
                    <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAQlJREFUSEvNlMEVATEQhr+tgBKoAB1QAR3gygEdUAEXrqgAHVABKkAFqIA33mbf2pVNWPHMNZP55s8/Ew/H4Tmuz08BN1/NBZgBvW+oCytQAFW3AqzTQl49URcYAiug5gKQBc5+4TxwTAPRmSwe1FMU3gElua8DFIFtCsAJyCUB5Ey6KGggqrHoYKj0AdA3ARrA9ENA4J1p0WQnMiGILj+sZAOU1R0TYAR03gQ0/UV9XDMBxKjDi2fSeXD1zRXlVgBJWgLVCEQHmAPiXRAmBZIo27ywHNnY92IDMI2sYu8B2Z+nsAVYCoin2QLGQAuYAO1ImaQz4xSpWuE5jzaVdGYNcK7AuQf/C7gDNOwuGTttIPQAAAAASUVORK5CYII="/>
                </a>
            </td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

