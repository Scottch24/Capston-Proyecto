/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Marca;
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
public class daoMarcaTest {

    public daoMarcaTest() {
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
        Marca mar = new Marca();
        daoMarca daomar = new daoMarca();
        String Letra = "";
        List<Marca> lista = daomar.Buscar(Letra);
        for (Marca c : lista) {
            /* System.out.println(c.getIdMarca());
            System.out.println(c.getDescripcion());
            System.out.println(c.getFechaActualiza());
            System.out.println(c.getEstado());*/
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        Marca mar = new Marca();
        daoMarca daomar = new daoMarca();
        List<Marca> lista = daomar.Listar();
        for (Marca c : lista) {
            System.out.println("\nidMarca: " + c.getIdMarca());
            System.out.println("Nombre: " + c.getDescripcion());
            System.out.println("Ultima Actualizacion: " + c.getFechaActualiza());
            System.out.println("Estado: " + c.getEstado());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Marca mar = new Marca();
        daoMarca daomar = new daoMarca();
        mar.setDescripcion("");
       // System.out.println(daomar.Registrar(mar));
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Marca mar = new Marca();
        daoMarca daomar = new daoMarca();
        mar.setIdMarca(1);
        mar.setDescripcion("Molitalia");
        mar.setEstado("Habilitado");
        System.out.println(daomar.Actualizar(mar));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoMarca daomar = new daoMarca();
        int id = 1;
       // daomar.Eliminar(id);

    }

}
