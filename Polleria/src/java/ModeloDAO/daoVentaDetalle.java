package ModeloDAO;

import Config.Conexion;
import Interface.IVentaDetalle;
import Modelo.DetalleVenta;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoVentaDetalle implements IVentaDetalle {

    Conexion con = new Conexion();

    @Override
    public ArrayList<DetalleVenta> Listar(String CodigoPedido) {
        ArrayList<DetalleVenta> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call DetalleVentas_Mostrar(?)}");
            cl.setString(1, CodigoPedido);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                DetalleVenta be = new DetalleVenta();
                be.setidVenta(rs.getString(1));
                be.setIdProducto(rs.getString(2));
                be.setProducto(rs.getString(3));
                be.setCantidad(rs.getInt(4));
                be.setPrecio(rs.getDouble(5));
                be.setSubTotal(rs.getDouble(6));
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
    public String Registrar(DetalleVenta be) {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call DetalleVenta_Registrar(?,?,?,?,?)}");
            cl.setString(1, be.getidVenta());
            cl.setString(2, be.getIdProducto());
            cl.setInt(3, be.getCantidad());
            cl.setDouble(4, be.getPrecio());
            cl.setDouble(5, be.getSubTotal());
            cl.executeUpdate();
            Respuesta = "Detalle Venta Registrado....";
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

}
