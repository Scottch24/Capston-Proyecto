package Modelo;

public class Insumos {

    private int idIngrediente;
    private String Nombre;
    private String Vencimiento;
    private int idMarca;
    private String Marca;
    private int Cantidad;
    private double Precio;
    private String FechaActualiza;
    private String estado;

    public Insumos() {
    }

    public Insumos(int idIngrediente, String Nombre, String Vencimiento, int idMarca, String Marca, int Cantidad, double Precio, String FechaActualiza, String estado) {
        this.idIngrediente = idIngrediente;
        this.Nombre = Nombre;
        this.Vencimiento = Vencimiento;
        this.idMarca = idMarca;
        this.Marca = Marca;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.FechaActualiza = FechaActualiza;
        this.estado = estado;
    }

    public int getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(int idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getVencimiento() {
        return Vencimiento;
    }

    public void setVencimiento(String Vencimiento) {
        this.Vencimiento = Vencimiento;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getFechaActualiza() {
        return FechaActualiza;
    }

    public void setFechaActualiza(String FechaActualiza) {
        this.FechaActualiza = FechaActualiza;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    


    
}
