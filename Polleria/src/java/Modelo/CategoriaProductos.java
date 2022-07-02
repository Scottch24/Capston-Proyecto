
package Modelo;

public class CategoriaProductos {
    
    private int idCategoria;
    private String Descripcion;
    private String ultimaactualizacion;
    private String Estado;

    public CategoriaProductos() {
    }

    public CategoriaProductos(int idCategoria, String Descripcion, String ultimaactualizacion, String Estado) {
        this.idCategoria = idCategoria;
        this.Descripcion = Descripcion;
        this.ultimaactualizacion = ultimaactualizacion;
        this.Estado = Estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getUltimaactualizacion() {
        return ultimaactualizacion;
    }

    public void setUltimaactualizacion(String ultimaactualizacion) {
        this.ultimaactualizacion = ultimaactualizacion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    
    
    
}
