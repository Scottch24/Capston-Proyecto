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
public class CargoTest {
    
    public CargoTest() {
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
    public void testGetIdCargo() {
        System.out.println("getIdCargo");
        Cargo instance = new Cargo();
        int expResult = 0;
        instance.setIdCargo(0);
        int result = instance.getIdCargo();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdCargo() {
        System.out.println("setIdCargo");
        int IdCargo = 0;
        Cargo instance = new Cargo();
        instance.setIdCargo(IdCargo);
    }
    
        @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Cargo instance = new Cargo();
        String expResult = "";
        instance.setDescripcion("");
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "";
        Cargo instance = new Cargo();
        instance.setDescripcion(Descripcion);
    }
    
    @Test
    public void testIsEstado() {
        System.out.println("isEstado");
        Cargo instance = new Cargo();
        String result = instance.getEstado();
        
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Cargo instance = new Cargo();
        instance.setEstado(estado);
    }
    
}
