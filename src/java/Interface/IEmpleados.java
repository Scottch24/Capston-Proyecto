
package Interface;

import Modelo.Empleados;
import java.util.ArrayList;

public interface IEmpleados {

    public ArrayList<Empleados> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Empleados> Listar() throws ClassNotFoundException;

    public String Registrar(Empleados be) throws ClassNotFoundException;

    public String Actualizar(Empleados be) throws ClassNotFoundException;

    public void Eliminar(String id) throws ClassNotFoundException;
}
