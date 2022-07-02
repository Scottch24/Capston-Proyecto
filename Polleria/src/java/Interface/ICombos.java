/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Combos;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface ICombos {
    
    public ArrayList<Combos> Buscar(String Letra) throws ClassNotFoundException;
    
     public ArrayList<Combos> Listar() throws ClassNotFoundException;
    
    public String Registrar(Combos be) throws ClassNotFoundException;
    
    public void Eliminar(String idCom) throws ClassNotFoundException;
}
