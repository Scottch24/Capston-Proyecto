
<%@page import="ModeloDAO.daoCategoriaProductos"%>
<%@page import="Modelo.CategoriaProductos"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Productos"%>
<%

    CategoriaProductos pro = new CategoriaProductos();
    daoCategoriaProductos daoPro = new daoCategoriaProductos();

    List<CategoriaProductos> lista = daoPro.Listar();


%>
<table id="example" class=" table table-striped" style="width:100%">
    <thead>
        <tr>
            <th>Id</th>
            <th>Categoria</th>
            <th>Ultima Actualizacion</th>
            <th>Estado</th>
            <th></th>
        </tr>
    </thead>
    <tbody>
        <%        for (CategoriaProductos c : lista) {
        %>
        <tr>
            <td><%=c.getIdCategoria()%></td>
            <td><%=c.getDescripcion()%></td>
            <td><%=c.getUltimaactualizacion()%></td>
            <td class="statusid"><span class="status <%=c.getEstado()%>" ><%=c.getEstado()%></span></td>
            <td><a href="#" onclick="Eliminar('<%=c.getIdCategoria()%>')">
                    <img style="width:40px; height: 40px; transform: scale(1.2); cursor: pointer" src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADAAAAAwCAYAAABXAvmHAAAAAXNSR0IArs4c6QAAA49JREFUaEPtWcFV20AQ/SM/LN3CMZEPlioIVBBSAaSCQAWBCjAVxFSAUwGkgkAFQAWSDxY5wk2ChyZvbSsIeyXNyrITv4cuPJ5nZ/6fmZ2Z3SWs+Udrjh9vBP51BBuLQNDZ2LK4tcvgLQAeQOpv7uMbACEzLmGlV/7oSf2/8LcQgeC941kt/sZMexPQRl9IxBfpM536v+PQaGVOuBaBwMOm9WQfM9NhXcP5dUTcTzeSEz/Evak+YwKB294j0BlAm6bGyuX5nsEHfvR4YaLXiMCwY39vyutFIFU0uqPkSEpCREClDD3ayusq15f+ETBI2/GRJKVEBELXPl8V+Mw7ikQ3ig+qvFVJIOjYfWL6VqVoGb8z8ak/SkoLRSmByYa1zpcBTqqTkX4p29iFBKZ5HzRfbaTQMzm+53biF+2HQgJD1xkw8NXU3DLky1JJS0B1WLIQGIEhXIHxSbTGRHaqkFP4uo6tJ2C4cZlw4I/igSRqBPzoRvF+0HH2iXEmIgyAgRM/inuz8loCoeso74tmmwx8priMRAY+kzUkEXpR7FcSUFMlceta5BnGpXcXf56V1ZGYBZ+tCT84v0DYkdhjet6enWLnIhC4To+AY4lCJVPUcPIkisAPXeeMgX2pLWY+8u+Sfl5+jsDQtS8YtCtVWkVC/a5yXhMlI/ATO/yzGyWvxpk5AqFrX88fRqrpSFu/0mTq+RfrfONFyXZpBELX4Wq4egkJifrgJza9KH7ldE0E6hMoS6fFPP/isFUQGNd5XYwkfaIq+kslUFRt8qAWJSEgYN8A9LHKE5qGUuh5SZ+Q2eNbL0pe3XY0VUa14NWGnZbRuYNJnUiIymiNRlYIPmtSkmYniYCokRmNEoB2PtGVyiISZnOXYJRQnghdR100dSVemQVWVudNZDW2h14Uzw2YjYzTGTBJkzKRzZMwGqdrHWgAFTXRCK6CbCA75mF0oJl2zfU9UioC00N9CNA7yV5Yngw/cDvxjA/1YxLrfK2SeXStL7YyEnW65qIpJZmrptNvtanxe8Cj01/VPZECn7bjw8Yud1eZTpL70LzLKy93Z+MzfeAYNF+d+IHB+0t94PgbCQ+beLJ7Td1aK69jI+lJUkYzxlfvgSIJ1bHR4kOaPPKJZqecriEDA6QYrPyRT0dITbFIrR2LsMOTZ9aZQxHfEhCmk2fWy//imbV+7JpbabyJmzPdjKY3As34sb6WPwdo10D084oVAAAAAElFTkSuQmCC"/>
                </a>
            </td>
        </tr>

    <%
        }
    %>
</tbody>
</table>

