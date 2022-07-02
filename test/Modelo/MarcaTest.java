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
public class MarcaTest {
    
    public MarcaTest() {
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
     * Test of getIdMarca method, of class Marca.
     */
    @Test
    public void testGetIdMarca() {
        System.out.println("getIdMarca");
        Marca instance = new Marca();
        int expResult = 0;
        instance.setIdMarca(0);
        int result = instance.getIdMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdMarca method, of class Marca.
     */
    @Test
    public void testSetIdMarca() {
        System.out.println("setIdMarca");
        int idMarca = 0;
        Marca instance = new Marca();
        instance.setIdMarca(idMarca);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Marca.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Marca instance = new Marca();
        String expResult = "";
        instance.setDescripcion("");
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescripcion method, of class Marca.
     */
    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "";
        Marca instance = new Marca();
        instance.setDescripcion(Descripcion);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    
}
