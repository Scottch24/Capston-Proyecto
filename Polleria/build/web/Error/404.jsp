<%-- 
    Document   : 404
    Created on : 24-oct-2021, 20:22:01
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>404</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/normalize.css"/>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/Web/Css/EstilosError.css"/>
    </head>
    <body>
        <div class="container">
            <img src="${pageContext.request.contextPath}/Web/img/F.svg" class="image" alt="" />
            <h1>La Pagina Que Ha Solicitado No Se Encuentra Disponible</h1>
            <div>
                <button class="boton" onClick="history.go(-1)">
                    Volver Atras
                </button>
            </div>
        </div>
    </body>
</html>
