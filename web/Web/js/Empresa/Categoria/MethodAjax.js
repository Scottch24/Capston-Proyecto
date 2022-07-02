/* global swal */

function nuevo() {
    document.getElementById('staticBackdropLabel').innerHTML = 'Registrar';
    //document.getElementById('txtCategoria').value = '';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function Buscar() {
    var leta = document.getElementById("txtBuscar").value;
    $.ajax({
        url: "Consultas/Categoria/CategoriaBuscar.jsp",
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
        url: "Consultas/Categoria/CategoriaConsultar.jsp",
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
    var nombre = document.getElementById('txtNombreCate').value;
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevCategoriaProductos?accion=Agrega',
        data: {nombresC: nombre},
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
        url: '../../SevCategoriaProductos?accion=Eliminar',
        data: {idCategoria: codigo},
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
                        swal("Registrar", "El Producto se ha Registrado", "success");
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

    swal("Desactivar", "Esta Seguro De Desactivar Este Producto?", "warning", {
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
                        swal("Desactivar", "El Producto se ha Desactivado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Desactivacion", "error");
                        break;
                }

            });
}
