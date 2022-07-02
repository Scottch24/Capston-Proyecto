
<%@page import="ModeloDAO.daoVentas"%>
<%@page import="Modelo.Ventas"%>
<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.util.List"%>

<div class="details">
    <div class="recentOrders2" id="tablaCesta" >
        <%
            Ventas ven = new Ventas();
            daoVentas daoven = new daoVentas();

            List<Ventas> lista = daoven.Listar("");
        %>
        <table id="example" class=" table table-striped" style="width:100%">
            <thead>
                <tr>
                    <th>idVentas</th>
                    <th>idCliente</th>
                    <th>Cliente</th>
                    <th>Fecha Venta</th>
                    <th>Total</th>
                    <th>Estado</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    double total = 0;
                    for (Ventas b : lista) {
                %>
                <tr>
                    <td><%=b.getIdVentas()%></td>
                    <td><%=b.getIdCliente()%></td>
                    <td><%=b.getCliente()%></td>
                    <td><%=b.getFecha_Pedido()%></td>
                    <td><%=b.getTotal()%></td>
                    <td><%=b.getEstado()%></td>
                    <td>
                        <a href="#" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="VerDetalle('<%=b.getIdVentas()%>')">
                            Ver Detalle
                        </a>

                    </td>
                </tr>
                <%
                        total += b.getTotal();
                    }

                %>
            </tbody>
        </table>
    </div>
</div>
<div class="Operaciones2">
    <div class="Operaciones_Busqueda2">
        <span class="span-details">Ventas Totales</span>
        <input type="text" placeholder="Total" value="<%=total%>" readonly style="    width: 741px; text-align: center;"/>
    </div>
</div>