<%-- 
    Document   : index
    Created on : 18/06/2021, 01:02:14 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Inicio</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/pushbar.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/style.css"/>
        
        <script>

            function listaCesta() {
                $.ajax({
                    url: "Web/Cliente/Consultas/Cesta/MostrarCesta.jsp",
                    type: 'POST',
                    success: function (data) {
                        document.getElementById("Caja_Carrito").innerHTML = data;
                        listaTotal();
                        listaTotalView();
                    },
                    error: function (returne) {
                        alert("error carrito" + returne);
                    }
                });
            }

            function listaTotalView() {
                $.ajax({
                    url: "Web/Cliente/Consultas/Cesta/MostrarTotalView.jsp",
                    type: 'POST',
                    success: function (data) {
                        document.getElementById("TotalView").innerHTML = data;
                    },
                    error: function (returne) {
                        alert("error carrito" + returne);
                    }
                });
            }

            function listaTotal() {
                $.ajax({
                    url: "Web/Cliente/Consultas/Cesta/MostrarTotalCesta.jsp",
                    type: 'POST',
                    success: function (data) {
                        document.getElementById("total_Carrito").innerHTML = data;
                    },
                    error: function (returne) {
                        alert("error carrito Mostrar Total Cesta" + returne);
                    }
                });
            }

            function retirar(codigo) {
                datos = {ope: "2",
                    codigo: codigo};
                $.ajax({
                    data: datos,
                    type: 'POST',
                    url: "Web/Cliente/Consultas/Cesta/AgregarCesta.jsp",
                    success: function (data) {
                        listaCesta();

                    }
                });
            }
        </script>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <!--Header-->
            <jsp:include page="Web/Config/Header.jsp"/> 
    </head>
    
    
    <body>
        
        <div class="contenedor">           
            <!--Main-->
            <div class="contenedor-slider">
                <div class="slider">
                    <div class="slides">
                        <input type="radio" name="radio-btn" id="radio1" >
                        <input type="radio" name="radio-btn" id="radio2" >
                        <input type="radio" name="radio-btn" id="radio3" >
                        <input type="radio" name="radio-btn" id="radio4" checked>
                        
                        <div class="slide first">
                            <a href=""><img src="Web/img/5696a060-c3a0-11eb-b8e1-2b768abd236e.jpg" alt="" ></a>
                        </div>
                        <div class="slide ">
                            <a href=""><img src="Web/img/d77bd400-7e02-11ec-8844-01f830c8dead.png" alt=""></a>
                        </div>
                        <div class="slide ">
                            <a href=""><img src="Web/img/5696a060-c3a0-11eb-b8e1-2b768abd236e.jpg" alt="" ></a>
                        </div>
                        <div class="slide ">
                            <a href=""><img src="Web/img/imagen1.jpeg" alt=""></a>
                        </div>    
                        
                        

                        <div class="navigation-auto">
                            <div class="auto-btn1"></div>
                            <div class="auto-btn2"></div>
                            <div class="auto-btn3"></div>
                            <div class="auto-btn4"></div>
                        </div>
                    </div>
                    <div class="navigation-manual">
                        <label for="radio1" class="manual-btn"></label>
                        <label for="radio2" class="manual-btn"></label>
                        <label for="radio3" class="manual-btn"></label>
                        <label for="radio4" class="manual-btn"></label>
                    </div>
                </div>
            </div>
        </div>
        
        
        
    </body>
    
         <!--Scripts-->
        <script>
            listaCesta();
        </script>
        <script src="Web/js/Cliente/pushbar.js"></script>
        <script src="Web/js/Cliente/Script.js"></script>
    
    <footer>
        <!--Footer-->

        <jsp:include page="Web/Config/Footer.jsp"/> 
        <jsp:include page="Web/Config/Navbar.jsp"/> 
    </footer>

</html>