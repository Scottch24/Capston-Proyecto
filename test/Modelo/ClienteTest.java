
package Modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {

    public ClienteTest() {
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
    public void testGetIdCliente() {
        System.out.println("getIdCliente");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setIdCliente("");
        String result = instance.getIdCliente();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetIdCliente() {
        System.out.println("setIdCliente");
        String idCLiente = "";
        Cliente instance = new Cliente();
        instance.setIdCliente(idCLiente);
    }

    @Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setNombres("");
        String result = instance.getNombres();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String Nombres = "";
        Cliente instance = new Cliente();
        instance.setNombres(Nombres);
    }

    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setApellidos("");
        String result = instance.getApellidos();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String Apellidos = "";
        Cliente instance = new Cliente();
        instance.setApellidos(Apellidos);
    }

    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setTelefono("");
        String result = instance.getTelefono();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        String Telefono = "";
        Cliente instance = new Cliente();
        instance.setTelefono(Telefono);
    }

    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Cliente instance = new Cliente();
        int expResult = 0;
        instance.setDni(0);
        int result = instance.getDni();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDni() {
        System.out.println("setDni");
        int DNI = 0;
        Cliente instance = new Cliente();
        instance.setDni(DNI);
    }
    
        @Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setDireccion("");
        String result = instance.getDireccion();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String Direccion = "";
        Cliente instance = new Cliente();
        instance.setDireccion(Direccion);
    }
    
            @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setUsuario("");
        String result = instance.getUsuario();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        String Usuario = "";
        Cliente instance = new Cliente();
        instance.setUsuario(Usuario);
    }
    
            @Test
    public void testGetContraseña() {
        System.out.println("getContraseña");
        Cliente instance = new Cliente();
        String expResult = "";
        instance.setContraseña("");
        String result = instance.getContraseña();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetContraseña() {
        System.out.println("setContraseña");
        String Contraseña = "";
        Cliente instance = new Cliente();
        instance.setContraseña(Contraseña);
    }

}
