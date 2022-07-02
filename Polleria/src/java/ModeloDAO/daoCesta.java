package ModeloDAO;

import Interface.ICesta;
import Modelo.Productos;
import java.util.ArrayList;
import java.util.List;

public class daoCesta implements ICesta {

    private List<Productos> lista;
    private double total;

    public daoCesta() {
        lista = new ArrayList();
        total = 0;
    }

    @Override
    public void agregar(Productos e) {
        int r = buscar(e.getIdProductos());
        if (r >= 0) {
            Productos tmp = lista.get(r);
            int cantidad = tmp.getStock();
            cantidad = cantidad + e.getStock();
            tmp.setStock(cantidad);
            total = total + (e.getPrecio() * e.getStock());
        } else {
            lista.add(e);
            total = total + (e.getPrecio() * e.getStock());
        }
    }

    @Override
    public void retirar(Productos e) {
        int r = buscar(e.getIdProductos());
        if (r >= 0) {
            Productos tmp = lista.get(r);
            tmp.setStock(tmp.getStock() - 1);
            total = total - (tmp.getPrecio() * tmp.getStock());
            if (tmp.getStock() == 0) {
                lista.remove(r);
            }
        }
    }

    @Override
    public int buscar(String cod) {
        int r = -1;
        int i = -1;
        for (Productos e : lista) {
            i++;
            if (e.getIdProductos().equalsIgnoreCase(cod)) {
                r = i;
            }
        }
        return r;
    }

    public List<Productos> getLista() {
        return lista;
    }
    
    public void setLista(List lista){
        this.lista = lista;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }



}
