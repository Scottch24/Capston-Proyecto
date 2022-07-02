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
public class EmpleadosTest {

    public EmpleadosTest() {
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

    /**
     * Test of getIdEmpleado method, of class Empleados.
     */
    @Test
    public void testGetIdEmpleado() {
        System.out.println("getIdEmpleado");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setIdEmpleado("");
        String result = instance.getIdEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdEmpleado() {
        System.out.println("setIdEmpleado");
        String idEmpleado = "";
        Empleados instance = new Empleados();
        instance.setIdEmpleado(idEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Empleados.
     */
    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setNombres("");
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Empleados.
     */
    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String Nombres = "";
        Empleados instance = new Empleados();
        instance.setNombres(Nombres);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Empleados.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setApellidos("");
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Empleados.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String Apellidos = "";
        Empleados instance = new Empleados();
        instance.setApellidos(Apellidos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDni method, of class Empleados.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Empleados instance = new Empleados();
        int expResult = 0;
        instance.setDni(0);
        int result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Empleados.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int dni = 0;
        Empleados instance = new Empleados();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNacimiento method, of class Empleados.
     */
    @Test
    public void testGetNacimiento() {
        System.out.println("getNacimiento");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setNacimiento("");
        String result = instance.getNacimiento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNacimiento method, of class Empleados.
     */
    @Test
    public void testSetNacimiento() {
        System.out.println("setNacimiento");
        String nacimiento = "";
        Empleados instance = new Empleados();
        instance.setNacimiento(nacimiento);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Empleados.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setTelefono("");
        String result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Empleados.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String telefono = "";
        Empleados instance = new Empleados();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCorreo method, of class Empleados.
     */
    @Test
    public void testGetCorreo() {
        System.out.println("getCorreo");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setCorreo("");
        String result = instance.getCorreo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCorreo method, of class Empleados.
     */
    @Test
    public void testSetCorreo() {
        System.out.println("setCorreo");
        String correo = "";
        Empleados instance = new Empleados();
        instance.setCorreo(correo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Empleados.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setCargo("");
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Empleados.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String Cargo = "";
        Empleados instance = new Empleados();
        instance.setCargo(Cargo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdCargo method, of class Empleados.
     */
    @Test
    public void testGetIdCargo() {
        System.out.println("getIdCargo");
        Empleados instance = new Empleados();
        int expResult = 0;
        instance.setIdCargo(0);
        int result = instance.getIdCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCargo method, of class Empleados.
     */
    @Test
    public void testSetIdCargo() {
        System.out.println("setIdCargo");
        int idCargo = 0;
        Empleados instance = new Empleados();
        instance.setIdCargo(idCargo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdUsuario method, of class Empleados.
     */
    @Test
    public void testGetIdUsuario() {
        System.out.println("getIdUsuario");
        Empleados instance = new Empleados();
        int expResult = 0;
        instance.setIdUsuario(0);
        int result = instance.getIdUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setIdUsuario method, of class Empleados.
     */
    @Test
    public void testSetIdUsuario() {
        System.out.println("setIdUsuario");
        int idUsuario = 0;
        Empleados instance = new Empleados();
        instance.setIdUsuario(idUsuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Empleados.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setEstado("");
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Empleados.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Empleados instance = new Empleados();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Empleados.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setUsuario("");
        String result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class Empleados.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String Usuario = "";
        Empleados instance = new Empleados();
        instance.setUsuario(Usuario);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getContraseña method, of class Empleados.
     */
    @Test
    public void testGetContraseña() {
        System.out.println("getContrase\u00f1a");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setContraseña("");
        String result = instance.getContraseña();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setContraseña method, of class Empleados.
     */
    @Test
    public void testSetContraseña() {
        System.out.println("setContrase\u00f1a");
        String Contraseña = "";
        Empleados instance = new Empleados();
        instance.setContraseña(Contraseña);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLetra method, of class Empleados.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Empleados instance = new Empleados();
        String expResult = "";
        instance.setLetra("");
        String result = instance.getLetra();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLetra method, of class Empleados.
     */
    @Test
    public void testSetLetra() {
        System.out.println("setLetra");
        String Letra = "";
        Empleados instance = new Empleados();
        instance.setLetra(Letra);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

}
