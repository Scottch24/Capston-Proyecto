package ModeloDAO;

import Modelo.Cliente;
import Modelo.Empleados;
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
public class daoLoginTest {

    public daoLoginTest() {
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
    public void testInicioSesion_Empleados() {
        System.out.println("InicioSesion_Empleados");
        Empleados em = new Empleados();
        daoLogin daoem = new daoLogin();
        String Usuario = "admin";
        String Contraseña = "admin";
        em.setUsuario(Usuario);
        em.setContraseña(Contraseña);
        System.out.println(daoem.InicioSesion_Empleados(em));
    }

    @Test
    public void testDatosEmpleado() {
        System.out.println("\nDatosEmpleado");
        Empleados em = new Empleados();
        daoLogin daoem = new daoLogin();
        String Codigo = "EMP00000001";
        List<Empleados> lista = daoem.DatosEmpleado(Codigo);
        for (Empleados c : lista) {
            System.out.println("Nombres: " + c.getNombres());
            System.out.println("Apellidos: " + c.getApellidos());
            System.out.println("Cargo: " + c.getCargo());
            System.out.println("Usuario: " + c.getUsuario());
            System.out.println("Contraseña: " + c.getContraseña());
        }
    }

}
