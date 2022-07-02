package ModeloDAO;

import Config.Conexion;
import Interface.IProductoIngrediente;
import Modelo.ProductoIngrediente;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoProductoIngrediente implements IProductoIngrediente {

    Conexion con = new Conexion();

    @Override
    public ArrayList<ProductoIngrediente> Buscar(String Letra) {
        ArrayList<ProductoIngrediente> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call IngreXProduc_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                ProductoIngrediente be = new ProductoIngrediente();
                be.setIdProducto(rs.getString(1));
                be.setProducto(rs.getString(2));
                be.setCantidad(rs.getInt(3));
                be.setIdIngredientes(rs.getInt(4));
                be.setIngrediente(rs.getString(5));
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
    public ArrayList<ProductoIngrediente> Listar() {
        ArrayList<ProductoIngrediente> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call IngreXProdu_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                ProductoIngrediente be = new ProductoIngrediente();
                be.setIdProducto(rs.getString(1));
                be.setProducto(rs.getString(2));
                be.setCantidad(rs.getInt(3));
                be.setIdIngredientes(rs.getInt(4));
                be.setIngrediente(rs.getString(5));
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
    public String Registrar(ProductoIngrediente be) {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call IngreXProdu_Registrar(?,?,?,?)}");
            cl.setString(1, be.getIdProducto());
            cl.setInt(2, be.getCantidad());
            cl.setInt(3, be.getIdIngredientes());
            cl.registerOutParameter(4, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(4);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(String idPro, int idIngre) {
        try {

            CallableStatement cl = con.Conectar().prepareCall("{call IngreXProdu_Eliminar(?,?)}");
            cl.setString(1, idPro);
            cl.setInt(2, idIngre);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
