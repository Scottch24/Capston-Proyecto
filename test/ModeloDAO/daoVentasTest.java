/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Ventas;
import java.util.ArrayList;
import java.util.List;
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
public class daoVentasTest {

    public daoVentasTest() {
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
        daoVentas vent = new daoVentas();
        List<Ventas> lista = vent.Listar(Letra);
        for (Ventas c : lista) {
           /* System.out.println(c.getIdVentas());
            System.out.println(c.getIdCliente());
            System.out.println(c.getCliente());
            System.out.println(c.getFecha_Pedido());
            System.out.println(c.getLatitud());
            System.out.println(c.getLongitud());
            System.out.println(c.getTotal());
            System.out.println(c.getEstado());*/
        }
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        Ventas vent = new Ventas();
        daoVentas daoVent = new daoVentas();
        vent.setIdCliente("CLI00000001");
        vent.setLongitud("5964894");
        vent.setLatitud("46486468");
        vent.setTotal(20);
       System.out.println(daoVent.Registrar(vent));
    }
   
    
    
}
