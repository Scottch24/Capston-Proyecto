package ModeloDAO;

import Config.Conexion;
import Interface.ILogin;
import Modelo.Cliente;
import Modelo.Empleados;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class daoLogin implements ILogin {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Empleados> DatosEmpleado(String Codigo) {
        ArrayList<Empleados> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_DatosSesion(?)}");
            cl.setString(1, Codigo);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Empleados be = new Empleados();
                be.setIdEmpleado(rs.getString(1));
                be.setNombres(rs.getString(2));
                be.setApellidos(rs.getString(3));
                be.setDni(rs.getInt(4));
                be.setNacimiento(rs.getString(5));
                be.setTelefono(rs.getString(6));
                be.setCorreo(rs.getString(7));
                be.setCargo(rs.getString(8));
                be.setUsuario(rs.getString(9));
                be.setContraseña(rs.getString(10));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e.getMessage());
        }
        return list;
    }

    @Override
    public ArrayList<Cliente> DatosCliente(String Codigo) {
        ArrayList<Cliente> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_DatosSesion(?)}");
            cl.setString(1, Codigo);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Cliente be = new Cliente();
                be.setIdCliente(rs.getString(1));
                be.setNombres(rs.getString(2));
                be.setApellidos(rs.getString(3));
                be.setDni(rs.getInt(4));
                be.setTelefono(rs.getString(5));
                be.setGenero(rs.getString(6));
                be.setDireccion(rs.getString(7));
                be.setUsuario(rs.getString(8));
                be.setContraseña(rs.getString(9));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e.getMessage());
        }
        return list;
    }

    @Override
    public String InicioSesion_Cliente(Cliente be) {
        String result = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Cliente_InicioSesion(?,?,?)}");
            cl.setString(1, be.getUsuario());
            cl.setString(2, be.getContraseña());
            cl.registerOutParameter(3, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            result = cl.getString(3);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

    @Override
    public String InicioSesion_Empleados(Empleados be) {
        String result = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleados_InicioSesion(?,?,?)}");
            cl.setString(1, be.getUsuario());
            cl.setString(2, be.getContraseña());
            cl.registerOutParameter(3, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            result = cl.getString(3);
            cl.close();
            con.Conectar().close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return result;
    }

}
