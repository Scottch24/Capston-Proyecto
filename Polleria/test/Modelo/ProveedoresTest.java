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
public class ProveedoresTest {
    
    public ProveedoresTest() {
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
    public void testGetIdProveedor() {
        System.out.println("getIdProveedor");
        Proveedores instance = new Proveedores();
        int expResult = 0;
        instance.setIdProveedor(0);
        int result = instance.getIdProveedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdProveedor() {
        System.out.println("setIdProveedor");
        int idProveedor = 0;
        Proveedores instance = new Proveedores();
        instance.setIdProveedor(idProveedor);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetRazonSocial() {
        System.out.println("getRazonSocial");
        Proveedores instance = new Proveedores();
        String expResult = "";
        instance.setRazonSocial("");
        String result = instance.getRazonSocial();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetRazonSocial() {
        System.out.println("setRazonSocial");
        String RazonSocial = "";
        Proveedores instance = new Proveedores();
        instance.setRazonSocial(RazonSocial);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetRUC() {
        System.out.println("getRUC");
        Proveedores instance = new Proveedores();
        String expResult = "";
        instance.setRUC("");
        String result = instance.getRUC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testSetRUC() {
        System.out.println("setRUC");
        String RUC = "";
        Proveedores instance = new Proveedores();
        instance.setRUC(RUC);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Proveedores instance = new Proveedores();
        String expResult = "";
        instance.setTelefono("");
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String Telefono = "";
        Proveedores instance = new Proveedores();
        instance.setTelefono(Telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetContacto() {
        System.out.println("getContacto");
        Proveedores instance = new Proveedores();
        String expResult = "";
        instance.setContacto("");
        String result = instance.getContacto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetContacto() {
        System.out.println("setContacto");
        String Contacto = "";
        Proveedores instance = new Proveedores();
        instance.setContacto(Contacto);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
