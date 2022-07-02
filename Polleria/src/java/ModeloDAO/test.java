/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.CategoriaProductos;
import Modelo.Compras;
import Modelo.Empleados;
import Modelo.Productos;
import Modelo.Ventas;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author Miguel
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        daoVentas pro = new daoVentas();

        List<Ventas> list = pro.Listar("");

        for (Ventas a : list) {
            System.err.println(a.getIdVentas());
        }
    }

}
