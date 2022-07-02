/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.FormasPago;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IFormaPago {

    public ArrayList<FormasPago> Listar() throws ClassNotFoundException;
}
