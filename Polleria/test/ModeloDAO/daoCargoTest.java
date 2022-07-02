/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Cargo;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class daoCargoTest {

    public daoCargoTest() {
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
        Cargo car = new Cargo();
        daoCargo cardao = new daoCargo();
        String Letra = "";
        List<Cargo> lista = cardao.Buscar(Letra);

        for (Cargo c : lista) {
            System.out.println("Nombre del Cargo: "+c.getDescripcion());
            System.out.println("Estado del Cargo: "+c.getEstado());
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        Cargo car = new Cargo();
        daoCargo cardao = new daoCargo();
        List<Cargo> lista = cardao.Listar();
        for (Cargo c : lista) {
            //  System.out.println("Nombre del Cargo: " + c.getDescripcion());
            //  System.out.println("Estado del Cargo: " + c.getEstado());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Cargo car = new Cargo();
        daoCargo cardao = new daoCargo();
        String NombreCargo = "";
        car.setDescripcion(NombreCargo);
       // System.out.println(cardao.Registrar(car) + " En Registrar");
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoCargo cardao = new daoCargo();
        int id = 0;
        cardao.Eliminar(id);
    }

}
