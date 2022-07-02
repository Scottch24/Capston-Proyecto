/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

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
public class CategoriaProductosTest {

    public CategoriaProductosTest() {
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
    public void testGetIdCategoria() {
        System.out.println("getIdCategoria");
        CategoriaProductos instance = new CategoriaProductos();
        int expResult = 0;
        instance.setIdCategoria(0);
        int result = instance.getIdCategoria();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdCategoria() {
        System.out.println("setIdCategoria");
        int IdCategoria = 0;
        CategoriaProductos instance = new CategoriaProductos();
        instance.setIdCategoria(IdCategoria);
    }
    
        @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        CategoriaProductos instance = new CategoriaProductos();
        String expResult = "";
        instance.setDescripcion("");
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "";
        CategoriaProductos instance = new CategoriaProductos();
        instance.setDescripcion(Descripcion);
    }
    /*
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        CategoriaProductos instance = new CategoriaProductos();
        boolean expResult = false;
        boolean result = instance.();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        boolean estado = false;
        CategoriaProductos instance = new CategoriaProductos();
        instance.setEstado(estado);
    }
*/
}
