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
public class FormasPagoTest {
    
    public FormasPagoTest() {
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
     * Test of getIdFormapago method, of class FormasPago.
     */
    @Test
    public void testGetIdFormapago() {
        System.out.println("getIdFormapago");
        FormasPago instance = new FormasPago();
        int expResult = 0;
        instance.setIdFormapago(0);
        int result = instance.getIdFormapago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFormapago method, of class FormasPago.
     */
    @Test
    public void testSetIdFormapago() {
        System.out.println("setIdFormapago");
        int idFormapago = 0;
        FormasPago instance = new FormasPago();
        instance.setIdFormapago(idFormapago);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFormaPägo method, of class FormasPago.
     */
    @Test
    public void testGetFormaPägo() {
        System.out.println("getFormaP\u00e4go");
        FormasPago instance = new FormasPago();
        String expResult = "";
        instance.setFormaPägo("");
        String result = instance.getFormaPägo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaPägo method, of class FormasPago.
     */
    @Test
    public void testSetFormaPägo() {
        System.out.println("setFormaP\u00e4go");
        String FormaPägo = "";
        FormasPago instance = new FormasPago();
        instance.setFormaPägo(FormaPägo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
