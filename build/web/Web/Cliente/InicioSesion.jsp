
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Inicio Sesion</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/pushbar.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/style.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/Targetas.css"/>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/Web/img/Logo_pardos.jpg">
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Cesta/MethodAjax.js"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script>
            
        </script>
    </head>
    <body>
        <div class="contenedor">
            <!--Header-->

            <jsp:include page="../Config/Header.jsp"/> 
            <!--Main Inicio Sesion-->

            <div class="div-body">
                <main class="main-login">
                    <div class="Contenedor__todo--login">
                        <div class="caja_trasera--login">
                            <div class="Caja__trasera-login">
                                <h3>¿Ya Tienes Una Cuenta?</h3>
                                <p>Inicia Sesion para entrar en la pagina</p>
                                <button id="btn__iniciar-sesion">Iniciar Sesion</button>
                            </div>
                            <div class="caja__trasera-register">
                                <h3>¿Aun no tienes una cuenta?</h3>
                                <p>Registrate para que puedas iniciar sesion</p>
                                <button id="btn__registrarse">Registrarse</button>
                            </div>
                        </div>

                        <div class="contenedor__login-register">
                            <form action="InicioSesion.jsp" method="post" class="formulario__login">
                                <h2>Iniciar Sesion</h2>
                                <input type="text" id="txtUsuarior" name="txtUsuario"  placeholder="Usuario" required>
                                <input type="text" id="txtCont" name="txtCont"  placeholder="Contraseña" required>
                                <button type="button" onclick="IniciarSesion()">Entrar</button>
                            </form>
                            <form action="InicioSesion.jsp" class="formulario__register" id="form" method="post" enctype="multipart/form-data">
                                <h2>Registrarse</h2>
                                <input type="text" placeholder="Nombre" id="txtNombre" required>
                                <input type="text" placeholder="Apellido" id="txtApellido" required>
                                <input type="text" placeholder="Telefono" id="txtTelefono" required>
                                <input type="text" placeholder="DNI" id="txtDNI" required>
                                <input type="text" placeholder="Usuario" id="txtUsuario" required>
                                <input type="password" placeholder="Contraseña" id="txtContra" required>
                                <button type="button" name="accion" onclick="RegistrarCliente()">Registrarse</button>
                            </form>
                        </div>

                    </div>
                </main>
            </div>

            <jsp:include page="../Config/Footer.jsp"/> 
            <jsp:include page="../Config/Navbar.jsp"/> 

        </div>
        <script>
            listaCesta();
        </script>
        <!--Scripts-->
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/pushbar.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Script.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Cliente/Login/MethodAjax.js"></script>
    </body>

</html>