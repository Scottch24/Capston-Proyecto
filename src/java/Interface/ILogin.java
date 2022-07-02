package Interface;

import Modelo.Cliente;
import Modelo.Empleados;
import java.util.ArrayList;

public interface ILogin {

    public ArrayList<Empleados> DatosEmpleado(String Codigo);

    public ArrayList<Cliente> DatosCliente(String Codigo);

    public String InicioSesion_Cliente(Cliente be);

    public String InicioSesion_Empleados(Empleados be);
    
}
