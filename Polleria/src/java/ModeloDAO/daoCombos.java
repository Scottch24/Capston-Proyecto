package ModeloDAO;

import Config.Conexion;
import Interface.ICombos;
import Modelo.Combos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoCombos implements ICombos {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Combos> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Combos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call ProductoCombos_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Combos be = new Combos();
                be.setIdProducto(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setIdProductoContenido(rs.getString(3));
                be.setNombreContenido(rs.getString(4));
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
    public ArrayList<Combos> Listar() throws ClassNotFoundException {
        ArrayList<Combos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call ProductoCombos_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Combos be = new Combos();
                be.setIdProducto(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setIdProductoContenido(rs.getString(3));
                be.setNombreContenido(rs.getString(4));
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
    public String Registrar(Combos be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call ProductoCombos_Registrar(?,?)}");
            cl.setString(1, be.getIdProducto());
            cl.setString(2, be.getIdProductoContenido());
            cl.executeUpdate();
            Respuesta = "Combo Registrado";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;

    }

    @Override
    public void Eliminar(String idCom) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call ProductoCombos_Eliminar(?)}");
            cl.setString(1, idCom);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
