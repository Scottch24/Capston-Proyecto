<%@page import="ModeloDAO.daoCategoriaProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.CategoriaProductos"%>
<%
    CategoriaProductos cat = new CategoriaProductos();
    daoCategoriaProductos daocat = new daoCategoriaProductos();
    List<CategoriaProductos> combocat = daocat.Listar();

%>
<label for="selCategoria" class="col-form-label"
       class="badge rounded-pill p-2 bg-secondary">Categoria: </label>
<select  name="selCategoria" id="selCategoria" class="form-select">
    <option value="0">::Selecionar::</option>
    <%        for (CategoriaProductos c : combocat) {
    %>
    <option value="<%=c.getIdCategoria()%>"><%=c.getDescripcion()%></option>
    <%
        }
    %>
</select>
<div class="valid-feedback">
    Correcto!
</div>
<div class="invalid-feedback">
    Por favor, elija un nombre de usuario.
</div>
