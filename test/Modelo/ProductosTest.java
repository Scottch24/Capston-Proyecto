/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class ProductosTest {
    
    public ProductosTest() {
    }

    @Test
    public void testGetIdProductos() {
        System.out.println("getIdProductos");
        Productos instance = new Productos();
        String expResult = "";
        instance.setIdProductos("");
        String result = instance.getIdProductos();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdProductos() {
        System.out.println("setIdProductos");
        String idProductos = "";
        Productos instance = new Productos();
        instance.setIdProductos(idProductos);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Productos instance = new Productos();
        String expResult = "";
        instance.setNombre("");
        String result = instance.getNombre();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String Nombre = "";
        Productos instance = new Productos();
        instance.setNombre(Nombre);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Productos instance = new Productos();
        String expResult = "";
        instance.setDescripcion("");
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testSetDescripcion() {
        System.out.println("setDescripcion");
        String Descripcion = "";
        Productos instance = new Productos();
        instance.setDescripcion(Descripcion);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Productos instance = new Productos();
        double expResult = 0.0;
        instance.setPrecio(0);
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double Precio = 0.0;
        Productos instance = new Productos();
        instance.setPrecio(Precio);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetIdCategoria() {
        System.out.println("getIdCategoria");
        Productos instance = new Productos();
        int expResult = 0;
        instance.setIdCategoria(0);
        int result = instance.getIdCategoria();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testSetIdCategoria() {
        System.out.println("setIdCategoria");
        int idCategoria = 0;
        Productos instance = new Productos();
        instance.setIdCategoria(idCategoria);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Productos instance = new Productos();
        String expResult = "";
        instance.setEstado("");
        String result = instance.getEstado();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Productos instance = new Productos();
        instance.setEstado(estado);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetImagen() {
        System.out.println("getImagen");
        Productos instance = new Productos();
        InputStream expResult = null;
        instance.setImagen(null);
        InputStream result = instance.getImagen();
        assertEquals(expResult, result);
      //  fail("The test case is a prototype.");
    }

    @Test
    public void testSetImagen() {
        System.out.println("setImagen");
        InputStream Imagen = null;
        Productos instance = new Productos();
        instance.setImagen(Imagen);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        Productos instance = new Productos();
        String expResult = "";
        instance.setCategoria("");
        String result = instance.getCategoria();
        assertEquals(expResult, result);
     //   fail("The test case is a prototype.");
    }

    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        String Categoria = "";
        Productos instance = new Productos();
        instance.setCategoria(Categoria);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetStock() {
        System.out.println("getStock");
        Productos instance = new Productos();
        int expResult = 0;
        instance.setStock(0);
        int result = instance.getStock();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @Test
    public void testSetStock() {
        System.out.println("setStock");
        int Stock = 0;
        Productos instance = new Productos();
        instance.setStock(Stock);
       // fail("The test case is a prototype.");
    }
    
}
