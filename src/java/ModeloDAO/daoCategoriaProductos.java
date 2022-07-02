package ModeloDAO;

import Config.Conexion;
import Interface.ICategoriaProductos;
import Modelo.CategoriaProductos;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoCategoriaProductos implements ICategoriaProductos {

    Conexion con = new Conexion();

    @Override
    public ArrayList<CategoriaProductos> Buscar(String Letra) {
        ArrayList<CategoriaProductos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call CategoriaProducto_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                CategoriaProductos be = new CategoriaProductos();
                be.setIdCategoria(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setUltimaactualizacion(rs.getString(3));
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
    public ArrayList<CategoriaProductos> Listar() {
        ArrayList<CategoriaProductos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call CategoriaProducto_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                CategoriaProductos be = new CategoriaProductos();
                be.setIdCategoria(rs.getInt(1));
                be.setDescripcion(rs.getString(2));
                be.setUltimaactualizacion(rs.getString(3));
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
    public String Registrar(CategoriaProductos CPS) {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call CategoriaProducto_Registrar(?,?)}");
            cl.setString(1, CPS.getDescripcion());
            cl.registerOutParameter(2, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(2);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(int id) {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call CategoriaProducto_Eliminar(?)}");
            cl.setInt(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
