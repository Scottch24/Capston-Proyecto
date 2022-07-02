package Interface;

import Modelo.CategoriaProductos;
import java.util.ArrayList;
import java.util.List;

public interface ICategoriaProductos {

    public ArrayList<CategoriaProductos> Buscar(String Letra);

    public ArrayList<CategoriaProductos> Listar();

    public String Registrar(CategoriaProductos CPS);

    public void Eliminar(int id);
    

}
