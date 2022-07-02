package Modelo;

public class Factura {

    private String idFactura;
    private double igv;
    private double totalPagar;
    private double total;
    private int idFormaPago;
    private String FormaPago;
    private String idCLiente;
    private String Cliente;
    private int DNI;
    private String idPedido;

    public Factura() {
    }

    public Factura(String idFactura, float igv, float totalPagar, float total, int idFormaPago, String FormaPago, String idCLiente, String Cliente, int DNI, String idPedido) {
        this.idFactura = idFactura;
        this.igv = igv;
        this.totalPagar = totalPagar;
        this.total = total;
        this.idFormaPago = idFormaPago;
        this.FormaPago = FormaPago;
        this.idCLiente = idCLiente;
        this.Cliente = Cliente;
        this.DNI = DNI;
        this.idPedido = idPedido;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getIdFormaPago() {
        return idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getFormaPago() {
        return FormaPago;
    }

    public void setFormaPago(String FormaPago) {
        this.FormaPago = FormaPago;
    }

    public String getIdCLiente() {
        return idCLiente;
    }

    public void setIdCLiente(String idCLiente) {
        this.idCLiente = idCLiente;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

}
