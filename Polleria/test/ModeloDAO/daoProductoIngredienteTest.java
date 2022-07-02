/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.ProductoIngrediente;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoProductoIngredienteTest {

    public daoProductoIngredienteTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testBuscar() throws Exception {
        System.out.println("Buscar");
        daoProductoIngrediente daomar = new daoProductoIngrediente();
        String Letra = "";
        List<ProductoIngrediente> lista = daomar.Buscar(Letra);
        for (ProductoIngrediente c : lista) {
            /*System.out.println(c.getIdProducto());
            System.out.println(c.getProducto());
            System.out.println(c.getIdIngredientes());
            System.out.println(c.getIngrediente());*/
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        daoProductoIngrediente daomar = new daoProductoIngrediente();
        List<ProductoIngrediente> lista = daomar.Listar();
        for (ProductoIngrediente c : lista) {
            /* System.out.println(c.getIdProducto());
            System.out.println(c.getProducto());
            System.out.println(c.getIdIngredientes());
            System.out.println(c.getIngrediente());*/
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        ProductoIngrediente pro = new ProductoIngrediente();
        daoProductoIngrediente daopro = new daoProductoIngrediente();
        pro.setIdProducto("PRO00000003");
        pro.setCantidad(20);
        pro.setIdIngredientes(3);
        // System.out.println(daopro.Registrar(pro));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoProductoIngrediente daopro = new daoProductoIngrediente();
        daopro.Eliminar("PRO00000005", 3);
    }

}
