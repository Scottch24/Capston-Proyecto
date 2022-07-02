/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Cargo;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface ICargos {

    public ArrayList<Cargo> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Cargo> Listar() throws ClassNotFoundException;

    public String Registrar(Cargo be)  throws ClassNotFoundException;

    public void Eliminar(int id) throws ClassNotFoundException;
}
