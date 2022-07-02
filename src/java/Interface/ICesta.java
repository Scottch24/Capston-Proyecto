package Interface;

import Modelo.Productos;
import java.util.List;

public interface ICesta {

    public void agregar(Productos e);

    public void retirar(Productos e);

    public int buscar(String cod);

}
