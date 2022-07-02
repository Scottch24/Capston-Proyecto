package Interface;

import Modelo.ProductoIngrediente;
import Modelo.Productos;
import java.util.ArrayList;

public interface IProductoIngrediente {

    public ArrayList<ProductoIngrediente> Buscar(String Letra);

    public ArrayList<ProductoIngrediente> Listar();

    public String Registrar(ProductoIngrediente be);

    public void Eliminar(String idPro, int idIngre);

}
