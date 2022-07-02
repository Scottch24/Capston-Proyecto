package Interface;

import Modelo.DetalleVenta;
import java.util.ArrayList;

public interface IVentaDetalle {

    public ArrayList<DetalleVenta> Listar(String CodigoPedido);

    public String Registrar(DetalleVenta be);

}
