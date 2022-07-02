
<%@page import="Modelo.Insumos"%>
<%@page import="ModeloDAO.daoCestaCompra"%>
<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.util.List"%>

<div class="details">
    <div class="recentOrders2" id="tablaCesta">
        <%

            daoCestaCompra c = (daoCestaCompra) session.getAttribute("CestaCompra");
            double total = 0.0;
            if (c == null) {

        %>
        <table  id="example" class=" table table-striped" style="width:100%">
            <thead>
                <tr>
                    <th>Codigo</th><th>Insumo</th><th>Cantidad</th><th>Precio</th><th>Importe</th><th></th>
                </tr>
            </thead>
            <tbody>
            </tbody>
        </table>
        <%        } else {
            List<Insumos> lista = c.getLista();
        %>
        <table  id="example" class=" table table-striped" style="width:100%">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Insumo</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                    <th>Importe</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%            for (Insumos b : lista) {
                %>
                <tr>
                    <td><%=b.getIdIngrediente()%></td>
                    <td><%=b.getNombre()%></td>
                    <td><%=b.getCantidad()%></td>
                    <td><%=b.getPrecio()%></td>
                    <td><%=(b.getCantidad() * b.getPrecio())%></td>
                    <td>
                        <a href="#" onclick="QuitarItem('<%=b.getIdIngrediente()%>')">
                            <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAABgAAAAYCAYAAADgdz34AAAAAXNSR0IArs4c6QAAARJJREFUSEu9leEZwTAQht+bBBNgAiswARvQSdQEmACbsAGTxBO9VJqWapvK0/5L7r27fPdF6HlJz/GpBRhYATNgor/N6ar/WeDyLcmPAANzYAsMa6q8A4nAuWpfJcBACqwbti8VSMIzJUDL4C7uTmDjQwoAbcupYebh9oXfrhBg+znoCLgLjFyMHKBq2XcM7o7nVfiAA7CMBDhKJu/3HJhM2+NIgKvANASYConVDqI9Y15fcYkm77eod0DMFt0ks5bCHfR+ydZ7ug7ZZ5nqZcUYtId4Bvlfq9Aq2jjpb2bndrV01JKTFlQUDoo6q62mzvwewKbRg+PDFGQVZnXtrOTmPZmVL1nJTSN5UCnMT17TBf4EYFVEGd7m3TsAAAAASUVORK5CYII="/>
                        </a>

                    </td>
                </tr>
                <%
                    total = total + (b.getCantidad() * b.getPrecio());
                    session.setAttribute("Total", total);
                %>

                <%
                    }

                %>
            </tbody>
        </table>
        <%}%>
    </div>
</div>
<div class="Operaciones2" style="margin: 100px 0">
    <div class="Operaciones_Busqueda2" style="display: flex;
         align-items: center; justify-content: center;">
        <span class="span-details"  style="margin-left: 100px">Sub Total</span>
        <input type="text" placeholder="Total Sin IGV" value="<%=total - (total * 0.18)%>" readonly style="width: 100px; margin: 0 20px" />
        <span class="span-details">IGV</span>
        <input type="text" placeholder="IGV" value="<%=total * 0.18%>" readonly  style="width: 100px; margin: 0 20px" />
        <span class="span-details">Total</span>
        <input type="text" placeholder="Total" value="<%=total%>" readonly style="width: 100px; margin: 0 20px"/>
        <input style="margin:0 10px;"
               type="button"
               name=""
               value="Cancelar"
               class="btn btn-primary"
               id="Cancelar"
               onclick="BtnCancelar();"
               />
        <input style="margin:0 10px;"
               type="button"
               name=""
               value="Generar Compra"
               class="btn btn-primary"
               id="GenerarVenta"
               onclick="BtnGenerarCompra();"
               />
    </div>
</div>