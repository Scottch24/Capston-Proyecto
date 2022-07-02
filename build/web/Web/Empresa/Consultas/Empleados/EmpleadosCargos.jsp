<%@page import="java.util.List"%>
<%@page import="ModeloDAO.daoCargo"%>
<%@page import="Modelo.Cargo"%>
<%
    Cargo cat = new Cargo();
    daoCargo daocat = new daoCargo();
    List<Cargo> combocat = daocat.Listar();

%>
<label for="selcetCargos" class="col-form-label"
       class="badge rounded-pill p-2 bg-secondary">Cargo: </label>
<select name="selCargo" id="selCargo" class="form-select">
    <option value="0">::Selecionar::</option>
    <%        for (Cargo c : combocat) {
    %>
    <option value="<%=c.getIdCargo()%>"><%=c.getDescripcion()%></option>
    <%
        }
    %>
</select>
