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
public class FacturaTest {

    public FacturaTest() {
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

    /**
     * Test of getIdFactura method, of class Factura.
     */
    @Test
    public void testGetIdFactura() {
        System.out.println("getIdFactura");
        Factura instance = new Factura();
        String expResult = "";
        instance.setIdFactura("");
        String result = instance.getIdFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFactura method, of class Factura.
     */
    @Test
    public void testSetIdFactura() {
        System.out.println("setIdFactura");
        String idFactura = "";
        Factura instance = new Factura();
        instance.setIdFactura(idFactura);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIgv method, of class Factura.
     */
    @Test
    public void testGetIgv() {
        System.out.println("getIgv");
        Factura instance = new Factura();
        double expResult = 0.0;
        instance.setIgv(0);
        double result = instance.getIgv();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIgv method, of class Factura.
     */
    @Test
    public void testSetIgv() {
        System.out.println("setIgv");
        double igv = 0.0;
        Factura instance = new Factura();
        instance.setIgv(igv);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalPagar method, of class Factura.
     */
    @Test
    public void testGetTotalPagar() {
        System.out.println("getTotalPagar");
        Factura instance = new Factura();
        double expResult = 0.0;
        instance.setTotalPagar(0);
        double result = instance.getTotalPagar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalPagar method, of class Factura.
     */
    @Test
    public void testSetTotalPagar() {
        System.out.println("setTotalPagar");
        double totalPagar = 0.0F;
        Factura instance = new Factura();
        instance.setTotalPagar(totalPagar);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Factura.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Factura instance = new Factura();
        double expResult = 0.0;
        instance.setTotal(0);
        double result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class Factura.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        double total = 0.0F;
        Factura instance = new Factura();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdFormaPago method, of class Factura.
     */
    @Test
    public void testGetIdFormaPago() {
        System.out.println("getIdFormaPago");
        Factura instance = new Factura();
        int expResult = 0;
        instance.setIdFormaPago(0);
        int result = instance.getIdFormaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFormaPago method, of class Factura.
     */
    @Test
    public void testSetIdFormaPago() {
        System.out.println("setIdFormaPago");
        int idFormaPago = 0;
        Factura instance = new Factura();
        instance.setIdFormaPago(idFormaPago);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFormaPago method, of class Factura.
     */
    @Test
    public void testGetFormaPago() {
        System.out.println("getFormaPago");
        Factura instance = new Factura();
        String expResult = "";
        instance.setFormaPago("");
        String result = instance.getFormaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaPago method, of class Factura.
     */
    @Test
    public void testSetFormaPago() {
        System.out.println("setFormaPago");
        String FormaPago = "";
        Factura instance = new Factura();
        instance.setFormaPago(FormaPago);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCLiente method, of class Factura.
     */
    @Test
    public void testGetIdCLiente() {
        System.out.println("getIdCLiente");
        Factura instance = new Factura();
        String expResult = "";
        instance.setIdCLiente("");
        String result = instance.getIdCLiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCLiente method, of class Factura.
     */
    @Test
    public void testSetIdCLiente() {
        System.out.println("setIdCLiente");
        String idCLiente = "";
        Factura instance = new Factura();
        instance.setIdCLiente(idCLiente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Factura.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Factura instance = new Factura();
        String expResult = "";
        instance.setCliente("");
        String result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Factura.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        String Cliente = "";
        Factura instance = new Factura();
        instance.setCliente(Cliente);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDNI method, of class Factura.
     */
    @Test
    public void testGetDNI() {
        System.out.println("getDNI");
        Factura instance = new Factura();
        int expResult = 0;
        instance.setDNI(0);
        int result = instance.getDNI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDNI method, of class Factura.
     */
    @Test
    public void testSetDNI() {
        System.out.println("setDNI");
        int DNI = 0;
        Factura instance = new Factura();
        instance.setDNI(DNI);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdPedido method, of class Factura.
     */
    @Test
    public void testGetIdPedido() {
        System.out.println("getIdPedido");
        Factura instance = new Factura();
        String expResult = "";
        instance.setIdPedido("");
        String result = instance.getIdPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdPedido method, of class Factura.
     */
    @Test
    public void testSetIdPedido() {
        System.out.println("setIdPedido");
        String idPedido = "";
        Factura instance = new Factura();
        instance.setIdPedido(idPedido);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
