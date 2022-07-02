/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interface.ICompras;
import Modelo.Compras;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class daoCompra implements ICompras {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Compras> Listar(String Letra) {
        ArrayList<Compras> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Comprar_Mostrar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Compras be = new Compras();
                be.setIdCompra(rs.getString(1));
                be.setIdEmpleado(rs.getString(2));
                be.setEmpleado(rs.getString(3));
                be.setIdProveedor(rs.getInt(4));
                be.setRazonSocial(rs.getString(5));
                be.setRUC(rs.getString(6));
                be.setFecha_Compra(rs.getString(7));
                be.setTotal_Compra(rs.getDouble(8));
                list.add(be);
            }
            rs.close();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error Mostrar Compras: " + e.getMessage());
        }
        return list;
    }

    @Override
    public String Registrar(Compras be) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Compra_Registrar(?,?,?,?,?)}");
            cl.setString(1, be.getIdEmpleado());
            cl.setInt(2, be.getIdProveedor());
            cl.setString(3, dtf.format(LocalDateTime.now()));
            cl.setDouble(4, be.getTotal_Compra());
            cl.registerOutParameter(5, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(5);
            cl.close();
            con.Conectar().close();

        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;
    }

}
