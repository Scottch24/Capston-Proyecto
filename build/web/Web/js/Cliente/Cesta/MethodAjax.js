function listaCesta() {
    $.ajax({
        url: "Consultas/Cesta/MostrarCesta.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("Caja_Carrito").innerHTML = data;
            listaTotal();
            listaTotalView();
        },
        error: function (returne) {
            alert("error carrito" + returne);
        }
    });
}

function listaTotalView() {
    $.ajax({
        url: "Consultas/Cesta/MostrarTotalView.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("TotalView").innerHTML = data;
        },
        error: function (returne) {
            alert("error carrito" + returne);
        }
    });
}

function listaTotal() {
    $.ajax({
        url: "Consultas/Cesta/MostrarTotalCesta.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("total_Carrito").innerHTML = data;
        },
        error: function (returne) {
            alert("error carrito Mostrar Total Cesta" + returne);
        }
    });
}

function Agrega(codigo, nombre, cantidad, precio) {
    $.ajax({
        data: {ope: "1",
            codigo: codigo,
            nombre: nombre,
            precio: precio,
            cantidad: "1"},
        type: 'POST',
        url: "Consultas/Cesta/AgregarCesta.jsp",
        success: function (data) {
            listaCesta();
        },
        error: function (returne) {
            alert("Error" + returne)
        }
    });
}

function retirar(codigo) {
    datos = {ope: "2",
        codigo: codigo};
    $.ajax({
        data: datos,
        type: 'POST',
        url: "Consultas/Cesta/AgregarCesta.jsp",
        success: function (data) {
            listaCesta();

        }
    });
}