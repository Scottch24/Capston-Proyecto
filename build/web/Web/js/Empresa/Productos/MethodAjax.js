
/* global swal */
MostrarCategoria();

function nuevo() {
    const Boton_Guardar = document.getElementById('Grabar');
    const Boton_Acutalizar = document.getElementById('Actualizar');
    const CajaTexto = document.getElementById('cajaId');
    document.getElementById('staticBackdropLabel').innerHTML = 'Registrar Producto';
    document.getElementById('txtIdProducto').value = '0';
    document.getElementById('txtNombre').value = '';
    document.getElementById('txtPrecio').value = '0';
    document.getElementById('txtStock').value = '0';
    document.getElementById('selCategoria').value = '0';
    document.getElementById('txtDescripcion').value = '';
    Boton_Guardar.style.display = 'block';
    Boton_Acutalizar.style.display = 'none';
    CajaTexto.style.display = 'none';
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}

function abrirModal(idProducto, nombre, stock, descripcion, precio, idcat) {
    document.getElementById('txtIdProducto').value = idProducto;
    document.getElementById('txtNombre').value = nombre;
    document.getElementById('txtPrecio').value = precio;
    document.getElementById('txtStock').value = stock;
    document.getElementById('selCategoria').value = idcat;
    document.getElementById('txtDescripcion').value = descripcion;
    document.getElementById('staticBackdropLabel').innerHTML = 'Actualizar Producto';
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
        url: "Consultas/Productos/ProductoBuscar.jsp",
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
        url: 'Consultas/Productos/Productosconsultar.jsp',
        type: 'POST',
        success: function (data) {
            document.getElementById("recentOrders").innerHTML = data;
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function MostrarCategoria() {

    $.ajax({
        url: "Consultas/Productos/ProductosCategoria.jsp",
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
        url: '../../SevProductos?accion=Guardar',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        context: this,
        success: function (datas) {
            swal("Registrar", "El Producto se ha Registrado", "success");
            Mostrar();
            location.reload();
            
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
        url: '../../SevProductos?accion=Actualizar',
        data: data,
        processData: false,
        contentType: false,
        cache: false,
        context: this,
        success: function (datas) {
            Mostrar();
            location.reload();
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
        url: '../../SevProductos?accion=Eliminar',
        data: {idProducto: codigo},
        success: function (datas) {
            Mostrar();
            location.reload();
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

    swal("Actualizar", "Esta Seguro De Actualizar Este Producto?", "warning", {
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
                        swal("Actualizar", "El Producto se ha Actualizado", "success");
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

    swal("Deshabilitar", "Esta Seguro De Deshabilitar Este Producto?", "warning", {
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
                        swal("Deshabilitar", "El Producto se ha Deshabilitado", "success");
                        datosEliminar(codigotable);
                        break;
                    default:
                        swal("Cancelado", "Cancelaste la Deshabilitacion", "error");
                        break;
                }

            });
}




