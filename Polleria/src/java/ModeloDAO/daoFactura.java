package ModeloDAO;

import Config.Conexion;
import Interface.IFactura;
import Modelo.Factura;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class daoFactura implements IFactura {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Factura> Listar(String Codigo) throws ClassNotFoundException {
        ArrayList<Factura> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Factura_Mostrar(?)}");
            cl.setString(1, Codigo);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Factura be = new Factura();
                be.setIdFactura(rs.getString(1));
                be.setIgv(rs.getDouble(2));
                be.setTotalPagar(rs.getDouble(3));
                be.setTotal(rs.getDouble(4));
                be.setIdFormaPago(rs.getInt(5));
                be.setFormaPago(rs.getString(6));
                be.setIdCLiente(rs.getString(7));
                be.setCliente(rs.getString(8));
                be.setDNI(rs.getInt(9));
                be.setIdPedido(rs.getString(10));
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
    public String Registrar(Factura be) {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Factura_Registrar(?,?,?,?,?,?)}");
            cl.setDouble(1, be.getIgv());
            cl.setDouble(2, be.getTotalPagar());
            cl.setInt(3, be.getIdFormaPago());
            cl.setString(4, be.getIdCLiente());
            cl.setString(5, be.getIdPedido());
            cl.registerOutParameter(6, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(6);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Respuesta;
    }

}
