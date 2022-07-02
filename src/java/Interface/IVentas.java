package Interface;

import Modelo.Ventas;
import java.util.ArrayList;

public interface IVentas {

    public ArrayList<Ventas> Listar(String Letra);

    public String Registrar(Ventas be);
    
    
}
