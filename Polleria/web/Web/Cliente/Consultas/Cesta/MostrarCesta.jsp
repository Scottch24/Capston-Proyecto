<%@page import="Modelo.Productos"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.text.DecimalFormat"%>
<%
    DecimalFormat df = new DecimalFormat("0.00");
    daoCesta c = (daoCesta) session.getAttribute("Cesta2");
    String cadeimagen = "";
    if (c == null) {

    } else {
        List<Productos> lista = c.getLista();
        double total = 0.0;

        if (lista.isEmpty()) {
%>
<p style="text-align:center;border:1px dotted #000; padding:8px;">Carrito Vacio</p>
<%
} else {

    for (Productos b : lista) {

%>
<div class="item">
    <!--<img src="ControladorIMG?idS=<//%=a.getIdProductos()%>" id="" width="100px" height="150px">-->
    <img src="${pageContext.request.contextPath}/SevProductosImg?idProducto=<%=b.getIdProductos()%>" alt="alt" "/>
    <div class="textos" style="align-items: stretch; width: 260px;">
        <p class="nombre-item">Producto: <%=b.getNombre()%></p>
        <p class="nombre-item">Cantidad: <%=b.getStock()%></p>
        <p>Importe: S/.<span><%=b.getPrecio() * b.getStock()%></span></p>
        <button class="boton_quitar boton_quitar_Cesta"  onclick="retirar('<%=b.getIdProductos()%>')">Quitar</button>
    </div>
</div>
<%

            }
        }
    }
%>
