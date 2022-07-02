
function CerrarModal() {
    let modal = document.querySelector(".modal");
    modal.style.opacity = 0;
    modal.style.visibility = "hidden";
}

function AbriModal() {
    let modal = document.querySelector(".modal");
    modal.style.opacity = 1;
    modal.style.visibility = "visible";
}


function Mostrar() {
    $.ajax({
        url: "Consultas/Ventas/VentaConsulta.jsp",
        type: 'POST',
        success: function (data) {
            document.getElementById("tablaCesta2").innerHTML = data;
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Cesta");
        }
    });
}


function VerDetalle(codigo) {
    AbriModal();
    $.ajax({
        url: "Consultas/Ventas/DetaleVentaconsulta.jsp",
        type: 'POST',
        data: {Cod:codigo},
        success: function (data) {
            document.getElementById("tablaConsulta").innerHTML = data;
        },
        error: function (returne) {
            alert("No Se Pudo Cargar Los Cesta");
        }
    });
}