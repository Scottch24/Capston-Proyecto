<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoProductos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bebidas</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/pushbar.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/style.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/Targetas.css"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/Web/img/Logo_pardos.jpg">
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Cesta/MethodAjax.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script>
            function MostrarProductos() {
                $.ajax({
                    url: "Consultas/Productos/Mostrar.jsp",
                    type: 'POST',
                    data: {Cagoria: "Bebidas"},
                    success: function (data) {
                        document.getElementById("Items_Mostrar").innerHTML = data;
                    },
                    error: function (returne) {
                        alert("error carrito" + returne);
                    }
                });
            }

            function BuscarProductos() {
                var leta = document.getElementById("buscador").value;
                $.ajax({
                    url: "Consultas/Productos/Buscar.jsp",
                    type: 'POST',
                    data: {Cagoria: "Bebidas",
                        Letra: leta},
                    success: function (data) {
                        document.getElementById("Items_Mostrar").innerHTML = data;
                    },
                    error: function (returne) {
                        alert("error carrito" + returne);
                    }
                });
            }
        </script>
    </head>
    <body>
        <div class="contenedor">
            <!--Header-->
            <jsp:include page="../Config/Header.jsp"/> 
            <main class="main-pizzas">
                <div class="Main-Contenedor">
                    <h2><img src="../img/plato.png" alt=""></h2>
                    <div class="contenido-hero">
                        <div class="form_buscar">
                            <input class="u-full-width" placeholder="¿Busque El plato De Su Preferencia?" type="search" id="buscador" onkeydown="BuscarProductos()">
                            <input type="submit" class="submit-buscador">
                        </div>
                    </div>
                    <div class="Items">
                        <form action="PardosBrasa.jsp" method="post" class="form-productos" id="Items_Mostrar">
                            
                        </form>
                    </div>
                </div>
            </main>

            <!--Footer-->
            <jsp:include page="../Config/Footer.jsp"/> 
            <jsp:include page="../Config/Navbar.jsp"/> 
        </div>
        <script>
            listaCesta();
            MostrarProductos();
        </script>
        <!--Scripts-->
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/pushbar.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Script.js"></script>
    </body>

</html>