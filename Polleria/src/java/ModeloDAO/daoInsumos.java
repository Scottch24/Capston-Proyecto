package ModeloDAO;

import Config.Conexion;
import Interface.IInsumos;
import Modelo.Insumos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoInsumos implements IInsumos {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Insumos> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Insumos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Ingredientes_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Insumos be = new Insumos();
                be.setIdIngrediente(rs.getInt(1));
                be.setNombre(rs.getString(2));
                be.setPrecio(rs.getDouble(3));
                be.setVencimiento(rs.getString(4));
                be.setMarca(rs.getString(5));
                be.setIdMarca(rs.getInt(6));
                be.setFechaActualiza(rs.getString(7));
                be.setEstado(rs.getString(8));
                list.add(be);
            }
            rs.close();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en buscar: " + e.getMessage());
        }
        return list;
    }

    @Override
    public ArrayList<Insumos> Listar() throws ClassNotFoundException {
        ArrayList<Insumos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Ingredientes_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Insumos be = new Insumos();
                be.setIdIngrediente(rs.getInt(1));
                be.setNombre(rs.getString(2));
                be.setPrecio(rs.getDouble(3));
                be.setVencimiento(rs.getString(4));
                be.setMarca(rs.getString(5));
                be.setIdMarca(rs.getInt(6));
                be.setFechaActualiza(rs.getString(7));
                be.setEstado(rs.getString(8));
                list.add(be);
            }
            rs.close();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror en Listar: " + e.getMessage());
        }
        return list;
    }

    @Override
    public String Registrar(Insumos be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Ingredientes_Registrar(?,?,?,?,?)}");
            cl.setString(1, be.getNombre());
            cl.setString(2, be.getVencimiento());
            cl.setDouble(3, be.getPrecio());
            cl.setInt(4, be.getIdMarca());
            cl.registerOutParameter(5, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(5);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en Registrar: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Insumos be) throws ClassNotFoundException {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Ingredientes_Actualizar(?,?,?,?,?)}");
            cl.setString(1, be.getNombre());
            cl.setString(2, be.getVencimiento());
            cl.setDouble(3, be.getPrecio());
            cl.setInt(4, be.getIdMarca());
            cl.setInt(5, be.getIdIngrediente());
            cl.executeUpdate();
            Respuesta = "Actualizado Exitosamente...";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en Actualizar: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(int id) throws ClassNotFoundException {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Ingrediente_Elimmintar(?)}");
            cl.setInt(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en Eliminar: " + e.getMessage());
        }
    }

}
