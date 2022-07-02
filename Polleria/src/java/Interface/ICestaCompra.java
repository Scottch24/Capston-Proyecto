
package Interface;

import Modelo.Insumos;

public interface ICestaCompra {
    
    public void agregar(Insumos e);

    public void retirar(Insumos e);

    public int buscar(int cod);
}
