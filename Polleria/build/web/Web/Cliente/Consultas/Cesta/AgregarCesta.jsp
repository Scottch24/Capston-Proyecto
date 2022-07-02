<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCesta"%>
<%

    daoCesta c = (daoCesta) session.getAttribute("Cesta2");
    if (c == null) {
        c = new daoCesta();
    }
    
    String opera = request.getParameter("ope");
    if (opera.equalsIgnoreCase("1")) {
        String cod = request.getParameter("codigo");
        String Nom = request.getParameter("nombre");
        double Precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
        Productos prod = new Productos();
        prod.setIdProductos(cod);
        prod.setNombre(Nom);
        prod.setPrecio(Precio);
        prod.setStock(cantidad);
        c.agregar(prod);
    }

    if (opera.equalsIgnoreCase("2")) {
        String cod = request.getParameter("codigo");
        Productos prod = new Productos();
        prod.setIdProductos(cod);
        c.retirar(prod);
    }

    session.setAttribute("Cesta2", c);
    


%>