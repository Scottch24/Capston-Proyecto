/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.CategoriaProductos;
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
public class daoCategoriaProductosTest {

    public daoCategoriaProductosTest() {
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
        CategoriaProductos cat = new CategoriaProductos();
        daoCategoriaProductos catdao = new daoCategoriaProductos();
        String Letra = "";
        List<CategoriaProductos> lista = catdao.Buscar(Letra);

        for (CategoriaProductos c : lista) {
            //System.out.println("Nombre del Categoria: " + c.getDescripcion());
            //System.out.println("Estado del Categoria: " + c.getEstado());
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        CategoriaProductos cat = new CategoriaProductos();
        daoCategoriaProductos catdao = new daoCategoriaProductos();
        String Letra = "";
        List<CategoriaProductos> lista = catdao.Listar();

        for (CategoriaProductos c : lista) {
            //  System.out.println("Nombre del Categoria: " + c.getDescripcion());
            //   System.out.println("Estado del Categoria: " + c.getEstado());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        CategoriaProductos cat = new CategoriaProductos();
        daoCategoriaProductos catdao = new daoCategoriaProductos();
        String NombreCategoria = "";
        cat.setDescripcion(NombreCategoria);
        System.out.println(catdao.Registrar(cat));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoCategoriaProductos catdao = new daoCategoriaProductos();
        int id = 0;
        catdao.Eliminar(id);
    }

}
