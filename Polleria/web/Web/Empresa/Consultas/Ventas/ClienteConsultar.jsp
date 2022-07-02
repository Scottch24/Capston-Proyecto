<%@page import="java.util.List"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.daoCliente"%>
<%
    daoCliente daocli = new daoCliente();
    List<Cliente> lista = daocli.Listar();
%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Genero</th>
            <th>DNI</th>
            <th>Telefono</th>
            <th>Estado<th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%
            for (Cliente dato : lista) {
        %>
        <tr>
            <td><%=dato.getNombres()%></td>
            <td><%=dato.getApellidos()%></td>
            <td><%=dato.getGenero()%></td>
            <td><%=dato.getDni()%></td>
            <td><%=dato.getTelefono()%></td>
            <td><span class="status <%=dato.getEstado()%>"><%=dato.getEstado()%></span></td>
            <td><a href="#" data-bs-dismiss="modal" onclick="SeleccionarCliente('<%=dato.getIdCliente()%>', '<%=dato.getNombres()%>','<%=dato.getApellidos()%>' , '<%=dato.getDni()%>')">
                    <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAAQlJREFUSEvNlMEVATEQhr+tgBKoAB1QAR3gygEdUAEXrqgAHVABKkAFqIA33mbf2pVNWPHMNZP55s8/Ew/H4Tmuz08BN1/NBZgBvW+oCytQAFW3AqzTQl49URcYAiug5gKQBc5+4TxwTAPRmSwe1FMU3gElua8DFIFtCsAJyCUB5Ey6KGggqrHoYKj0AdA3ARrA9ENA4J1p0WQnMiGILj+sZAOU1R0TYAR03gQ0/UV9XDMBxKjDi2fSeXD1zRXlVgBJWgLVCEQHmAPiXRAmBZIo27ywHNnY92IDMI2sYu8B2Z+nsAVYCoin2QLGQAuYAO1ImaQz4xSpWuE5jzaVdGYNcK7AuQf/C7gDNOwuGTttIPQAAAAASUVORK5CYII="/>
                </a>
            </td>
        </tr>
        <%=dato.getDni()%>
        <%
            }
        %>
    </tbody>
</table>

