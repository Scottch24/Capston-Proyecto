
/* global swal */

function nuevo() {
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    //document.getElementById('idTitulo').innerHTML = 'Registrar';
    document.getElementById('txtIdEmpleado').value = '0000';
    document.getElementById('txtNombre').value = '';
    document.getElementById('txtApellido').value = '';
    document.getElementById('txtDNI').value = '';
    document.getElementById('txtFecha').value = '';
    document.getElementById('txtTelefono').value = '';
    document.getElementById('txtCorreo').value = '';
    document.getElementById('selCargo').value = '0';
    document.getElementById('txtUsuario').value = '';
    document.getElementById('txtContra').value = '';
    Boton_Guardar.style.display = 'block';
    Boton_Acutalizar.style.display = 'none';
    CajaTexto.style.display = 'none';
    //let modal = document.querySelector(".modal");
    //modal.style.opacity = 1;
    //modal.style.visibility = "visible";
}

function abrirModal(idEmpleado, nombre, Apellido, dni, Nacimiento, telefono, correo, idcargo, Usuario, Contraseña) {
    document.getElementById('txtIdEmpleado').value = idEmpleado;
    document.getElementById('txtNombre').value = nombre;
    document.getElementById('txtApellido').value = Apellido;
    document.getElementById('txtDNI').value = dni;
    document.getElementById('txtFecha').value = Nacimiento;
    document.getElementById('txtTelefono').value = telefono;
    document.getElementById('txtCorreo').value = correo;
    document.getElementById('selCargo').value = idcargo;
    document.getElementById('txtUsuario').value = Usuario;
    document.getElementById('txtContra').value = Contraseña;
   // document.getElementById('idTitulo').innerHTML = 'Actualizar';
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    Boton_Guardar.style.display = 'none';
    Boton_Acutalizar.style.display = 'block';
    CajaTexto.style.display = 'inline-block';
    //let modal = document.querySelector(".modal");
    //modal.style.opacity = 1;
   // modal.style.visibility = "visible";
}


function Buscar() {
    var leta = document.getElementById("txtBuscar").value;
    $.ajax({
        url: "Consultas/Empleados/EmpleadosBuscar.jsp",
        type: 'POST',
        data: {letra: leta},
        success: function (data) {
            document.getElementById("recentOrders").innerHTML = data;
            //MostrarCategoria();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}


function Mostrar() {

    $.ajax({
        url: "Consultas/Empleados/EmpleadosConsultar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("recentOrders").innerHTML = data;
            MostrarCategoria();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function MostrarCategoria() {

    $.ajax({
        url: "Consultas/Empleados/EmpleadosCargos.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("SelectedsCat").innerHTML = data;
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function datosRegistrar() {
    var form = $('#form')[0];
    var data = new FormData(form);
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevEmpleados?accion=Guardar',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        context: this,
        success: function (datas) {
            swal("Registrar", "El Empleado se ha Registrado", "success");
            Mostrar();
        },
        error: function (e) {
            alert("Falta completar los campos" + e);
            swal("No registrado", "El Empleado no se ha Registrado", "error");
        }
    });
}

function datosactiualizar() {
    var form = $('#form')[0];
    var data = new FormData(form);
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevEmpleados?accion=Actualizar',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        context: this,
        success: function (datas) {
            Mostrar();
        },
        error: function (e) {

            alert("error" + e);
        }
    });
}

function datosEliminar(codigo) {
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevEmpleados?accion=Eliminar',
        data: {idEmpleado: codigo},
        success: function (datas) {
            Mostrar();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function Registrar() {
    
    swal("Registrar", "Esta Seguro De Registrar Estas Informacion?", "warning", {
        buttons: {
            cancel: "No, Cancelar",
            catch : {
                text: "Si, Registrar!",
                value: "catch"
            },
            a: {
                text: "Editar Otra Informacion",
                value: "Edita"
            }
        }
    })
            .then((value) => {
                switch (value) {
                    case "Edita":

                        break;
                    case "catch":
                        let modal = document.querySelector(".modal");
                        modal.style.opacity = 0;
                        modal.style.visibility = "hidden";
                        
                        datosRegistrar();          
                        break;
                    default:
                        let modalcerrar = document.querySelector(".modal");
                        modalcerrar.style.opacity = 0;
                        modalcerrar.style.visibility = "hidden";
                        swal("Cancelado", "Cancelaste el Registro", "error");
                        break;
                }

            });
}

function Actualizado() {

    swal("Actualizar", "Esta Seguro De Actualizar El Empleado?", "warning", {
        buttons: {
            cancel: "No, Cancelar",
            catch : {
                text: "Si, Actualizar!",
                value: "catch"
            },
            a: {
                text: "Editar Otra Informacion",
                value: "Edita"
            }
        }
    })
            .then((value) => {
                switch (value) {
                    case "Edita":

                        break;
                    case "catch":
                        let modal = document.querySelector(".modal");
                        modal.style.opacity = 0;
                        modal.style.visibility = "hidden";
                        swal("Actualizar", "El Empleado se ha Actualizado", "success");
                        datosactiualizar();
                        break;
                    default:
                        let modalcerrar = document.querySelector(".modal");
                        modalcerrar.style.opacity = 0;
                        modalcerrar.style.visibility = "hidden";
                        swal("Cancelado", "Cancelaste la Actualizacion", "error");
                        break;
                }

            });
}

function Eliminar(codigotable) {

    swal("Eliminar", "Esta Seguro De Deshabilitar Este Empleado?", "warning", {
        buttons: {
            cancel: "No, Cancelar",
            catch : {
                text: "Si, Deshabilitar!",
                value: "catch"
            }
        }
    })
            .then((value) => {
                switch (value) {
                    case "catch":
                        swal("Eliminar", "El Empleado se ha Deshabilitado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Deshabilitación", "error");
                        break;
                }

            });
}




