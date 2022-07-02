/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.Insumos;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface IInsumos {

    public ArrayList<Insumos> Buscar(String Letra) throws ClassNotFoundException;

    public ArrayList<Insumos> Listar() throws ClassNotFoundException;

    public String Registrar(Insumos be) throws ClassNotFoundException;

    public String Actualizar(Insumos be) throws ClassNotFoundException;

    public void Eliminar(int id) throws ClassNotFoundException;
}
