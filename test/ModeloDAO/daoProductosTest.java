/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Productos;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoProductosTest {

    public daoProductosTest() {
    }

    @Test
    public void testBuscar() throws Exception {
        System.out.println("\nBuscar");
        Productos pro = new Productos();
        daoProductos daopro = new daoProductos();
        String Letra = "";
        List<Productos> buscar = daopro.Buscar(Letra);
        for (Productos c : buscar) {
            /*System.out.println("\n\nIdProducto: " + c.getIdProductos());
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Precio: " + c.getPrecio());
            System.out.println("Stock: " + c.getStock());
            System.out.println("Categoria: " + c.getCategoria());
            System.out.println("Estado: " + c.getEstado());
            System.out.println("Fecha Actualizacion: " + c.getFechaActualiza());*/

        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("\nListar");
        Productos pro = new Productos();
        daoProductos daopro = new daoProductos();
        List<Productos> lista = daopro.Listar();
        for (Productos c : lista) {
            System.out.println("\n\nIdProducto: " + c.getIdProductos());
            System.out.println("Nombre: " + c.getNombre());
            System.out.println("Precio: " + c.getPrecio());
            System.out.println("Stock: " + c.getStock());
            System.out.println("Categoria: " + c.getCategoria());
            System.out.println("Estado: " + c.getEstado());
            System.out.println("Fecha Actualizacion: " + c.getFechaActualiza());

        }
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Productos pro = new Productos();
        daoProductos dapro = new daoProductos();
        pro.setNombre("asdasdddddd");
        pro.setDescripcion("asfasf");
        pro.setPrecio(2323);
        pro.setIdCategoria(1);
        pro.setImagen(null);
        pro.setStock(345);
        System.out.println(dapro.Registrar(pro));
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Productos pro = new Productos();
        daoProductos dapro = new daoProductos();
        pro.setIdProductos("");
        pro.setNombre("");
        pro.setDescripcion("");
        pro.setPrecio(0);
        pro.setIdCategoria(1);
        pro.setImagen(null);
        pro.setStock(0);
        //System.out.println(dapro.Actualizar(pro));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoProductos dapro = new daoProductos();
        String id = "";
      //  dapro.Eliminar(id);
    }

}
