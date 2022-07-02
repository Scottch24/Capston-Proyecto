
/* global swal */

function nuevo() {
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    document.getElementById('staticBackdropLabel').innerHTML = 'Registrar Insumo';
    document.getElementById('txtIdInsumo').value = '';
    document.getElementById('txtIngrediente').value = '';
    document.getElementById('txtFecha').value = '';
    document.getElementById('selMarca').value = '0';
    Boton_Guardar.style.display = 'block';
    Boton_Acutalizar.style.display = 'none';
    CajaTexto.style.display = 'none';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function abrirModal(idInsumo, nombre, Vencimiento, idMarca, precio) {
    document.getElementById('txtIdInsumo').value = idInsumo;
    document.getElementById('txtIngrediente').value = nombre;
    document.getElementById('txtFecha').value = Vencimiento;
    document.getElementById('selMarca').value = idMarca;
    document.getElementById('txtPrecio').value = precio;
    document.getElementById('staticBackdropLabel').innerHTML = 'Actualizar Insumo';
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

function Buscar() {
    var leta = document.getElementById("txtBuscar").value;
    $.ajax({
        url: "Consultas/Insumos/InsumoBuscar.jsp",
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
        url: "Consultas/Insumos/ConsultaInsumos.jsp",
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
        url: "Consultas/Insumos/MarcaSelc.jsp",
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
        url: '../../SevInsumos?accion=Guardar',
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
        url: '../../SevInsumos?accion=Actualizar',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        context: this,
        success: function (datas) {
            Mostrar();
        },
        error: function (e) {

            alert("error" + e.message());
        }
    });
}

function datosEliminar(codigo) {
    $.ajax({
        type: 'POST',
        enctype: 'multipart/form-data',
        url: '../../SevInsumos?accion=Eliminar',
        data: {idProducto: codigo},
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
                        swal("Registrar", "El Insumo se ha Registrado", "success");
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

    swal("Actualizar", "Esta Seguro De Actualizar Este Insumo?", "warning", {
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
                        swal("Actualizar", "El Insumo se ha Actualizado", "success");
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

    swal("Desactivar", "Esta Seguro De Desactivar Este Insumo?", "warning", {
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
                        swal("Desactivar", "El Insumo se ha Desactivado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Desactivacion", "error");
                        break;
                }

            });
}



