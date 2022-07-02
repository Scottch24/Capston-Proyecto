package Modelo;

public class ProductoIngrediente {

    private String idProducto;
    private int Cantidad;
    private int idIngredientes;
    private String Producto;
    private String Ingrediente;

    public ProductoIngrediente() {
    }

    public ProductoIngrediente(String idProducto, int Cantidad, int idIngredientes, String Producto, String Ingrediente) {
        this.idProducto = idProducto;
        this.Cantidad = Cantidad;
        this.idIngredientes = idIngredientes;
        this.Producto = Producto;
        this.Ingrediente = Ingrediente;
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

    public int getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getIngrediente() {
        return Ingrediente;
    }

    public void setIngrediente(String Ingrediente) {
        this.Ingrediente = Ingrediente;
    }
    
}
