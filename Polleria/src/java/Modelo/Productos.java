package Modelo;

import java.io.InputStream;

public class Productos {

    private String idProductos;
    private String Nombre;
    private String Descripcion;
    private double Precio;
    private int idCategoria;
    private String estado;
    private InputStream Imagen;
    private int[] imagenmostra;
    private String NombreArchivo;
    private String Categoria;
    private int Stock;
    private String FechaActualiza;

    public Productos() {
    }

    public Productos(String idProductos, String Nombre, String Descripcion, double Precio, int idCategoria, String estado, InputStream Imagen, int[] imagenmostra, String NombreArchivo, String Categoria, int Stock, String FechaActualiza) {
        this.idProductos = idProductos;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
        this.idCategoria = idCategoria;
        this.estado = estado;
        this.Imagen = Imagen;
        this.imagenmostra = imagenmostra;
        this.NombreArchivo = NombreArchivo;
        this.Categoria = Categoria;
        this.Stock = Stock;
        this.FechaActualiza = FechaActualiza;
    }

    public String getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(String idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public InputStream getImagen() {
        return Imagen;
    }

    public void setImagen(InputStream Imagen) {
        this.Imagen = Imagen;
    }

    public int[] getImagenmostra() {
        return imagenmostra;
    }

    public void setImagenmostra(int[] imagenmostra) {
        this.imagenmostra = imagenmostra;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getFechaActualiza() {
        return FechaActualiza;
    }

    public void setFechaActualiza(String FechaActualiza) {
        this.FechaActualiza = FechaActualiza;
    }

    
    

    

}
