/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.DetalleVenta;
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
public class daoVentaDetalleTest {

    public daoVentaDetalleTest() {
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
        String CodigoPedido = "PE00000001";
        daoVentaDetalle daoVent = new daoVentaDetalle();
        List<DetalleVenta> lista = daoVent.Listar(CodigoPedido);
        for (DetalleVenta c : lista) {
            System.out.println(c.getidVenta());
            System.out.println(c.getIdProducto());
            System.out.println(c.getProducto());
            System.out.println(c.getCantidad());
            System.out.println(c.getPrecio());
            System.out.println(c.getSubTotal());
        }
    }

    @Test
    public void testRegistrar() {
        System.out.println("Registrar");
        DetalleVenta dvent = new DetalleVenta();
        daoVentaDetalle daodvent = new daoVentaDetalle();
        dvent.setidVenta("PE00000001");
        dvent.setIdProducto("PRO00000002");
        dvent.setCantidad(10);
        dvent.setPrecio(1100);
        dvent.setSubTotal(100);
        daodvent.Registrar(dvent);
    }

}
