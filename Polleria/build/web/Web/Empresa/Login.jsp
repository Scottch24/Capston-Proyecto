<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio Sesion</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
                integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
                integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>

        <style>
            body{
                background: #ffe259;
                background: linear-gradient(to right, #000, black);
                color: white;
            }
            .bg{
                background-image: url(../img/NUEVA_CATERING.jpg);
                background-position: center center;
                background-size: cover;
                background-repeat: no-repeat;
            }
            .container{
                background: black;
            }
        </style>
        
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        
        <script>
           /* const expresiones={
                usuario: /^[a-zA-Z0-9\_\-]{4,16]$/, 
                //nombre: /^[a-zA-Z\s]{1,40]$/,
                password: /^.{4,12]$/ //,
                //correo: /^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+\.[a-zA-Z0-9-.]+$/,
                //telefono: /^\d{7,14}$/
           }*/ 
            function login() {
                var user = document.getElementById("txtUsuarios").value;
                var contra = document.getElementById("txtContra").value;
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/Web/Empresa/Consultas/DatosEmpleados/Login.jsp',
                    data: {usuario: user, contraseña: contra},
                    success: function (data) {
                        alert(data.trim());
                        if(user.length == 0) {
                                            alert("Campos vacios","","campos")
                                            document.getElementById("usuario").style.color = "red";           
                                            document.getElementById("contraseña").style.color = "red";
        };
                        if (data.trim() === "No Se Puedo Iniciar Sesion") {
                            swal("¡Usuario o Contraseña Incorrectas! ", "", "error")
                                    .then((value) => {
                                        
                                    
                                    });
                        } else {
                            swal(" Inicio De Sesion Exitoso ", "", "success")
                                    .then((value) => {
                                        window.location.href = "${pageContext.request.contextPath}/Web/Empresa/Ninicio.jsp";
                                    });
                                  localStorage.setItem('CodigoEmpleado',data.trim());
                        }
                    },
                    error: function (e) {
                        alert("error" + e);
                    }
                });
            }

        </script>
        
    </head>
    <body>
        <div class="container w-90 bg-dark mt-5 rounded shadow ">
            <div class="row align-items-stretch">
                <div class="col bg d-none d-lg-block col-md-5 col-lg-5 col-xl-6 rounded"></div>
                <div class="container col p-3 rounded-end">
                    <div class="text-end">
                        <img src="../img/Logo_pardos.jpg" style="width: 100px; height: 80px;" alt="">
                    </div>

                    <h1 class="fw-bold text-center py-5"> Bienvenido</h1>

                    <form action="Login.jsp" method="post">
                        <div class="mb-4">
                            <label id="usuario" for="usuario" class="form-label">Usuario: </label>
                            <input type="text" class="form-control" name="txtUsuarios" id="txtUsuarios" autoComplete="current-password"  placeholder="Usuario">
                        </div>
                        <div class="mb-4">
                            <label id="contraseña" for="password" class="form-label">Contraseña: </label>
                            <input type="password" class="form-control" name="txtContra" id="txtContra" autoComplete="current-password" placeholder="Contraseña">
                        </div>
                        <div class="mb-4 form-check">
                            <input type="checkbox" name="connected" class="form-check-input">
                            <label for="connected" class="form-check-label">Mantenerme Conectado</label>
                        </div>
                        <div class="d-grid">
                            <button type="button" class="btn btn-warning" onclick="login()" id="Grabar" name="accion">Iniciar Sesion</button>
                        </div>

                        <div class="my-3">
                            
                            <span><a href="${pageContext.request.contextPath}/index.jsp" class="btn btn-light btn-sm">Regresar</a></span>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
