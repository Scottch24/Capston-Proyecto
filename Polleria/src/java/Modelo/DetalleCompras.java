
package Modelo;

public class DetalleCompras {
    
    private String idCompra;
    private int idIngredientes;
    private String Nombre;
    private int Cantidad;
    private double Precio;
    private double SubTotal;

    public DetalleCompras() {
    }

    public DetalleCompras(String idCompra, int idIngredientes, String Nombre, int Cantidad, double Precio, double SubTotal) {
        this.idCompra = idCompra;
        this.idIngredientes = idIngredientes;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.SubTotal = SubTotal;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTota) {
        this.SubTotal = SubTota;
    }
}
