/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Compras;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface ICompras {

    public ArrayList<Compras> Listar(String Letra);

    public String Registrar(Compras be);

}
