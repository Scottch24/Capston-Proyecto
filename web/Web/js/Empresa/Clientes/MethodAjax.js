
function nuevo() {
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    document.getElementById('staticBackdropLabel').innerHTML = 'Registrar Cliente';
    document.getElementById('txtIdCliente').value = '';
    document.getElementById('txtNombre').value = '';
    document.getElementById('txtApellido').value = '';
    document.getElementById('txtTelefono').value = '';
    document.getElementById('txtDNI').value = '';
    document.getElementById('txtCorreo').value = '';
    document.getElementById('txtUsuario').value = '';
    document.getElementById('txtContra').value = '';
    document.getElementById('txtEstado').checked = true;

    Boton_Guardar.style.display = 'block';
    Boton_Acutalizar.style.display = 'none';
    CajaTexto.style.display = 'none';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function abrirModal(nombre, apellido, telefono, Genero, dni, Direccion, Usuario, Contraseña, idCliente, estado) {
    document.getElementById('txtIdCliente').value = idCliente;
    document.getElementById('txtNombre').value = nombre;
    document.getElementById('txtApellido').value = apellido;
    document.getElementById('txtTelefono').value = telefono;
    document.getElementById('txtDNI').value = dni;
    document.getElementById('txtCorreo').value = Direccion;
    document.getElementById('txtUsuario').value = Usuario;
    document.getElementById('txtContra').value = Contraseña;
    documemt.getElementById('selGenero').value = Genero;
    if (estado === 'Habilitado') {
        document.getElementById('txtEstado').checked = true;
    } else {
        document.getElementById('txtEstado').checked = false;
    }

    document.getElementById('staticBackdropLabel').innerHTML = 'Actualizar Cliente';
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    Boton_Guardar.style.display = 'none';
    Boton_Acutalizar.style.display = 'block';
    CajaTexto.style.display = 'inline-block';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

//
//function Buscar() {
//    var leta = document.getElementById("txtBuscar").value;
//    $.ajax({
//        url: "Consultas/Clientes/clientebuscar.jsp",
//        type: 'POST',
//        data: {letra: leta},
//        success: function (data) {
//            document.getElementById("recentOrders").innerHTML = data;
//        },
//        error: function (e) {
//            alert("error" + e);
//        }
//    });
//}


function Mostrar() {
    $.ajax({
        url: "Consultas/Clientes/Clientemostrar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("recentOrders").innerHTML = data;
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
        url: '../../SevCliente?accion=Guardar',
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

function datosactiualizar() {
    var form = $('#form')[0];
    var data = new FormData(form);
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevCliente?accion=Actualizar',
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
        url: '../../SevCliente?accion=Eliminar',
        data: {idCliente: codigo},
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
                        swal("Registrar", "El cliente se ha Registrado", "success");
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
    var ale = document.getElementById('txtEstado').checked;
    alert(ale);
    swal("Actualizar", "Esta Seguro De Actualizar El cliente?", "warning", {
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
                        swal("Actualizar", "El cliente se ha Actualizado", "success");
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

    swal("Desactivar", "Esta Seguro De Desactivar Este cliente?", "warning", {
        buttons: {
            cancel: "No, Cancelar",
            catch : {
                text: "Si, Desactivar!",
                value: "catch"
            }
        }
    })
            .then((value) => {
                switch (value) {
                    case "catch":
                        swal("Desactivar", "El cliente se ha Desactivado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Desactivacion", "error");
                        break;
                }

            });
}






