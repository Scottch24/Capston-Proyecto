/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interface.IMarca;
import Modelo.Marca;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class daoMarca implements IMarca {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Marca> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Marca> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Marca_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Marca be = new Marca();
                be.setIdMarca(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setFechaActualiza(rs.getString(3));
                be.setEstado(rs.getString(4));
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

    @Override
    public ArrayList<Marca> Listar() throws ClassNotFoundException {
        ArrayList<Marca> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Marca_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Marca be = new Marca();
                be.setIdMarca(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setFechaActualiza(rs.getString(3));
                be.setEstado(rs.getString(4));
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

    @Override
    public String Registrar(Marca be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Marca_Registrar(?)}");
            cl.setString(1, be.getDescripcion());
            cl.executeUpdate();
            Respuesta = "Marca Registrada...";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Marca be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Marca_Actualizar(?,?,?)}");
            cl.setInt(1, be.getIdMarca());
            cl.setString(2, be.getDescripcion());
            cl.setString(3, be.getEstado());
            cl.executeUpdate();
            Respuesta = "Marca Actualizada...";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(int id) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Marca_Eliminar(?)}");
            cl.setInt(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
