package ModeloDAO;

import Config.Conexion;
import Interface.IClientes;
import Modelo.Cliente;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoCliente implements IClientes {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Cliente> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Cliente> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Cliente be = new Cliente();
                be.setIdCliente(rs.getString(1));
                be.setNombres(rs.getString(2));
                be.setApellidos(rs.getString(3));
                be.setTelefono(rs.getString(4));
                be.setGenero(rs.getString(5));
                be.setDni(rs.getInt(6));
                be.setDireccion(rs.getString(7));
                be.setUsuario(rs.getString(8));
                be.setContraseña(rs.getString(9));
                be.setFecha_Actualizacion(rs.getString(10));
                be.setEstado(rs.getString(11));
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
    public ArrayList<Cliente> Listar() throws ClassNotFoundException {
        ArrayList<Cliente> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call cliente_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Cliente be = new Cliente();
                be.setIdCliente(rs.getString(1));
                be.setNombres(rs.getString(2));
                be.setApellidos(rs.getString(3));
                be.setTelefono(rs.getString(4));
                be.setGenero(rs.getString(5));
                be.setDni(rs.getInt(6));
                be.setDireccion(rs.getString(7));
                be.setUsuario(rs.getString(8));
                be.setContraseña(rs.getString(9));
                be.setFecha_Actualizacion(rs.getString(10));
                be.setEstado(rs.getString(11));
                list.add(be);
            }
            rs.close();
            cl.close();
            con.Conectar().close();
        }  catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return list;
    }

    @Override
    public String Registrar(Cliente be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_Registrar(?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getNombres());
            cl.setString(2, be.getApellidos());
            cl.setString(3, be.getTelefono());
            cl.setString(4, be.getGenero());
            cl.setInt(5, be.getDni());
            cl.setString(6, be.getDireccion());
            cl.setString(7, be.getUsuario());
            cl.setString(8, be.getContraseña());
            cl.registerOutParameter(9, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(9);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Cliente be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_Actualizar(?,?,?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getNombres());
            cl.setString(2, be.getApellidos());
            cl.setString(3, be.getTelefono());
            cl.setString(4, be.getGenero());
            cl.setInt(5, be.getDni());
            cl.setString(6, be.getDireccion());
            cl.setString(7, be.getUsuario());
            cl.setString(8, be.getContraseña());
            cl.setString(9, be.getEstado());
            cl.setString(10, be.getIdCliente());
            cl.registerOutParameter(11, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(11);
            cl.close();
            con.Conectar().close();
        }  catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(String id) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_Eliminar(?)}");
            cl.setString(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
    }

}
