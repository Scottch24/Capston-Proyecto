package Config;

import com.mysql.cj.jdbc.Driver;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    public Conexion() {
    }

    public Connection Conectar() {
        Connection con = null;
        String user = "root";
        String pass = "";
        String Url = "jdbc:mysql://localhost:3306/restaurante_sowad2";
        try {
            DriverManager.registerDriver(new Driver());
            con = DriverManager.getConnection(Url, user, pass);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return con;
    }
     
}
