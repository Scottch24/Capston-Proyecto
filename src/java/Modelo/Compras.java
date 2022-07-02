
package Modelo;

public class Compras {
    
    private String idCompra;
    private String idEmpleado;
    private int idProveedor;
    private String Empleado;
    private String RazonSocial;
    private String RUC;
    private String Fecha_Compra;
    private double Total_Compra;

    public Compras() {
    }

    public Compras(String idCompra, String idEmpleado, int idProveedor, String Empleado, String RazonSocial, String RUC, String Fecha_Compra, double Total_Compra) {
        this.idCompra = idCompra;
        this.idEmpleado = idEmpleado;
        this.idProveedor = idProveedor;
        this.Empleado = Empleado;
        this.RazonSocial = RazonSocial;
        this.RUC = RUC;
        this.Fecha_Compra = Fecha_Compra;
        this.Total_Compra = Total_Compra;
    }

    public String getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(String idCompra) {
        this.idCompra = idCompra;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(String Empleao) {
        this.Empleado = Empleao;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getFecha_Compra() {
        return Fecha_Compra;
    }

    public void setFecha_Compra(String Fecha_Compra) {
        this.Fecha_Compra = Fecha_Compra;
    }

    public double getTotal_Compra() {
        return Total_Compra;
    }

    public void setTotal_Compra(double Total_Compr) {
        this.Total_Compra = Total_Compr;
    }
    
    
    
    
    
    
}
