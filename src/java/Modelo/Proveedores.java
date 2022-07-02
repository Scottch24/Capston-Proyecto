
package Modelo;


public class Proveedores {
    
    private int idProveedor;
    private String RazonSocial;
    private String RUC;
    private String Telefono;
    private String Contacto;
    private String UltimaFecha;
    private String Estado;

    public Proveedores() {
    }

    public Proveedores(int idProveedor, String RazonSocial, String RUC, String Telefono, String Contacto,String Fecha,String Estado) {
        this.idProveedor = idProveedor;
        this.RazonSocial = RazonSocial;
        this.RUC = RUC;
        this.Telefono = Telefono;
        this.Contacto = Contacto;
        this.UltimaFecha = Fecha;
        this.Estado = Estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUltimaFecha() {
        return UltimaFecha;
    }

    public void setUltimaFecha(String UltimaFecha) {
        this.UltimaFecha = UltimaFecha;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getContacto() {
        return Contacto;
    }

    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
    }
    
    
    
    
    
    
    
}
