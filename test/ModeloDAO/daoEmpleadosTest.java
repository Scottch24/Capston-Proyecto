/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Empleados;
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
public class daoEmpleadosTest {

    public daoEmpleadosTest() {
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
        Empleados em = new Empleados();
        daoEmpleados daoem = new daoEmpleados();
        String Letra = "";
        List<Empleados> buscar = daoem.Buscar(Letra);
        for (Empleados c : buscar) {
            System.out.println("\nNombres: " + c.getNombres());
            System.out.println("Apellidos: " + c.getApellidos());
            System.out.println("Cargo: " + c.getCargo());
            System.out.println("Usuario: " + c.getCorreo());
            System.out.println("Contraseña: " + c.getNacimiento());
            System.out.println("Nombres: " + c.getTelefono());
            System.out.println("Apellidos: " + c.getDni());
            System.out.println("Usuario: " + c.getUsuario());
            System.out.println("Contraseña: " + c.getContraseña());
            System.out.println("Cargo: " + c.getFechaActualizacion());
            System.out.println("Cargo: " + c.getEstado());
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        Empleados em = new Empleados();
        daoEmpleados daoem = new daoEmpleados();
        String Letra = "";
        List<Empleados> lista = daoem.Listar();
        for (Empleados c : lista) {
              System.out.println("\nNombres: " + c.getNombres());
            System.out.println("Apellidos: " + c.getApellidos());
            System.out.println("Cargo: " + c.getCargo());
            System.out.println("Usuario: " + c.getCorreo());
            System.out.println("Contraseña: " + c.getNacimiento());
            System.out.println("Nombres: " + c.getTelefono());
            System.out.println("Apellidos: " + c.getDni());
            System.out.println("Usuario: " + c.getUsuario());
            System.out.println("Contraseña: " + c.getContraseña());
            System.out.println("Cargo: " + c.getFechaActualizacion());
            System.out.println("Cargo: " + c.getEstado());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Empleados em = new Empleados();
        daoEmpleados daoem = new daoEmpleados();
        em.setNombres("");
        em.setApellidos("");
        em.setDni(0);
        em.setNacimiento("");
        em.setTelefono("");
        em.setCorreo("");
        em.setIdCargo(1);
        em.setCargo("");
        em.setUsuario("");
        em.setContraseña("");
        System.out.println(daoem.Registrar(em));
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Empleados em = new Empleados();
        daoEmpleados daoem = new daoEmpleados();
        em.setIdEmpleado("");
        em.setNombres("");
        em.setApellidos("");
        em.setDni(0);
        em.setNacimiento("");
        em.setTelefono("");
        em.setCorreo("");
        em.setIdCargo(1);
        em.setCargo("");
        em.setUsuario("");
        em.setContraseña("");
        //System.out.println(daoem.Actualizar(em));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoEmpleados daoem = new daoEmpleados();
        String id = "";
        daoem.Eliminar(id);
    }

}
