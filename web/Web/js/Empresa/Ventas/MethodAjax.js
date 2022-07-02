BtnCancelar();


function BtnProductoCarrito() {
    document.getElementById("staticBackdropLabel").innerHTML = 'Productos';
    //AbriModal();
    MostrarProductos();
}

function BtnCliente() {
    document.getElementById("staticBackdropLabel").innerHTML = 'Clientes';
    //AbriModal();
    MostrarClientes();
}

function BtnGenerarVenta() {
    // var selFormaPago = document.getElementById('').value;
    if (codigoCliente == "") {
        swal("Alerta", "No Selecciono un Cliente", "error");
    } else {
        $.ajax({
            type: 'POST',
            url: '../../SevVentas?accion=Empleados',
            data: {
                idCliente: codigoCliente,
                selFormaPago: "1"
            },
            success: function (datas) {
                Mostrar();
                swal("Ventas", "Venta Hecha Correctamente", "success");
                OcultarBtnCliente(1);
            },
            error: function (e) {
                alert("error" + e);
            }
        });
    }
}

function Mostrar() {
    $.ajax({
        url: "Consultas/Ventas/CestaConsultar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("tablaCesta2").innerHTML = data;
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Cesta");
        }
    });
}

function MostrarClientes() {
    $.ajax({
        url: "Consultas/Ventas/ClienteConsultar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("tablaConsulta").innerHTML = data;
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Clientes");
        }
    });
}

var codigoCliente = "";
function SeleccionarCliente(id, nombre, apellido, dni) {
    codigoCliente = id;
    OcultarBtnCliente(0);
    document.getElementById('idccliente').innerHTML = 'Cliente: ' + nombre + ', ' + apellido + ' - DNI: ' + dni;
    //CerrarModal();
}

function OcultarBtnCliente(opc) {
        document.getElementById('idccliente').innerHTML = '';
}

function MostrarProductos() {
    $.ajax({
        url: "Consultas/Ventas/ProductoConsultar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("tablaConsulta").innerHTML = data;
            //listaCesta();
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Productos");
        }
    });
}

function SeleccionarProducto(id, nom, pre, can) {
    $.ajax({
        type: 'POST',
        url: '../../SevCarrito?accion=Agregar',
        data: {codigo: id, nombre: nom, precio: pre, cantidad: "1"},
        success: function (datas) {
            Mostrar();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function QuitarItem(id) {
    $.ajax({
        type: 'POST',
        url: '../../SevCarrito?accion=Quitar',
        data: {codigo: id},
        success: function (datas) {
            Mostrar();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function BtnCancelar() {
    $.ajax({
        type: 'POST',
        url: '../../SevCarrito?accion=Cancelar',
        success: function (datas) {
            Mostrar();
            OcultarBtnCliente(1);
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

