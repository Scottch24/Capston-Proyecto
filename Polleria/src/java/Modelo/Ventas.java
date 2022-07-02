package Modelo;

public class Ventas {

    private String idVentas;
    private String idCliente;
    private String Fecha_Pedido;
    private String Longitud;
    private String latitud;
    private double total;
    private String Estado;
    private String Cliente;

    public Ventas() {
    }

    public Ventas(String idVentas, String idCliente, String Fecha_Pedido, String Longitud, String latitud, double total, String Estado, String Cliente) {
        this.idVentas = idVentas;
        this.idCliente = idCliente;
        this.Fecha_Pedido = Fecha_Pedido;
        this.Longitud = Longitud;
        this.latitud = latitud;
        this.total = total;
        this.Estado = Estado;
        this.Cliente = Cliente;
    }

    public String getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(String idVentas) {
        this.idVentas = idVentas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getFecha_Pedido() {
        return Fecha_Pedido;
    }

    public void setFecha_Pedido(String Fecha_Pedido) {
        this.Fecha_Pedido = Fecha_Pedido;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }
    
    

}
