/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.DetalleCompras;
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
public class daoCompraDetalleTest {
    
    public daoCompraDetalleTest() {
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
        String CodigoCompra = "PE00000001";
        daoCompraDetalle daocom = new daoCompraDetalle();
        List<DetalleCompras> lista = daocom.Listar(CodigoCompra);
        for(DetalleCompras c: lista){
            System.out.println(c.getIdIngredientes());
        }
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        DetalleCompras dpo = new DetalleCompras();
        daoCompraDetalle daodpo = new daoCompraDetalle();
        dpo.setIdCompra("PE00000001");
        dpo.setIdIngredientes(1);
        dpo.setCantidad(10);
        dpo.setPrecio(100);
        dpo.setSubTotal(400);
        //daodpo.Registrar(dpo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
