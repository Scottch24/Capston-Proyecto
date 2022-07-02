package ModeloDAO;

import Config.Conexion;
import Interface.ICompraDetalle;
import Modelo.DetalleCompras;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoCompraDetalle implements ICompraDetalle {

    Conexion con = new Conexion();

    @Override
    public ArrayList<DetalleCompras> Listar(String CodigoCompra) {
        ArrayList<DetalleCompras> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call DetalleCompras_Mostrar(?)}");
            cl.setString(1, CodigoCompra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                DetalleCompras be = new DetalleCompras();
                be.setIdCompra(rs.getString(1));
                be.setIdIngredientes(rs.getInt(2));
                be.setNombre(rs.getString(3));
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
    public String Registrar(DetalleCompras dpo) {
        String Respuesta = "";
        try {
            try (CallableStatement cl = con.Conectar().prepareCall("{call DetalleCompra_Registrar(?,?,?,?,?)}")) {
                cl.setString(1, dpo.getIdCompra());
                cl.setInt(2, dpo.getIdIngredientes());
                cl.setInt(3, dpo.getCantidad());
                cl.setDouble(4, dpo.getPrecio());
                cl.setDouble(5, dpo.getSubTotal());
                cl.executeUpdate();
                cl.close();
                con.Conectar().close();
                Respuesta = "Detalle Venta Registrado.....";
            }

        } catch (Exception e) {
            System.out.println("Errror: " + e);
        }
        return Respuesta;

    }

}
