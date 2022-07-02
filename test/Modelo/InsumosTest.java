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
public class InsumosTest {
    
    public InsumosTest() {
    }

    @Test
    public void testGetIdIngrediente() {
        System.out.println("getIdIngrediente");
        Insumos instance = new Insumos();
        int expResult = 0;
        instance.setIdIngrediente(0);
        int result = instance.getIdIngrediente();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdIngrediente() {
        System.out.println("setIdIngrediente");
        int idIngrediente = 0;
        Insumos instance = new Insumos();
        instance.setIdIngrediente(idIngrediente);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Insumos instance = new Insumos();
        String expResult = "";
        instance.setNombre("");
        String result = instance.getNombre();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Insumos instance = new Insumos();
        instance.setNombre(Nombre);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetVencimiento() {
        System.out.println("getVencimiento");
        Insumos instance = new Insumos();
        String expResult = "";
        instance.setVencimiento("");
        String result = instance.getVencimiento();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetVencimiento() {
        System.out.println("setVencimiento");
        String Vencimiento = "";
        Insumos instance = new Insumos();
        instance.setVencimiento(Vencimiento);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdMarca() {
        System.out.println("getIdMarca");
        Insumos instance = new Insumos();
        int expResult = 0;
        instance.setIdMarca(0);
        int result = instance.getIdMarca();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdMarca() {
        System.out.println("setIdMarca");
        int idMarca = 0;
        Insumos instance = new Insumos();
        instance.setIdMarca(idMarca);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Insumos instance = new Insumos();
        String expResult = "";
        instance.setMarca("");
        String result = instance.getMarca();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String Marca = "";
        Insumos instance = new Insumos();
        instance.setMarca(Marca);
       // fail("The test case is a prototype.");
    }
    
}
