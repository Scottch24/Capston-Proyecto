
package Modelo;

public class Combos {

    private String idProducto;
    private String idProductoContenido;
    private String Nombre;
    private String NombreContenido;

    public Combos() {
    }

    public Combos(String idProducto, String idProductoContenido, String Nombre, String NombreContenido) {
        this.idProducto = idProducto;
        this.idProductoContenido = idProductoContenido;
        this.Nombre = Nombre;
        this.NombreContenido = NombreContenido;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProductoContenido() {
        return idProductoContenido;
    }

    public void setIdProductoContenido(String idProductoContenido) {
        this.idProductoContenido = idProductoContenido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombreContenido() {
        return NombreContenido;
    }

    public void setNombreContenido(String NombreContenido) {
        this.NombreContenido = NombreContenido;
    }

    
    
    
    
}
