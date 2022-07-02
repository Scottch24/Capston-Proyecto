/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Marca;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IMarca {

    public ArrayList<Marca> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Marca> Listar() throws ClassNotFoundException;

    public String Registrar(Marca be) throws ClassNotFoundException;

    public String Actualizar(Marca be) throws ClassNotFoundException;

    public void Eliminar(int id) throws ClassNotFoundException;

}
