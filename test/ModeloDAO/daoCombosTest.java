/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Combos;
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
public class daoCombosTest {

    public daoCombosTest() {
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
    public void testBuscar() throws Exception {
        System.out.println("Buscar");
        daoCombos com = new daoCombos();
        String Letra = "";
        List<Combos> lista = com.Buscar(Letra);
        for (Combos c : lista) {
            System.out.println(c.getIdProducto());
            System.out.println(c.getNombre());
            System.out.println(c.getIdProductoContenido());
            System.out.println(c.getNombreContenido());
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        daoCombos com = new daoCombos();
        List<Combos> lista = com.Listar();
        for (Combos c : lista) {
            System.out.println(c.getIdProducto());
            System.out.println(c.getNombre());
            System.out.println(c.getIdProductoContenido());
            System.out.println(c.getNombreContenido());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Combos com = new Combos();
        daoCombos daocom = new daoCombos();
        com.setIdProducto("");
        com.setIdProductoContenido("");
        daocom.Registrar(com);
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoCombos daocom = new daoCombos();
        String idCom = "PRO00000014";
        daocom.Eliminar(idCom);
        
    }

}
