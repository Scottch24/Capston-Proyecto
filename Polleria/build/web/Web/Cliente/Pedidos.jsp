<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.util.List"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Pedidos</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/pushbar.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/style.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/Targetas.css"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/Web/img/Logo_pardos.jpg">
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Cesta/MethodAjax.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script>

            function Registrar() {
                var fecha = document.getElementById("Fecha").value;
                var vLatitu = document.getElementById("txtLatitud").value;
                var vLongitud = document.getElementById("txtLongitud").value;

                var vSubTotal = document.getElementById("txtSubTotal").value;
                var vigv = document.getElementById("txtIGV").value;
                var vTotal = document.getElementById("txtTotalPagar").value;

                alert(fecha + vLatitu + vLongitud + vSubTotal + vigv + vTotal);
                datos = {
                    FechaPedido: fecha,
                    Longitud: vLatitu,
                    Latitud: vLongitud,
                    SubTotal: vSubTotal,
                    IGV: vigv,
                    Total: vTotal
                };
                $.ajax({
                    data: datos,
                    url: "CRUD/Pedidos/Registrar.jsp",
                    type: 'POST',
                    success: function (data) {
                        alert($.trim(data));
                        if ($.trim(data) == "Inicie Sesion Primero...") {
                            window.location.replace("http://localhost:8080/Proyecto_Web/Cliente/InicioSesion.jsp");
                        } else {
                            location.reload();
                        }
                    }, error: function (data) {
                        alert(data);
                    }
                });
            }

        </script>
    </head>

    <body>
        <div class="contenedor">
            <!--Header-->
            <jsp:include page="../Config/Header.jsp"/> 

            <main style="    height: auto; width: 100%;">

                <div style="        height: auto;
                     overflow: auto;">
                    <input type="text" name="Fecha" id="Fecha" required readonly style="margin: 5px auto;display: block; text-align: center;">
                    <%
                        DecimalFormat df = new DecimalFormat("0.00");
                        daoCesta c = (daoCesta) session.getAttribute("Cesta2");
                        double total = 0.0;
                        double igv = 0.0;
                        double SubTotal = 0.0;
                        if (c == null) {
                    %>
                    <h2>Caja De Productos Vacia</h2>
                    <%
                    } else {

                    %>
                    <h2 style="    text-align: center;
                        font-size: 40px;
                        margin: 10px;">Caja De Productos</h2>
                    <table>
                        <thead style="    background: #1D2124;">
                            <tr>
                                <th></th>
                                <th>Producto</th>
                                <th>Precio</th>
                                <th>Cantidad</th>
                                <th>Importe</th>

                            </tr>
                        </thead>
                        <tbody>
                            <%                                List<Productos> lista = c.getLista();

                                for (Productos b : lista) {
                            %>
                            <tr>
                                <td><img src="${pageContext.request.contextPath}/SevProductosImg?idProducto=<%=b.getIdProductos()%>" alt="alt" width="60px""/></td>
                                <td><%=b.getNombre()%></td>
                                <td><%=b.getPrecio()%></td>
                                <td><%=b.getStock()%></td>
                                <td><%=b.getPrecio() * b.getStock()%></td>

                            </tr>
                            <%

                                        SubTotal = SubTotal + (b.getPrecio() * b.getStock());
                                    }
                                    igv = SubTotal * 0.18;
                                    total = igv + SubTotal;
                                }
                            %>
                        </tbody>
                    </table>
                </div>
                <div style="      display: inline-flex;
                     align-items: baseline;
                     margin-left: 100px;">
                    <span class="barra" style="font-size: 18px; margin: 0 5px">SubTotal:</span><input type="text" name="" id="txtSubTotal"  step="0.01" value="<%=df.format(SubTotal)%>" required readonly>
                    <span class="barra"  style="font-size: 18px; margin: 0 5px">IGV(18%):</span><input type="text" name="" id="txtIGV"  step="0.01" value="<%=df.format(igv)%>" required><span class="barra" readonly></span>
                    <span class="barra" style="font-size: 18px; margin: 0 5px">Total:</span><input type="text" name="" id="txtTotalPagar"  step="0.01" value="<%=df.format(total)%>" required>
                </div>
                <input class="Registrar-ope" id="" type="submit" name="" value="Realizar Pago" onclick="Registrar()">
                <div style="height: 400px; margin: 40px 50px;">
                    <div style="padding-left: 550px;">
                        <label for="latitud">Latitud</label>
                        <input type="text" name="" id="txtLatitud" class="form-control" readonly>
                        <label for="Longitud">Longitud</label>
                        <input type="text" name="" id="txtLongitud" class="form-control" readonly>
                    </div>
                    <div id="map" style="    height: 300px;
                         position: relative;
                         overflow: hidden;
                         width: 100%;
                         border-radius: 10px;
                         "></div>
                </div>

            </main>

            <!--Footer-->

            <jsp:include page="../Config/Footer.jsp"/> 
            <jsp:include page="../Config/Navbar.jsp"/> 


        </div>

        <script
            src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCWB8RyoPxJ-dFkL7djh8Hc-EEnG0mCMqo&callback=iniciarMapa&libraries=&v=weekly"
        async></script>
        <script>

                    function iniciarMapa() {
                        var latitud = -11.901920279484544;
                        var longitud = -77.03862774372102;

                        coordernadas = {
                            lng: longitud,
                            lat: latitud
                        }

                        initMap(coordernadas);
                    }

                    function initMap(coordernadas) {
                        let mapa = new google.maps.Map(document.getElementById("map"), {
                            center: new google.maps.LatLng(coordernadas.lat, coordernadas.lng),
                            zoom: 18
                        });

                        marcador = new google.maps.Marker({
                            map: mapa,
                            draggable: true,
                            position: new google.maps.LatLng(coordernadas.lat, coordernadas.lng)
                        });

                        marcador.addListener('dragend', function (event) {
                            document.getElementById("txtLatitud").value = this.getPosition().lat();
                            document.getElementById("txtLongitud").value = this.getPosition().lng();

                        });

                    }

                    var ActualizarHora = function () {
                        var fecha = new Date(),
                                horas = fecha.getHours(),
                                ampn,
                                minutos = fecha.getMinutes(),
                                segundos = fecha.getSeconds(),
                                dia = fecha.getDate(),
                                mes = fecha.getMonth() + 1,
                                year = fecha.getFullYear();

                        fechas = document.getElementById('Fecha');

                        if (dia < 10) {
                            dia = "0" + dia;
                        }

                        if (minutos < 10) {
                            minutos = "0" + minutos;
                        }

                        if (segundos < 10) {
                            segundos = "0" + segundos;
                        }

                        if (mes < 10) {
                            mes = "0" + mes;
                        }

                        fechas.value = year + "-" + mes + "-" + dia + " " + horas + ":" + minutos + ":" + segundos;
                    }
                    ActualizarHora();
                    var Intevalo = setInterval(ActualizarHora, 1000);
        </script>
        <script>

            listaCesta();
        </script>
        <!--Scripts-->
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/pushbar.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Script.js"></script>

    </body>

</html>