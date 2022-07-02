
/* global swal */

function nuevo() {
    document.getElementById('idTitulo').innerHTML = 'Registrar';
    document.getElementById('txtDescripcion').value = '';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function Buscar() {
    var leta = document.getElementById("txtBuscar").value;
    $.ajax({
        url: "Consultas/Cargo/CargoBuscar.jsp",
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
        url: "Consultas/Cargo/CargoConsultar.jsp",
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
    var nombre = document.getElementById('txtDescripcion').value;
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevCargos?accion=Guardar',
        data: {txtDescripcion: nombre},
        success: function (datas) {
            Mostrar();
             swal("Registrar", "El Cargo se ha Registrado", "success");

        },
        error: function (e) {
            alert("error" + e);
            swal("No registrado", "El Cargo no se ha Registrado", "error");
        }
    });
}

function datosEliminar(codigo) {
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevCargos?accion=Eliminar',
        data: {idCargo: codigo},
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

function Eliminar(codigotable) {

    swal("Eliminar", "Esta Seguro De Desactivar Este Cargo?", "warning", {
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
                        swal("Eliminar", "El Cargo se ha Desactivado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Eliminacion", "error");
                        break;
                }

            });
}
