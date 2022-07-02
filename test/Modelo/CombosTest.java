/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class CombosTest {
    
    public CombosTest() {
    }

    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        Combos instance = new Combos();
        String expResult = "";
        instance.setIdProducto("");
        String result = instance.getIdProducto();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        String idProducto = "";
        Combos instance = new Combos();
        instance.setIdProducto(idProducto);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdProductoContenido() {
        System.out.println("getIdProductoContenido");
        Combos instance = new Combos();
        String expResult = "";
        instance.setIdProductoContenido("");
        String result = instance.getIdProductoContenido();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdProductoContenido() {
        System.out.println("setIdProductoContenido");
        String idProductoContenido = "";
        Combos instance = new Combos();
        instance.setIdProductoContenido(idProductoContenido);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Combos instance = new Combos();
        String expResult = "";
        instance.setNombre("");
        String result = instance.getNombre();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Combos instance = new Combos();
        instance.setNombre(Nombre);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombreContenido() {
        System.out.println("getNombreContenido");
        Combos instance = new Combos();
        String expResult = "";
        instance.setNombreContenido("");
        String result = instance.getNombreContenido();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombreContenido() {
        System.out.println("setNombreContenido");
        String NombreContenido = "";
        Combos instance = new Combos();
        instance.setNombreContenido(NombreContenido);
        //fail("The test case is a prototype.");
    }
    
}
