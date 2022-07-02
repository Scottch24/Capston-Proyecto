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
public class ComprasTest {
    
    public ComprasTest() {
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
        Compras instance = new Compras();
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
        Compras instance = new Compras();
        instance.setIdCompra(idCompra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdEmpleado() {
        System.out.println("getIdEmpleado");
        Compras instance = new Compras();
        String expResult = "";
        instance.setIdEmpleado("");
        String result = instance.getIdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdEmpleado() {
        System.out.println("setIdEmpleado");
        String idEmpleado = "";
        Compras instance = new Compras();
        instance.setIdEmpleado(idEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        Compras instance = new Compras();
        int expResult = 0;
        int result = instance.getIdProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetIdProveedor() {
        System.out.println("setIdProveedor");
        int idProveedor = 0;
        Compras instance = new Compras();
        instance.setIdProveedor(idProveedor);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetEmpleado() {
        System.out.println("getEmpleado");
        Compras instance = new Compras();
        String expResult = "";
        instance.setEmpleado("");
        String result = instance.getEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetEmpleado() {
        System.out.println("setEmpleado");
        String Empleao = "";
        Compras instance = new Compras();
        instance.setEmpleado(Empleao);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetRazonSocial() {
        System.out.println("getRazonSocial");
        Compras instance = new Compras();
        String expResult = "";
        instance.setRazonSocial("");
        String result = instance.getRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetRazonSocial() {
        System.out.println("setRazonSocial");
        String RazonSocial = "";
        Compras instance = new Compras();
        instance.setRazonSocial(RazonSocial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetRUC() {
        System.out.println("getRUC");
        Compras instance = new Compras();
        String expResult = "";
        instance.setRUC("");
        String result = instance.getRUC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetRUC() {
        System.out.println("setRUC");
        String RUC = "";
        Compras instance = new Compras();
        instance.setRUC(RUC);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetFecha_Compra() {
        System.out.println("getFecha_Compra");
        Compras instance = new Compras();
        String expResult = "";
        instance.setFecha_Compra("");
        String result = instance.getFecha_Compra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetFecha_Compra() {
        System.out.println("setFecha_Compra");
        String Fecha_Compra = "";
        Compras instance = new Compras();
        instance.setFecha_Compra(Fecha_Compra);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetTotal_Compra() {
        System.out.println("getTotal_Compra");
        Compras instance = new Compras();
        double expResult = 0.0;
        double result = instance.getTotal_Compra();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetTotal_Compra() {
        System.out.println("setTotal_Compra");
        double Total_Compr = 0.0;
        Compras instance = new Compras();
        instance.setTotal_Compra(Total_Compr);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
