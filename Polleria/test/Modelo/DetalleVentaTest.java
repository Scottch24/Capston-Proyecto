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
public class DetalleVentaTest {
    
    public DetalleVentaTest() {
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
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        DetalleVenta instance = new DetalleVenta();
        String expResult = "";
        instance.setidVenta("");
        String result = instance.getidVenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        String idPedido = "";
        DetalleVenta instance = new DetalleVenta();
        instance.setidVenta(idPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        DetalleVenta instance = new DetalleVenta();
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
        DetalleVenta instance = new DetalleVenta();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        DetalleVenta instance = new DetalleVenta();
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
        DetalleVenta instance = new DetalleVenta();
        instance.setCantidad(Cantidad);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        DetalleVenta instance = new DetalleVenta();
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
        DetalleVenta instance = new DetalleVenta();
        instance.setPrecio(Precio);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        DetalleVenta instance = new DetalleVenta();
        String expResult = "";
        instance.setProducto("");
        String result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        String Producto = "";
        DetalleVenta instance = new DetalleVenta();
        instance.setProducto(Producto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetSubTotal() {
        System.out.println("getSubTotal");
        DetalleVenta instance = new DetalleVenta();
        double expResult = 0.0;
        double result = instance.getSubTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetSubTotal() {
        System.out.println("setSubTotal");
        double SubTotal = 0.0;
        DetalleVenta instance = new DetalleVenta();
        instance.setSubTotal(SubTotal);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
