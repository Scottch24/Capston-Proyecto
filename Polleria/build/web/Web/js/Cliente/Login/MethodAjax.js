
document.getElementById("btn__registrarse").addEventListener("click", register);
document.getElementById("btn__iniciar-sesion").addEventListener("click", iniciarSesion);

var contenedor_login_register = document.querySelector(".contenedor__login-register");
var formulario_login = document.querySelector(".formulario__login");
var formulario_register = document.querySelector(".formulario__register");
var caja_trasera_login = document.querySelector(".Caja__trasera-login");
var caja_trasera_register = document.querySelector(".caja__trasera-register");

function register() {
    formulario_register.style.display = "block";
    contenedor_login_register.style.left = "410px";
    formulario_login.style.display = "none";
    caja_trasera_register.style.opacity = "0";
    caja_trasera_login.style.opacity = "1";
}

function iniciarSesion() {
    formulario_register.style.display = "none";
    contenedor_login_register.style.left = "70px";
    formulario_login.style.display = "block";
    caja_trasera_register.style.opacity = "1";
    caja_trasera_login.style.opacity = "0";
}



function IniciarSesion() {
    var usu = document.getElementById("txtUsuarior").value;
    var contra = document.getElementById("txtCont").value;
    alert(usu + contra);
    $.ajax({
        data: {
            Usuario: usu,
            Contraseña: contra
        },
        url: 'Consultas/Login/IniciarSesionCliente.jsp',
        type: 'POST',
        success: function (data) {
            alert(data.trim());
            sessionStorage.setItem('idCliente', data.trim());
            if (data.trim() === 'No Se Puedo Iniciar Sesion') {
                window.location.href = 'InicioSesion.jsp'
            }else{
                window.location.href = '../../index.jsp';
            }
        },
        error: function (returne) {
            alert(returne);
        }

    });
}



function RegistrarCliente() {
    var v_nombre = document.getElementById("txtNombre").value;
    var v_apellido = document.getElementById("txtApellido").value;
    var v_telefono = document.getElementById("txtTelefono").value;
    var v_dni = document.getElementById("txtDNI").value;
    var v_usu = document.getElementById("txtUsuario").value;
    var v_con = document.getElementById("txtContra").value;
    $.ajax({
        data: {
            Nombre: v_nombre,
            Apellido: v_apellido,
            Telefono: v_telefono,
            DNI: v_dni,
            Usuario: v_usu,
            Contraseña: v_con
        },
        type: 'POST',
        url: 'Consultas/Login/RegistroCliente.jsp',
        success: function (data) {
            swal("Registro", "Registrado Correctamente", "success");
        }
    });

}