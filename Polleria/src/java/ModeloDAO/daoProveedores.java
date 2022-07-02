package ModeloDAO;

import Config.Conexion;
import Interface.IProveedores;
import Modelo.Proveedores;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoProveedores implements IProveedores {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Proveedores> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Proveedores> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Proveedores_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Proveedores be = new Proveedores();
                be.setIdProveedor(rs.getInt(1));
                be.setRazonSocial(rs.getString(2));
                be.setRUC(rs.getString(3));
                be.setTelefono(rs.getString(4));
                be.setContacto(rs.getString(5));
                be.setUltimaFecha(rs.getString(6));
                be.setEstado(rs.getString(7));
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
    public ArrayList<Proveedores> Listar() throws ClassNotFoundException {
        ArrayList<Proveedores> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Proveedores_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Proveedores be = new Proveedores();
                be.setIdProveedor(rs.getInt(1));
                be.setRazonSocial(rs.getString(2));
                be.setRUC(rs.getString(3));
                be.setTelefono(rs.getString(4));
                be.setContacto(rs.getString(5));
                be.setUltimaFecha(rs.getString(6));
                be.setEstado(rs.getString(7));
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
    public String Registrar(Proveedores be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Proveedores_Registrar(?,?,?,?)}");
            cl.setString(1, be.getRazonSocial());
            cl.setString(2, be.getRUC());
            cl.setString(3, be.getTelefono());
            cl.setString(4, be.getContacto());
            cl.executeUpdate();
            Respuesta = "";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Proveedores be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Proveedores_Actualizar(?,?,?,?,?)}");
            cl.setInt(1, be.getIdProveedor());
            cl.setString(2, be.getRazonSocial());
            cl.setString(3, be.getRUC());
            cl.setString(4, be.getTelefono());
            cl.setString(5, be.getContacto());
            cl.executeUpdate();
            Respuesta = "Registrado con exito";
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
            CallableStatement cl = con.Conectar().prepareCall("{call Proveedores_Eliminar(?)}");
            cl.setInt(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
