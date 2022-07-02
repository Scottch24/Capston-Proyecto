package Modelo;

public class Marca {

    private int idMarca;
    private String Descripcion;
    private String FechaActualiza;
    private String estado;
    
    public Marca() {
    }

    public Marca(int idMarca, String Descripcion, String FechaActualiza, String estado) {
        this.idMarca = idMarca;
        this.Descripcion = Descripcion;
        this.FechaActualiza = FechaActualiza;
        this.estado = estado;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
