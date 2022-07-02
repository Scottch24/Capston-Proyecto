<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/Estilos.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
                integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
                integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
        crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <!-- Compiled and minified CSS -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Empresa/Empleados/MethodAjax.js"></script>
        <script src="${pageContext.request.contextPath}/Web/js/Empresa/SliderbarClose/SliderClose.js"></script>

        <script>
            function soloLetras(e) {
                var key = e.keyCode || e.which,
                        tecla = String.fromCharCode(key).toLowerCase(),
                        letras = " áéíóúabcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZÁÉÍÓÚ",
                        especiales = [8, 37, 39, 46],
                        tecla_especial = false;
                if (letras.indexOf(tecla) == -1 && !tecla_especial) {
                    return false;
                }
            }
        </script>

        <script type="text/javascript">
            function valideKey(evt) {

                // code is the decimal ASCII representation of the pressed key.
                var code = (evt.which) ? evt.which : evt.keyCode;

                if (code == 8) { // backspace.
                    return true;
                } else if (code >= 48 && code <= 57) { // is a number.
                    return true;
                } else { // other keys.
                    return false;
                }
            }
        </script>
    </head>
    <body>

        <div class="sidebar">
            <jsp:include page="../Config/Navegacion.jsp"/> 
        </div>


        <section class="home-section" style="padding: 100px">
            <div class="home-content">
                <i class="bx bx-menu"></i>
                <h5 class="title">Empleados</h5>
                <i class='bx bxs-user-account bx-md' ></i>
            </div>
            <div class="home-Contenido">
                <div class="Operaciones">
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#staticBackdrop"  onclick="nuevo()" >
                        Nuevo
                    </button>
                </div>
                <div class="details">
                    <div class="recentOrders" id="recentOrders">

                    </div>
                </div>
            </div>
        </section>

        <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="true" tabindex="-1"
             aria-labelledby="staticBackdropLabel" aria-hidden="true" style="width: 1500px; height: 700px; top: 50px;">
            <div class="modal-dialog modal-dialog-scrollable" style="width: 1500px; height: 500px; max-width: 1500px;  
                 margin: 10px auto; max-height: 1600px !important;">

                <div class="modal-content" style="width: 1450px; margin: 10px auto; padding-bottom: 0;">
                    <div class="modal-header" style="padding: 0">
                        <h5 class="modal-title" id="staticBackdropLabel" >Registrar Empleados</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body" style="padding: 0;">
                        <form action="${pageContext.request.contextPath}/Web/Empresa/NEmpleados.jsp" method="post" id="form"  enctype="multipart/form-data">
                            <fieldset class="row gy-1 gx-1 align-items-center">
                                <div class="form-group col-6" id="cajaId">
                                    <label class="col-form-label" class="badge rounded-pill p-1 bg-secondary">Código del
                                        Empleado: </label>
                                    <input path="idEmpleado" class="form-control" type="text"  name="txtIdEmpleado" id="txtIdEmpleado" placeholder="ID De Empleado" autofocus="true" />
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label"
                                           class="badge rounded-pill p-1 bg-secondary">Nombre:</label>
                                    <input path="Nombre" class="form-control" type="text" name="txtNombre" id="txtNombre" placeholder="Nombre De Empleado" onkeypress="return soloLetras(event)" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label" class="badge rounded-pill p-1 bg-secondary">Apellido:
                                    </label>
                                    <input path="Apellido" class="form-control" type="text"  name="txtApellido" id="txtApellido" placeholder="Apellido De Empleado" onkeypress="return soloLetras(event)" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label" class="badge rounded-pill p-1 bg-secondary">Fecha
                                        Nacimiento: </label>
                                    <input path="Fecha_Nacimiento" class="form-control" type="date" name="txtFecha" id="txtFecha" placeholder="Fecha De Nacimiento" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label"
                                           class="badge rounded-pill p-1 bg-secondary">Teléfono</label>
                                    <input path="Telefono" class="form-control" type="tel" name="txtTelefono" id="txtTelefono" placeholder="Telefono De Empleado" onkeypress="return valideKey(event);" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6" >
                                    <label class="col-form-label" class="badge rounded-pill p-2 bg-secondary">Nro de
                                        documento: </label>
                                    <input path="nroDocumento" class="form-control" type="number" name="txtDNI" id="txtDNI" placeholder="DNI De Empleado" onkeypress="return valideKey(event);" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6" id="SelectedsCat">
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label" class="badge rounded-pill p-1 bg-secondary">Correo:
                                    </label>
                                    <input path="Correo" class="form-control" type="email" name="txtCorreo" id="txtCorreo" placeholder="Correo De Empleado"  required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label"
                                           class="badge rounded-pill p-2 bg-secondary">Usuario</label>
                                    <input path="Usuario" class="form-control" type="text" name="txtUsuario" id="txtUsuario" placeholder="Usuario De Empleado" required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <div class="form-group col-6">
                                    <label class="col-form-label"
                                           class="badge rounded-pill p-2 bg-secondary">Contraseña</label>
                                    <input path="Sucursal" class="form-control" type="text" name="txtContra" id="txtContra" placeholder="Contraseña De Empleado"  required>
                                    <div class="valid-feedback">
                                        Correcto!
                                    </div>
                                    <div class="invalid-feedback">
                                        Por favor, elija un nombre de usuario.
                                    </div>
                                </div>
                                <input type="button" class="btn btn-primary" id="Grabar" name="accion" value="Guardar" onclick="Registrar()">
                                <input type="button" class="btn btn-primary" id="Actualizar"  name="accion" value="Actualizar" onclick="Actualizado()">
                            </fieldset>

                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Enlaces -->

        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
        <script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
        <script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap5.min.js"></script>

        <script src="https://cdn.jsdelivr.net/npm/popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"></script>
        <script>
                                    $(document).ready(function () {
                                        $('#example').DataTable();
                                    });
        </script>
        <script>
            (function () {
                'user strict'

                var forms = document.querySelectorAll('.needs-validation')

                Array.prototype.slice.call(forms).forEach(function (form) {
                    form.addEventListener('submit', function (event) {
                        if (!form.checkValidity()) {
                            event.preventDefault()
                            event.stopPropagation()
                        }
                        form.classList.add('was-validated')
                    }, false)
                })

            })()
        </script>
        <style>
            .modal {
                max-height: 1600px !important;
            }

            .modal-content {
                max-height: 1600px !important;
            }
        </style>

    </body>
</html>
