/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ConexionTest {

    public ConexionTest() {
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
    public void testConectar() {
        try {
            System.out.println("Conectar");
            Conexion instance = new Conexion();
            instance.Conectar();
            
            // TODO review the generated test code and remove the default call to fail.
            //fail("The test case is a prototype.");
        } catch (Exception ex) {
            Logger.getLogger(ConexionTest.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
