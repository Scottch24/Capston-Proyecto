<%@page import="ModeloDAO.daoMarca"%>
<%@page import="Modelo.Marca"%>
<%@page import="ModeloDAO.daoCategoriaProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CategoriaProductos"%>
<%
    Marca cat = new Marca();
    daoMarca daocat = new daoMarca();
    List<Marca> combocat = daocat.Listar();
%>
<label for="selcetCargos" class="col-form-label"
       class="badge rounded-pill p-2 bg-secondary">Marca: </label>
<select class="form-select" name="selMarca" id="selMarca">
    <option value="0">::Selecionar::</option>
    <%        for (Marca c : combocat) {
    %>
    <option value="<%=c.getIdMarca()%>"><%=c.getDescripcion()%></option>
    <%
        }
    %>
</select>
