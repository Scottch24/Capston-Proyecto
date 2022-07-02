/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IClientes {

    public ArrayList<Cliente> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Cliente> Listar() throws ClassNotFoundException;

    public String Registrar(Cliente be) throws ClassNotFoundException;
    
    public String Actualizar(Cliente be) throws ClassNotFoundException;
    
     public void Eliminar(String id) throws ClassNotFoundException;
}
