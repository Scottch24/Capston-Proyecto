package ModeloDAO;

import Interface.ICestaCompra;
import Modelo.Insumos;
import java.util.ArrayList;
import java.util.List;

public class daoCestaCompra implements ICestaCompra {

    private List<Insumos> lista;
    private double total;

    public daoCestaCompra() {
        lista = new ArrayList();
        total = 0;
    }

    @Override
    public void agregar(Insumos e) {
        int r = buscar(e.getIdIngrediente());
        if (r >= 0) {
            Insumos tmp = lista.get(r);
            int cantidad = tmp.getCantidad();
            cantidad = cantidad + e.getCantidad();
            tmp.setCantidad(cantidad);
            total = total + (e.getPrecio() * e.getCantidad());
        } else {
            lista.add(e);
            total = total + (e.getPrecio() * e.getCantidad());
        }
    }

    @Override
    public void retirar(Insumos e) {
        int r = buscar(e.getIdIngrediente());
        if (r >= 0) {
            Insumos tmp = lista.get(r);
            tmp.setCantidad(tmp.getCantidad() - 10);
            total = total - (tmp.getPrecio() * tmp.getCantidad());
            if (tmp.getCantidad() == 0) {
                lista.remove(r);
            }
        }
    }

    @Override
    public int buscar(int cod) {
        int r = -1;
        int i = -1;
        for (Insumos e : lista) {
            i++;
            if (e.getIdIngrediente() == cod) {
                r = i;
            }
        }
        return r;
    }

    public List<Insumos> getLista() {
        return lista;
    }

    public void setLista(List lista) {
        this.lista = lista;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
