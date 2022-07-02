/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Proveedores;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IProveedores {

    public ArrayList<Proveedores> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Proveedores> Listar() throws ClassNotFoundException;

    public String Registrar(Proveedores be) throws ClassNotFoundException;

    public String Actualizar(Proveedores be) throws ClassNotFoundException;

    public void Eliminar(int id) throws ClassNotFoundException;

}
