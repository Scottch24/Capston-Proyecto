<%@page import="Modelo.Cliente"%>
<%@page import="Modelo.Productos"%>
<%@page import="ModeloDAO.daoCliente"%>
<%

    daoCliente p = new daoCliente();
    Cliente d = new Cliente();
    
    String nombre = request.getParameter("Nombre");
    String apellido = request.getParameter("Apellido");
    String telefono = request.getParameter("Telefono");
    int dni = Integer.parseInt(request.getParameter("DNI"));
    String usuario = request.getParameter("Usuario");
    String Contrase�a = request.getParameter("Contrase�a");

    
    d.setNombres(nombre);
    d.setApellidos(apellido);
    d.setTelefono(telefono);
    d.setDni(dni);
    d.setUsuario(usuario);
    d.setContrase�a(Contrase�a);
    d.setGenero("cc");
    d.setDireccion("dd");
    
    String Resultado = p.Registrar(d);

%>