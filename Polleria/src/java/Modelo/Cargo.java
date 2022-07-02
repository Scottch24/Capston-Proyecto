package Modelo;

public class Cargo {

    private int idCargo;
    private String Descripcion;
    private String Estado;
    private String UltimaActualizacion;

    public Cargo() {
    }

    public Cargo(int idCargo, String Descripcion, String Estado, String UltimaActualizacion) {
        this.idCargo = idCargo;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
        this.UltimaActualizacion = UltimaActualizacion;
    }
    
    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getUltimaActualizacion() {
        return UltimaActualizacion;
    }

    public void setUltimaActualizacion(String UltimaActualizacion) {
        this.UltimaActualizacion = UltimaActualizacion;
    }

    
    
    
}
