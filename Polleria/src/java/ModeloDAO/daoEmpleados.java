/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import Config.Conexion;
import Interface.IEmpleados;
import Modelo.Empleados;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class daoEmpleados implements IEmpleados {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Empleados> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Empleados> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_Buscar(?)}");
            cl.setString(1, Letra);
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
                be.setIdCargo(rs.getInt(8));
                be.setCargo(rs.getString(9));
                be.setUsuario(rs.getString(10));
                be.setContraseña(rs.getString(11));
                be.setFechaActualizacion(rs.getString(12));
                be.setEstado(rs.getString(13));
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
    public ArrayList<Empleados> Listar() throws ClassNotFoundException {
        ArrayList<Empleados> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_Mostrar()}");
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
                be.setIdCargo(rs.getInt(8));
                be.setCargo(rs.getString(9));
                be.setUsuario(rs.getString(10));
                be.setContraseña(rs.getString(11));
                be.setFechaActualizacion(rs.getString(12));
                be.setEstado(rs.getString(13));
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
    public String Registrar(Empleados be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_Registrar(?,?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getNombres());
            cl.setString(2, be.getApellidos());
            cl.setInt(3, be.getDni());
            cl.setString(4, be.getNacimiento());
            cl.setString(5, be.getTelefono());
            cl.setString(6, be.getCorreo());
            cl.setInt(7, be.getIdCargo());
            cl.setString(8, be.getUsuario());
            cl.setString(9, be.getContraseña());
            cl.registerOutParameter(10, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(10);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Empleados be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_Actualizar(?,?,?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getNombres());
            cl.setString(2, be.getApellidos());
            cl.setInt(3, be.getDni());
            cl.setString(4, be.getNacimiento());
            cl.setString(5, be.getTelefono());
            cl.setString(6, be.getCorreo());
            cl.setInt(7, be.getIdCargo());
            cl.setString(8, be.getUsuario());
            cl.setString(9, be.getContraseña());
            cl.setString(10, be.getIdEmpleado());
            cl.registerOutParameter(11, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(11);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(String id) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Empleado_Eliminar(?)}");
            cl.setString(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
