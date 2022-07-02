<%@page import="java.util.List"%>
<%@page import="Modelo.Cliente"%>
<%@page import="ModeloDAO.daoLogin"%>
<link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>


<%
    String Codigo = (String) session.getAttribute("CodigoCliente3");

    daoLogin log = new daoLogin();

    List<Cliente> lista = log.DatosCliente(Codigo);
    String name = "", link = "";
    if (lista.isEmpty()) {
        name = "Iniciar Sesion";
        link = "InicioSesion.jsp";
    } else {
        for (Cliente c : lista) {
            name = c.getNombres() + ", " + c.getApellidos();
        }
        link = "Perfil.jsp";
    }
%>
<header>
    <div class="nav">
        <div class="Logo">
            <a href="${pageContext.request.contextPath}/index.jsp"><img src="${pageContext.request.contextPath}/Web/img/Logo_pardos.jpg" alt="" style="width: 110px; height: 80px;"></a>
        </div>
        <div class="Botones" style="    padding-right: 20px;">
            <button class="btn-menu" data-pushbar-target="pushbar-menu">
                <img src="${pageContext.request.contextPath}/Web/img/Menu.ico" alt="">
            </button>
            <p class="Total" id="TotalView" style="max-width: 300px; width: auto">
            </p>
            <button class="btn-carrito" data-pushbar-target="pushbar-carrito">
                <img src="${pageContext.request.contextPath}/Web/img/Carrito.ico" alt="">
            </button>
            <a href="${pageContext.request.contextPath}/Web/Cliente/<%=link%>" id="id">
                <p class="Total" id="UsuarioCliente" style="max-width: 300px; width: auto">
                    <%=name%>
                    
                </p>
            </a>
            <a href="${pageContext.request.contextPath}/Web/Cliente/<%=link%>">
                <button class="btn-carrito">
                    <i class='bx bxs-user' style='color:#ffffff' ></i>            
                </button>
            </a>


        </div>
    </div>
</header>