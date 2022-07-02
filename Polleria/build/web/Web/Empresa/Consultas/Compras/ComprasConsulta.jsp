
<%@page import="ModeloDAO.daoCompra"%>
<%@page import="Modelo.Compras"%>
<%@page import="ModeloDAO.daoVentas"%>
<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.util.List"%>

<div class="details">
    <div class="recentOrders2" id="tablaCesta" >
        <%
            Compras ven = new Compras();
            daoCompra daoven = new daoCompra();

            List<Compras> lista = daoven.Listar("");
        %>
        <table  id="example" class=" table table-striped" style="width:100%">
            <thead>
                <tr>
                    <th>idCompra</th>
                    <th>Empleado</th>
                    <th>Razon Social</th> 
                    <th>RUC</th>
                    <th>Fecha Venta</th>
                    <th>Total</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    double total = 0;
                    for (Compras b : lista) {
                %>
                <tr>
                    <td><%=b.getIdCompra()%></td>
                    <td><%=b.getEmpleado()%></td>
                    <td><%=b.getRazonSocial()%></td>
                    <td><%=b.getRUC()%></td>
                    <td><%=b.getFecha_Compra()%></td>
                    <td><%=b.getTotal_Compra()%></td>
                    <td>
                        <a href="#" data-bs-toggle="modal" data-bs-target="#staticBackdrop" onclick="VerDetalle('<%=b.getIdCompra()%>')">
                            Ver Detalle
                        </a>

                    </td>
                </tr>
                <%
                        total += b.getTotal_Compra();
                    }

                %>
            </tbody>
        </table>
    </div>
</div>
<div class="Operaciones2">
    <div class="Operaciones_Busqueda2">
        <span class="span-details">Compras Totales</span>
        <input type="text" placeholder="Total" value="<%=total%>" readonly style="    width: 741px; text-align: center;"/>
    </div>
</div>