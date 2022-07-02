package ModeloDAO;

import Config.Conexion;
import Interface.IVentas;
import Modelo.Ventas;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class daoVentas implements IVentas {

    Conexion con = new Conexion();

    @Override
    public ArrayList<Ventas> Listar(String Letra) {
        ArrayList<Ventas> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Venta_Mostrar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Ventas be = new Ventas();
                be.setIdVentas(rs.getString(1));
                be.setIdCliente(rs.getString(2));
                be.setCliente(rs.getString(3));
                be.setFecha_Pedido(rs.getString(4));
                be.setLongitud(rs.getString(5));
                be.setLatitud(rs.getString(6));
                be.setTotal(rs.getDouble(7));
                be.setEstado(rs.getString(8));
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
    public String Registrar(Ventas be) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Venta_Registrar(?,?,?,?,?,?)}");
            cl.setString(1, be.getIdCliente());
            cl.setString(2, be.getLongitud());
            cl.setString(3, be.getLatitud());
            cl.setDouble(4, be.getTotal());
            cl.setString(5, dtf.format(LocalDateTime.now()));
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
