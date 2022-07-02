package ModeloDAO;

import Config.Conexion;
import Interface.ICargos;
import Modelo.Cargo;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class daoCargo implements ICargos {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Cargo> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Cargo> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cargo_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Cargo be = new Cargo();
                be.setIdCargo(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setUltimaActualizacion(rs.getString(3));
                be.setEstado(rs.getString(4));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        }  catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return list;
    }

    @Override
    public ArrayList<Cargo> Listar() throws ClassNotFoundException {
        ArrayList<Cargo> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call cargo_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Cargo be = new Cargo();
                be.setIdCargo(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setUltimaActualizacion(rs.getString(3));
                be.setEstado(rs.getString(4));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        } 
        return list;
    }

    @Override
    public String Registrar(Cargo be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cargo_Registrar(?)}");
            cl.setString(1, be.getDescripcion());
            cl.executeUpdate();
            Respuesta = "Exito";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(int id) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cargo_Desactivar(?)}");
            cl.setInt(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        }  catch (Exception e) {
            System.out.println("Errror: " + e);
        }
    }

}
