/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Factura;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IFactura {

    public ArrayList<Factura> Listar(String Codigo) throws ClassNotFoundException;

    public String Registrar(Factura be) ;

}
