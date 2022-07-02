/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Insumos;
import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoInsumosTest {

    public daoInsumosTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testBuscar() throws Exception {
        System.out.println("Buscar");
        Insumos insu = new Insumos();
        daoInsumos daoinsu = new daoInsumos();
        String Letra = "";
        List<Insumos> lista = daoinsu.Buscar(Letra);

        for (Insumos c : lista) {
           /* System.out.println("Id Ingrediente: "+c.getIdIngrediente());
            System.out.println("Id Nombre: "+c.getNombre());
            System.out.println("Id Fecha Vencimiento: "+c.getVencimiento());
            System.out.println("Id Marca: "+c.getMarca());
            System.out.println("Id Ultima Actualizacion: "+c.getFechaActualiza());
            System.out.println("Id Estado: "+c.getEstado());*/
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        Insumos insu = new Insumos();
        daoInsumos daoinsu = new daoInsumos();

        List<Insumos> lista = daoinsu.Listar();

        for (Insumos c : lista) {
            System.out.println("Id Ingrediente: "+c.getIdIngrediente());
            System.out.println("Id Nombre: "+c.getNombre());
            System.out.println("Id Fecha Vencimiento: "+c.getVencimiento());
            System.out.println("Id Marca: "+c.getMarca());
            System.out.println("Id Ultima Actualizacion: "+c.getFechaActualiza());
            System.out.println("Id Estado: "+c.getEstado());
        }

    }

    /**
     * Test of Registrar method, of class daoInsumos.
     */
    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Insumos insu = new Insumos();
        daoInsumos daoinsu = new daoInsumos();
        insu.setNombre("");
        insu.setIdMarca(1);
        insu.setVencimiento("");
        //daoinsu.Registrar(insu);
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Insumos insu = new Insumos();
        daoInsumos daoinsu = new daoInsumos();
        insu.setIdIngrediente(2);
        insu.setNombre("sdd");
        insu.setIdMarca(1);
        insu.setVencimiento("");
       //daoinsu.Actualizar(insu);
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoInsumos daoinsu = new daoInsumos();
        int id = 1;
        daoinsu.Eliminar(id);
    }

}
