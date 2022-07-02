/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Modelo.Factura;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Miguel
 */
public class daoFacturaTest {

    public daoFacturaTest() {
    }

    @Test
    public void testListar() throws Exception {
        System.out.println("Listar");
        daoFactura fac = new daoFactura();
        String Codigo = "";
        List<Factura> lista = fac.Listar(Codigo);
        for (Factura c : lista) {
            System.out.println(c.getIdFactura());
            System.out.println(c.getIgv());
            System.out.println(c.getTotalPagar());
            System.out.println(c.getTotal());
            System.out.println(c.getIdFormaPago());
            System.out.println(c.getFormaPago());
            System.out.println(c.getIdCLiente());
            System.out.println(c.getCliente());
            System.out.println(c.getCliente());
            System.out.println(c.getDNI());
            System.out.println(c.getIdPedido());
        }
    }

    @Test
    public void testRegistrar() throws Exception {
        System.out.println("Registrar");
        Factura fac = new Factura();
        daoFactura daofac = new daoFactura();
        fac.setIgv(0);
        fac.setTotalPagar(0);
        fac.setIdFormaPago(0);
        fac.setIdCLiente("");
        fac.setIdPedido("");
        System.out.println(daofac.Registrar(fac));
    }

}
