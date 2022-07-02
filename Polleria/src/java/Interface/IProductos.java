package Interface;

import Modelo.Productos;
import java.util.ArrayList;
import javax.servlet.http.HttpServletResponse;

public interface IProductos {

    public ArrayList<Productos> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Productos> Listar() throws ClassNotFoundException;

    public ArrayList<Productos> ListarCategolo(String Categoria) throws ClassNotFoundException;

    public ArrayList<Productos> BuscarCategolo(String Categoria, String Letra) throws ClassNotFoundException;

    public String Registrar(Productos be);

    public String Actualizar(Productos be);

    public void Eliminar(String id);

    public void listarImg(String id, HttpServletResponse response) throws ClassNotFoundException;

}
