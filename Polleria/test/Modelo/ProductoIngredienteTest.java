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
public class ProductoIngredienteTest {

    public ProductoIngredienteTest() {
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
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        ProductoIngrediente instance = new ProductoIngrediente();
        String expResult = "";
        instance.setIdProducto("");
        String result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        String idProducto = "";
        ProductoIngrediente instance = new ProductoIngrediente();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        ProductoIngrediente instance = new ProductoIngrediente();
        int expResult = 0;
        int result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        int Cantidad = 0;
        ProductoIngrediente instance = new ProductoIngrediente();
        instance.setCantidad(Cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdIngredientes() {
        System.out.println("getIdIngredientes");
        ProductoIngrediente instance = new ProductoIngrediente();
        int expResult = 0;
        int result = instance.getIdIngredientes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdIngredientes() {
        System.out.println("setIdIngredientes");
        int idIngredientes = 0;
        ProductoIngrediente instance = new ProductoIngrediente();
        instance.setIdIngredientes(idIngredientes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        ProductoIngrediente instance = new ProductoIngrediente();
        String expResult = "";
        instance.setProducto("");
        String result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        String Producto = "";
        ProductoIngrediente instance = new ProductoIngrediente();
        instance.setProducto(Producto);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testGetIngrediente() {
        System.out.println("getIngrediente");
        ProductoIngrediente instance = new ProductoIngrediente();
        String expResult = "";
        instance.setIngrediente("");
        String result = instance.getIngrediente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testSetIngrediente() {
        System.out.println("setIngrediente");
        String Ingrediente = "";
        ProductoIngrediente instance = new ProductoIngrediente();
        instance.setIngrediente(Ingrediente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
