<!--Menu Navegacion Izquiedo-->
<div data-pushbar-id="pushbar-menu" data-pushbar-direction="left" class="pushbar pushbar-menu">

    <div class="btn-cerrar derecha">
        <button data-pushbar-close>
            <img src="${pageContext.request.contextPath}/Web/img/Regresar.ico" alt="">
        </button>
    </div>
    <nav class="navegaciones">
        <a href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/PardosParrillero.jsp">Pardos Parrillero</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/AnticuchosYMollejitas.jsp">Anticuchos y Mollejitas</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/PardosBrasa.jsp">Pardos Brasa</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Chicharrones.jsp">Chicharrones</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Ensaladas.jsp">Ensaladas</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Postres.jsp">Postres</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Bebidas.jsp">Bebidas</a>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Pedidos.jsp">Pedidos</a>
        <%
            if (session.getAttribute("CodigoCliente3") == null) {
        %>
        <a href="${pageContext.request.contextPath}/Web/Cliente/InicioSesion.jsp">Iniciar Sesion</a>
        <%
        } else {
        %>
        <a href="${pageContext.request.contextPath}/Web/Cliente/Perfil.jsp">Perfil</a>
        <%
            }
        %>
    </nav>

</div>
<!--Carrito Derecho-->
<div data-pushbar-id="pushbar-carrito" data-pushbar-direction="right" class="pushbar pushbar-carrito">
    <div class="btn-cerrar izquierda">
        <button data-pushbar-close>
            <img src="${pageContext.request.contextPath}/Web/img/Regresar_Invertido.ico" alt="">
        </button>
    </div>
    <p class="titulo">Carrito De Compras</p>
    <div id="Caja_Carrito" class="CajaCarrito_1" style=" OVERFLOW: auto;   height: 660px;">
    </div>
    <div class="total-Carrito" id="total_Carrito">

    </div>
</div>