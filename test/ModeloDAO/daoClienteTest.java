package ModeloDAO;

import Modelo.Cliente;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class daoClienteTest {

    public daoClienteTest() {
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
        daoCliente cli = new daoCliente();
        String Letra = "";
        List<Cliente> lista = cli.Buscar(Letra);
        for (Cliente c : lista) {
            /*System.out.println("\nid Cliente: " + c.getIdCliente());
            System.out.println("Nombre: " + c.getNombres());
            System.out.println("Apellido: " + c.getApellidos());
            System.out.println("Telefono: " + c.getTelefono());
            System.out.println("Genero: " + c.getGenero());
            System.out.println("DNI: " + c.getDni());
            System.out.println("Direccion: " + c.getDireccion());
            System.out.println("Usuario: " + c.getUsuario());
            System.out.println("Contraseña: " + c.getContraseña());
            System.out.println("Ultima Actualizacion: " + c.getFecha_Actualizacion());
            System.out.println("Estado: " + c.getEstado());*/
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        daoCliente cli = new daoCliente();
        List<Cliente> lista = cli.Listar();
        for (Cliente c : lista) {
            /*System.out.println("\nid Cliente: " + c.getIdCliente());
            System.out.println("Nombre: " + c.getNombres());
            System.out.println("Apellido: " + c.getApellidos());
            System.out.println("Telefono: " + c.getTelefono());
            System.out.println("Genero: " + c.getGenero());
            System.out.println("DNI: " + c.getDni());
            System.out.println("Direccion: " + c.getDireccion());
            System.out.println("Usuario: " + c.getUsuario());
            System.out.println("Contraseña: " + c.getContraseña());
            System.out.println("Ultima Actualizacion: " + c.getFecha_Actualizacion());
            System.out.println("Estado: " + c.getEstado());*/
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Cliente cli = new Cliente();
        daoCliente daoCli = new daoCliente();
        cli.setNombres("");
        cli.setApellidos("");
        cli.setTelefono("");
        cli.setGenero("");
        cli.setDni(0);
        cli.setDireccion("");
        cli.setUsuario("");
        cli.setContraseña("");
        System.out.println(daoCli.Registrar(cli));
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Cliente cli = new Cliente();
        daoCliente daoCli = new daoCliente();
        cli.setIdCliente("CLI00000001");
        cli.setNombres("aaa");
        cli.setApellidos("ss");
        cli.setTelefono("");
        cli.setGenero("");
        cli.setDni(0);
        cli.setDireccion("");
        cli.setUsuario("");
        cli.setContraseña("");
        cli.setEstado("Habilitado");
       // System.out.println(daoCli.Actualizar(cli));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoCliente daoCli = new daoCliente();
        String id = "";
        //daoCli.Eliminar(id);

    }

}
