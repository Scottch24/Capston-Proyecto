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
public class DetalleComprasTest {
    
    public DetalleComprasTest() {
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
    public void testGetIdCompra() {
        System.out.println("getIdCompra");
        DetalleCompras instance = new DetalleCompras();
        String expResult = "";
        instance.setIdCompra("");
        String result = instance.getIdCompra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdCompra() {
        System.out.println("setIdCompra");
        String idCompra = "";
        DetalleCompras instance = new DetalleCompras();
        instance.setIdCompra(idCompra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdIngredientes() {
        System.out.println("getIdIngredientes");
        DetalleCompras instance = new DetalleCompras();
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
        DetalleCompras instance = new DetalleCompras();
        instance.setIdIngredientes(idIngredientes);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        DetalleCompras instance = new DetalleCompras();
        String expResult = "";
        instance.setNombre("");
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        DetalleCompras instance = new DetalleCompras();
        instance.setNombre(Nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        DetalleCompras instance = new DetalleCompras();
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
        DetalleCompras instance = new DetalleCompras();
        instance.setCantidad(Cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        DetalleCompras instance = new DetalleCompras();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double Precio = 0.0;
        DetalleCompras instance = new DetalleCompras();
        instance.setPrecio(Precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        DetalleCompras instance = new DetalleCompras();
        double expResult = 0.0;
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double SubTota = 0.0;
        DetalleCompras instance = new DetalleCompras();
        instance.setSubTotal(SubTota);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
