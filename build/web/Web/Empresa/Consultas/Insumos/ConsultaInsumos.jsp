
<%@page import="ModeloDAO.daoInsumos"%>
<%@page import="Modelo.Insumos"%>
<%@page import="java.util.List"%>
<%

    Insumos pro = new Insumos();
    daoInsumos daoPro = new daoInsumos();

    List<Insumos> lista = daoPro.Listar();

%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>id</th>
            <th>Insumo</th>
            <th>Vencimiento</th>
            <th>Marca</th>
            <th>Ultima Actualizacion</th>
            <th>Estado</th>
            <th></th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%        for (Insumos c : lista) {
        %>
        <tr>
            <td><%=c.getIdIngrediente()%></td>
            <td><%=c.getNombre()%></td>
            <td><%=c.getVencimiento()%></td>
            <td><%=c.getMarca()%></td>
            <td><%=c.getFechaActualiza()%></td>
            <td><span class="status <%=c.getEstado()%>"><%=c.getEstado()%></span></td>
            <td><a href="#" data-bs-toggle="modal" data-bs-target="#staticBackdrop" value="Editar" onclick="abrirModal('<%=c.getIdIngrediente()%>', '<%=c.getNombre()%>', '<%=c.getVencimiento()%>', '<%=c.getIdMarca()%>','<%=c.getPrecio()%>')">
                    <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer"  src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAAXNSR0IArs4c6QAAAiNJREFUaEPtmd1NwzAUhc9tB6Ab0BHKG2p4KBMwAnQBEjZgA1wWoCOwAUUieaWbUJ6RepEjKkXBf3HsNJWS18TO+c79ie0QTvyiE9ePAeDYEexlBJKM1wxsCkFrm0G9A5DiwbiVwpmwtEEYAS4zno4YTwTMAExtbpjuM+MbIywKQVvdc1Xxh2dsEFoAKX7M+AQwaSO8dNJTvAuEFiDJ+BWMmy7EzzO+I8aLMYKadNIDpPzV1n0X5w+iVelTB1KlkwmAqxPkK4pe8DaIXgHItFF1GB2ErpiPEoGKyHW+omU9VeoQpk7UOYDCYSOEdxtNUg5eA4YcV0JcZbz4ELQxdafOImArUABKCFsb7wTAQfxBZ2OI6AANxJcQRLi2pU01KlEBmoq3FawqnaIBdCG+jJh2ZdiiC4UWv8h4shG06yQCMcT/MN7yFV1EB4glHsBMtxYLlkIxxUvnowKEFi8FJynLzZTcCZZXNIB5xoIYqe2L6bK7qs7hupRpnUL1F/nsqlRjegfQ9CPVK4Cm4v9qwGk1HD2FfMT3BsBXfD8ACA+5IOHanf5tKx2XMq1TyFegbVxnRWwT4nt/AHB1wNdh2zjX9w81YHPS937rCMzveUeEM18BIcfJQ+LimZTH/NGP10OAMOG9ELRotCMr/87sse1DFExHLdZfTGNAYI8ZCOch3Gwyh3R+BDyazomin/k3Eezz7ADg41rIMUMEQrrpM9fJR+AXBILJQFYUUJMAAAAASUVORK5CYII="/>
                </a>
            </td>
            <td><a href="#" onclick="Eliminar('<%=c.getIdIngrediente()%>')">
                    <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAAXNSR0IArs4c6QAAA49JREFUaEPtWcFV20AQ/SM/LN3CMZEPlioIVBBSAaSCQAWBCjAVxFSAUwGkgkAFQAWSDxY5wk2ChyZvbSsIeyXNyrITv4cuPJ5nZ/6fmZ2Z3SWs+Udrjh9vBP51BBuLQNDZ2LK4tcvgLQAeQOpv7uMbACEzLmGlV/7oSf2/8LcQgeC941kt/sZMexPQRl9IxBfpM536v+PQaGVOuBaBwMOm9WQfM9NhXcP5dUTcTzeSEz/Evak+YwKB294j0BlAm6bGyuX5nsEHfvR4YaLXiMCwY39vyutFIFU0uqPkSEpCREClDD3ayusq15f+ETBI2/GRJKVEBELXPl8V+Mw7ikQ3ig+qvFVJIOjYfWL6VqVoGb8z8ak/SkoLRSmByYa1zpcBTqqTkX4p29iFBKZ5HzRfbaTQMzm+53biF+2HQgJD1xkw8NXU3DLky1JJS0B1WLIQGIEhXIHxSbTGRHaqkFP4uo6tJ2C4cZlw4I/igSRqBPzoRvF+0HH2iXEmIgyAgRM/inuz8loCoeso74tmmwx8priMRAY+kzUkEXpR7FcSUFMlceta5BnGpXcXf56V1ZGYBZ+tCT84v0DYkdhjet6enWLnIhC4To+AY4lCJVPUcPIkisAPXeeMgX2pLWY+8u+Sfl5+jsDQtS8YtCtVWkVC/a5yXhMlI/ATO/yzGyWvxpk5AqFrX88fRqrpSFu/0mTq+RfrfONFyXZpBELX4Wq4egkJifrgJza9KH7ldE0E6hMoS6fFPP/isFUQGNd5XYwkfaIq+kslUFRt8qAWJSEgYN8A9LHKE5qGUuh5SZ+Q2eNbL0pe3XY0VUa14NWGnZbRuYNJnUiIymiNRlYIPmtSkmYniYCokRmNEoB2PtGVyiISZnOXYJRQnghdR100dSVemQVWVudNZDW2h14Uzw2YjYzTGTBJkzKRzZMwGqdrHWgAFTXRCK6CbCA75mF0oJl2zfU9UioC00N9CNA7yV5Yngw/cDvxjA/1YxLrfK2SeXStL7YyEnW65qIpJZmrptNvtanxe8Cj01/VPZECn7bjw8Yud1eZTpL70LzLKy93Z+MzfeAYNF+d+IHB+0t94PgbCQ+beLJ7Td1aK69jI+lJUkYzxlfvgSIJ1bHR4kOaPPKJZqecriEDA6QYrPyRT0dITbFIrR2LsMOTZ9aZQxHfEhCmk2fWy//imbV+7JpbabyJmzPdjKY3As34sb6WPwdo10D084oVAAAAAElFTkSuQmCC"/>
                </a>
            </td>
        </tr>
        <%
            }
        %>
    </tbody>
</table>

