/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.FormasPago;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoFormasPagoTest {
    
    public daoFormasPagoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of Listar method, of class daoFormasPago.
     */
    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        daoFormasPago fp = new daoFormasPago();
        List<FormasPago> lista = fp.Listar();
        for(FormasPago c: lista){
            System.out.println(c.getIdFormapago());
            System.out.println(c.getFormaPägo());
        }
    }
    
}
