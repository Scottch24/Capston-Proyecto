<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%

    daoCesta r = new daoCesta();
    daoProductos pro = new daoProductos();
    
    String Categoria = request.getParameter("Cagoria");
    String Letra = request.getParameter("Letra");

    List<Productos> list = pro.BuscarCategolo(Categoria,Letra);

    if (list.isEmpty()) {
%>

<span class="Msj_emtyProducts">Ups... No Hay Se Encuentra La <%=Categoria%> Que Esta Buscando En Este Momento!</span>

<%
} else {

    for (Productos a : list) {
%>

<div class="producto">
    <img src="${pageContext.request.contextPath}/SevProductosImg?idProducto=<%=a.getIdProductos()%>" alt="alt" "/>
    <div class="informacion">
        <span class="costo-envio"><%=a.getNombre()%></span>
        <span class="precio">S/.<%=a.getPrecio()%></span>
        <span class="Descripcion"><%=a.getDescripcion()%></span>
    </div>
    <div class="boton-carrito">
        <a href="#" onclick="Agrega('<%=a.getIdProductos()%>', '<%=a.getNombre()%>', '<%=a.getStock()%>', '<%=a.getPrecio()%>')">Seleccionar</a>
    </div>
</div>
<%
        }
    }
%>