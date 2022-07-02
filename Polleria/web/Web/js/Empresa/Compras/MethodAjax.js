BtnCancelar();


function BtnInsumoCarrito() {

    document.getElementById("staticBackdropLabel").innerHTML = 'Insumos';
    //AbriModal();
    MostrarProductos();
}

function BtnProveedor() {

    document.getElementById("staticBackdropLabel").innerHTML = 'Proveedores';
    //AbriModal();
    MostrarClientes();
}

function BtnGenerarCompra() {
    // var selFormaPago = document.getElementById('').value;
    var codEmpleado = localStorage.getItem('CodigoEmpleado');
    alert(codEmpleado);
    if (codigoProveedor == "") {
        swal("Alerta", "No Selecciono un Proveedor", "error");
    } else {
        $.ajax({
            type: 'POST',
            url: '../../SevCompras?accion=Empleados',
            data: {
                idProveedor: codigoProveedor,
                idEmpleado: codEmpleado},
            success: function (datas) {
                Mostrar();
                swal("Compras", "Compra Hecha Correctamente", "success");
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
        url: "Consultas/Compras/CestaConsultar.jsp",
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
        url: "Consultas/Compras/ProveedorConsultar.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("tablaConsulta").innerHTML = data;
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Clientes");
        }
    });
}

var codigoProveedor = "";
function SeleccionarProveedor(id, nombre, dni) {
    codigoProveedor = id;
    OcultarBtnCliente(0);
    document.getElementById('idccliente').innerHTML = 'Proveedor: ' + nombre + ' - RUC: ' + dni;
    //CerrarModal();
}

function OcultarBtnCliente(opc) {

    document.getElementById('idccliente').innerHTML = '';

}

function MostrarProductos() {
    $.ajax({
        url: "Consultas/Compras/InsumoConsultar.jsp",
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
        url: '../../SevCarritoCompras?accion=Agregar',
        data: {codigo: id, nombre: nom, precio: pre, cantidad: "10"},
        success: function (datas) {
            Mostrar();
            // CerrarModal();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function QuitarItem(id) {
    $.ajax({
        type: 'POST',
        url: '../../SevCarritoCompras?accion=Quitar',
        data: {codigo: id},
        success: function (datas) {
            Mostrar();
            //CerrarModal();
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}

function BtnCancelar() {
    $.ajax({
        type: 'POST',
        url: '../../SevCarritoCompras?accion=Cancelar',
        success: function (datas) {
            Mostrar();
            //CerrarModal();
            OcultarBtnCliente(1);
        },
        error: function (e) {
            alert("error" + e);
        }
    });
}
