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
public class VentasTest {
    
    public VentasTest() {
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
    public void testGetIdVentas() {
        System.out.println("getIdVentas");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setIdVentas("");
        String result = instance.getIdVentas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdVentas() {
        System.out.println("setIdVentas");
        String idVentas = "";
        Ventas instance = new Ventas();
        instance.setIdVentas(idVentas);
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setIdCliente("");
        String result = instance.getIdCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        String idCliente = "";
        Ventas instance = new Ventas();
        instance.setIdCliente(idCliente);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testGetFecha_Pedido() {
        System.out.println("getFecha_Pedido");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setFecha_Pedido("");
        String result = instance.getFecha_Pedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //faie test case is a prototype.");
    }

    @Test
    public void testSetFecha_Pedido() {
        System.out.println("setFecha_Pedido");
        String Fecha_Pedido = "";
        Ventas instance = new Ventas();
        instance.setFecha_Pedido(Fecha_Pedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetLongitud() {
        System.out.println("getLongitud");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setLongitud("");
        String result = instance.getLongitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetLongitud() {
        System.out.println("setLongitud");
        String Longitud = "";
        Ventas instance = new Ventas();
        instance.setLongitud(Longitud);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetLatitud() {
        System.out.println("getLatitud");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setLatitud("");
        String result = instance.getLatitud();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetLatitud() {
        System.out.println("setLatitud");
        String latitud = "";
        Ventas instance = new Ventas();
        instance.setLatitud(latitud);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Ventas instance = new Ventas();
        double expResult = 0.0;
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0;
        Ventas instance = new Ventas();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setEstado("");
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String Estado = "";
        Ventas instance = new Ventas();
        instance.setEstado(Estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Ventas instance = new Ventas();
        String expResult = "";
        instance.setCliente("");
        String result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        String Cliente = "";
        Ventas instance = new Ventas();
        instance.setCliente(Cliente);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
