/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Modelo.DetalleCompras;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public interface ICompraDetalle {

    public ArrayList<DetalleCompras> Listar(String CodigoCompra);

    public String Registrar(DetalleCompras be);

}
