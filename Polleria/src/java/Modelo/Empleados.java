package Modelo;

public class Empleados {

    private String idEmpleado;
    private String Nombres;
    private String Apellidos;
    private int dni;
    private String nacimiento;
    private String telefono;
    private String correo;
    private String Cargo;
    private int idCargo;
    private int idUsuario;
    private String Usuario;
    private String Contraseña;
    private String Letra;
    private String FechaActualizacion;
    private String Estado;

    public Empleados() {
    }

    public Empleados(String idEmpleado, String Nombres, String Apellidos, int dni, String nacimiento, String telefono, String correo, String Cargo, int idCargo, int idUsuario, String Usuario, String Contraseña, String Letra, String FechaActualizacion, String Estado) {
        this.idEmpleado = idEmpleado;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.Cargo = Cargo;
        this.idCargo = idCargo;
        this.idUsuario = idUsuario;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Letra = Letra;
        this.FechaActualizacion = FechaActualizacion;
        this.Estado = Estado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    public String getFechaActualizacion() {
        return FechaActualizacion;
    }

    public void setFechaActualizacion(String FechaActualizacion) {
        this.FechaActualizacion = FechaActualizacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


    
    
    
}
