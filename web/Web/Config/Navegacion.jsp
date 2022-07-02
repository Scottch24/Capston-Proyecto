<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            @media screen and (max-width: 1600px) {
                .container {
                    max-width: 100% !important;
                    width: 91% !important;
                }
            }
            .navbar{
                background: black;
            }
        </style>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script>

            function MandarDatos() {
                var cod = localStorage.getItem('CodigoEmpleado');
                $.ajax({

                    url: "${pageContext.request.contextPath}/Web/Empresa/Consultas/DatosEmpleados/MostrarDatos.jsp",
                    data: {codigof: cod},
                    type: 'POST',
                    success: function (datas) {
                        document.getElementById("datosEmpleados").innerHTML = datas;
                    },
                    error: function (e) {
                        alert("error" + e);
                    }
                });
            }

        </script>
    </head>
    <body>
        <nav class="navbar navbar-expand-md navbar-dark fixed-top navbar-main">
            <div class="container">
                <a href="#" class="navbar-brand"> <img src="${pageContext.request.contextPath}/Web/img/Logo_pardos.jpg" alt="" style="width: 80px; height: 60px;"> </a>
                <button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#mainNav" aria-controls="mainNav" aria-expanded="false" aria-label="Barra de navegacion">
                    <span class="navbar-toggle-icon"></span> </button> 
                <div class="collapse navbar-collapse" id="mainNav">
                    <div class="nav ms-auto" style="max-width: 100%; width: 100%; justify-content: center;align-items: center">
                        <a href="${pageContext.request.contextPath}/Web/Empresa/Ninicio.jsp" class="nav-link">Inicio</a>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Empleados </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NEmpleados.jsp">Ver</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NCargo.jsp">Cargos</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Productos </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NProducto.jsp">Ver</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NCategoria.jsp">Categorias</a></li>
                            </ul>
                        </li>
                        <a href="${pageContext.request.contextPath}/Web/Empresa/NProveedores.jsp" class="nav-link">Proveedores</a>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Insumos </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/Ninsumos.jsp">Ver</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NMarca.jsp">Marcas</a></li>
                            </ul>
                        </li>
                        <a href="${pageContext.request.contextPath}/Web/Empresa/NClientes.jsp" class="nav-link">Clientes</a>
                        <a href="${pageContext.request.contextPath}/Web/Empresa/NCompras.jsp" class="nav-link">Compras</a>
                        <a href="${pageContext.request.contextPath}/Web/Empresa/NVentas.jsp" class="nav-link">Ventas</a>
                        <li class="nav-item dropdown ">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false"> Reportes </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NHistorialVentas.jsp">Reporte Ventas</a></li>
                                <li><a class="dropdown-item" href="${pageContext.request.contextPath}/Web/Empresa/NHistorialCompra.jsp">Reporte Compras</a></li>
                            </ul>
                        </li>
                        <li class="nav-item" id="datosEmpleados"> </li>
                        <a href="${pageContext.request.contextPath}/Web/Empresa/Login.jsp" class="nav-link">Salir</a>
                    </div>
                </div>
            </div>
                    
        </nav>
                 
        <script>
            MandarDatos();
        </script>
        
    </body>
     
</html>
