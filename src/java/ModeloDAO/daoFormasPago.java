/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interface.IFormaPago;
import Modelo.FormasPago;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class daoFormasPago implements IFormaPago {

    Conexion con = new Conexion();

    @Override
    public ArrayList<FormasPago> Listar() throws ClassNotFoundException {
        ArrayList<FormasPago> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call FormasPago_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                FormasPago be = new FormasPago();
                be.setIdFormapago(rs.getInt(1));
                be.setFormaPägo(rs.getString(2));
                list.add(be);
            }
            rs.close();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return list;
    }

}
