package Modelo;

public class DetalleVenta {

    private String idVenta;
    private String idProducto;
    private int Cantidad;
    private double Precio;
    private String Producto;
    private double SubTotal;

    public DetalleVenta() {
    }

    public DetalleVenta(String idVenta, String idProducto, int Cantidad, double Precio, String Producto, double SubTotal) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
        this.Producto = Producto;
        this.SubTotal = SubTotal;
    }

    public String getidVenta() {
        return idVenta;
    }

    public void setidVenta(String idVenta) {
        this.idVenta = idVenta;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
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

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public double getSubTotal() {
        return SubTotal;
    }

    public void setSubTotal(double SubTotal) {
        this.SubTotal = SubTotal;
    }

    
    
    
    
    
    
}
