/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Proveedores;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoProveedoresTest {

    public daoProveedoresTest() {
    }

    @Test
    public void testBuscar() throws Exception {
        System.out.println("Buscar");
        Proveedores prov = new Proveedores();
        daoProveedores daoprov = new daoProveedores();
        String Letra = "";
        List<Proveedores> buscar = daoprov.Buscar(Letra);
        for (Proveedores c : buscar) {
            /* System.out.println("\nIdProveedor: " + c.getIdProveedor());
            System.out.println("Razon Social: " + c.getRazonSocial());
            System.out.println("RUC: " + c.getRUC());
            System.out.println("Telefono: " + c.getTelefono());
            System.out.println("Contacto: " + c.getContacto());
            System.out.println("Fehca Modificacion: " + c.getUltimaFecha());
            System.out.println("Estado: " + c.getEstado());*/
        }
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        Proveedores prov = new Proveedores();
        daoProveedores daoprov = new daoProveedores();
        String Letra = "";
        List<Proveedores> lista = daoprov.Listar();
        for (Proveedores c : lista) {
            /*System.out.println("\nIdProveedor: " + c.getIdProveedor());
            System.out.println("Razon Social: " + c.getRazonSocial());
            System.out.println("RUC: " + c.getRUC());
            System.out.println("Telefono: " + c.getTelefono());
            System.out.println("Contacto: " + c.getContacto());
            System.out.println("Fehca Modificacion: " + c.getUltimaFecha());
            System.out.println("Estado: " + c.getEstado());*/
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Proveedores prov = new Proveedores();
        daoProveedores daoprov = new daoProveedores();
        prov.setRazonSocial("");
        prov.setRUC("");
        prov.setTelefono("");
        prov.setContacto("");
        //System.out.println(daoprov.Registrar(prov));
    }

    @Test
    public void testActualizar() throws Exception {
        System.out.println("Actualizar");
        Proveedores prov = new Proveedores();
        daoProveedores daoprov = new daoProveedores();
        prov.setIdProveedor(0);
        prov.setRazonSocial("");
        prov.setRUC("");
        prov.setTelefono("");
        prov.setContacto("");
        //System.out.println(daoprov.Actualizar(prov));
    }

    @Test
    public void testEliminar() throws Exception {
        System.out.println("Eliminar");
        daoProveedores daoprov = new daoProveedores();
        int id = 0;
        daoprov.Eliminar(id);

    }

}
