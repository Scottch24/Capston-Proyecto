package Modelo;

public class Cliente {

    private String idCliente;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Genero;
    private int dni;
    private String Direccion;
    private String Usuario;
    private String Contraseña;
    private String Fecha_Actualizacion;
    private String Estado;

    public Cliente() {
    }

    public Cliente(String idCliente, String Nombres, String Apellidos, String Telefono, String Genero, int dni, String Direccion, String Usuario, String Contraseña, String Fecha_Actualizacion, String Estado) {
        this.idCliente = idCliente;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Genero = Genero;
        this.dni = dni;
        this.Direccion = Direccion;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Fecha_Actualizacion = Fecha_Actualizacion;
        this.Estado = Estado;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getFecha_Actualizacion() {
        return Fecha_Actualizacion;
    }

    public void setFecha_Actualizacion(String Fecha_Actualizacion) {
        this.Fecha_Actualizacion = Fecha_Actualizacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    public String TransformarDNI(int dni){
        return Integer.toString(dni);
    }

    

}
