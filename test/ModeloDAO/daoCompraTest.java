/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Compras;
import java.util.ArrayList;
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
public class daoCompraTest {
    
    public daoCompraTest() {
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
    public void testListar() {
        System.out.println("Listar");
        String Letra = "";
        daoCompra instance = new daoCompra();
        ArrayList<Compras> expResult = null;
        ArrayList<Compras> result = instance.Listar(Letra);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Compras be = new Compras();
        daoCompra daoCom = new daoCompra();
        be.setIdEmpleado("EMP00000001");
        be.setIdProveedor(1);
        be.setTotal_Compra(100);
       // System.out.println(daoCom.Registrar(be));
        
    }
    
}
