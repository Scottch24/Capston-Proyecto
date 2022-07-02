
/* global swal */

function BuscarRuc() {
    var txtbuscar = document.getElementById('txtRuc').value;
    const options = {
        method: 'POST',
        headers: {Accept: 'application/json', 'Content-Type': 'application/json'},
        body: JSON.stringify({token: '4pCO8RUk7hVx3R0Ae846zqWEkljUy3NNBmFIObGEEEVp4U7ArS2psh7KAbxk', ruc: txtbuscar})
    };

    fetch('https://api.migo.pe/api/v1/ruc', options)
            .then(response => response.json())
            .then(response => {
                document.getElementById('txtRazonSocial').value = response.nombre_o_razon_social;
                document.getElementById('txtRazonSocial').value = response.nombre_o_razon_social;
                console.log(response.actualizado_en);
                console.log(response.codigo_de_zona);
                console.log(response.condicion_de_domicilio);
                console.log(response.departamento);
                console.log(response.direccion);
                console.log(response.direccion_simple);
                console.log(response.distrito);
                console.log(response.dpto);
                console.log(response.estado_del_contribuyente);
                console.log(response.interior);
                console.log(response.kilometro);
                console.log(response.lote);
                console.log(response.manzana);
                console.log(response.nombre_de_via);
                console.log(response.nombre_o_razon_social);
                console.log(response.numero);
                console.log(response.provincia);
                console.log(response.ruc);
                console.log(response.tipo_de_via);
                console.log(response.tipo_de_zona);
                console.log(response.ubigeo);
            })
            .catch(err => console.error(err));

}

function nuevo() {
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    document.getElementById('staticBackdropLabel').innerHTML = 'Registrar Proveedor';
    document.getElementById('txtIdProveedor').value = '';
    document.getElementById('txtRazonSocial').value = '';
    document.getElementById('txtRuc').value = '';
    document.getElementById('txtTelefono').value = '';
    document.getElementById('txtContacto').value = '';

    Boton_Guardar.style.display = 'block';
    Boton_Acutalizar.style.display = 'none';
    CajaTexto.style.display = 'none';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function abrirModal(idProveedor, RazonSocial, RUC, Telefono, Contacto) {
    document.getElementById('txtIdProveedor').value = idProveedor;
    document.getElementById('txtRazonSocial').value = RazonSocial;
    document.getElementById('txtRuc').value = RUC;
    document.getElementById('txtTelefono').value = Telefono;
    document.getElementById('txtContacto').value = Contacto;

    document.getElementById('staticBackdropLabel').innerHTML = 'Actualizar Proveedor';
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
        url: "Consultas/Proveedores/ProveedoresBuscar.jsp",
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
        url: "Consultas/Proveedores/ProveedoresConsulta.jsp",
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
        url: '../../SevProveedores?accion=Guardar',
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
        url: '../../SevProveedores?accion=Actualizar',
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
        url: '../../SevProveedores?accion=Eliminar',
        data: {idProveedor: codigo},
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
                        let modal = document.querySelector(".modal-backdrop");
                        modal.style.opacity = 0;
                        modal.style.visibility = "hidden";
                        swal("Registrar", "El proveedor se ha Registrado", "success");
                        datosRegistrar();
                        break;
                    default:
                        let modalcerrar = document.querySelector(".modal-backdrop");
                        modalcerrar.style.opacity = 0;
                        modalcerrar.style.visibility = "hidden";
                        swal("Cancelado", "Cancelaste el Registro", "error");
                        break;
                }
            });
}

function Actualizado() {

    swal("Actualizar", "Esta Seguro De Actualizar Este proveedor?", "warning", {
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
                        let cerrea = document.querySelector('.modal-backdrop');
                        cerrea.style.opacity = 0;
                        cerrea.style.visibility = "hidden";
                        swal("Actualizar", "El proveedor se ha Actualizado", "success");
                        datosactiualizar();
                        break;
                    default:
                        let modalcerrar = document.querySelector(".modal");

                        modalcerrar.style.opacity = 0;
                        modalcerrar.style.visibility = "hidden";
                        let cerre = document.querySelector('.modal-backdrop');
                        cerre.style.opacity = 0;
                        cerre.style.visibility = "hidden";
                        swal("Cancelado", "Cancelaste la Actualizacion", "error");
                        break;
                }

            });
}

function Eliminar(codigotable) {

    swal("Desactivar", "Esta Seguro De Desactivar Este proveedor?", "warning", {
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
                        swal("Desactivar", "El proveedor se ha Desactivado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Desactivacion", "error");
                        break;
                }

            });
}



