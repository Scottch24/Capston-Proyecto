package ModeloDAO;

import Config.Conexion;
import Interface.IProductos;
import Modelo.Productos;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.io.OutputStream;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.http.HttpServletResponse;

public class daoProductos implements IProductos {

    Conexion con = new Conexion();

    CallableStatement cl = null;

    @Override
    public void listarImg(String id, HttpServletResponse response) throws ClassNotFoundException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        BufferedInputStream buferredinputStream = null;
        BufferedOutputStream bufferredoutputStream = null;
        response.setContentType("image/*");
        try {
            outputStream = response.getOutputStream();
            CallableStatement cl = con.Conectar().prepareCall("{call Productos_MostrarImgen(?)}");
            cl.setString(1, id);
            ResultSet rs = cl.executeQuery();
            if (rs.next()) {
                inputStream = rs.getBinaryStream("Imagenes");
            }
            buferredinputStream = new BufferedInputStream(inputStream);
            bufferredoutputStream = new BufferedOutputStream(outputStream);
            int i = 0;
            while ((i = buferredinputStream.read()) != -1) {
                bufferredoutputStream.write(i);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error Mostrar Imagen: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Productos> Buscar(String Letra) throws ClassNotFoundException {
        ArrayList<Productos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Productos_Buscar(?)}");
            cl.setString(1, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Productos be = new Productos();
                be.setIdProductos(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setStock(rs.getInt(3));
                be.setDescripcion(rs.getString(4));
                be.setPrecio(rs.getDouble(5));
                be.setIdCategoria(rs.getInt(6));
                be.setCategoria(rs.getString(7));
                be.setImagen(rs.getBinaryStream(8));
                be.setFechaActualiza(rs.getString(9));
                be.setEstado(rs.getString(10));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en Producto Buscar : " + e.getMessage());
        }
        return list;
    }

    @Override
    public ArrayList<Productos> Listar() throws ClassNotFoundException {
        ArrayList<Productos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Productos_Mostrar()}");
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Productos be = new Productos();
                be.setIdProductos(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setStock(rs.getInt(3));
                be.setDescripcion(rs.getString(4));
                be.setPrecio(rs.getDouble(5));
                be.setIdCategoria(rs.getInt(6));
                be.setCategoria(rs.getString(7));
                be.setImagen(rs.getBinaryStream(8));
                be.setFechaActualiza(rs.getString(9));
                be.setEstado(rs.getString(10));
                be.setNombreArchivo(rs.getString(11));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en mostrar Producto: " + e.getMessage());
        }
        return list;
    }

    @Override
    public ArrayList<Productos> BuscarCategolo(String Categoria,String Letra) throws ClassNotFoundException {
        ArrayList<Productos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Productos_Buscar_Categoria(?,?)}");
            cl.setString(1, Categoria);
            cl.setString(2, Letra);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Productos be = new Productos();
                be.setIdProductos(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setStock(rs.getInt(3));
                be.setDescripcion(rs.getString(4));
                be.setPrecio(rs.getDouble(5));
                be.setIdCategoria(rs.getInt(6));
                be.setCategoria(rs.getString(7));
                be.setImagen(rs.getBinaryStream(8));
                be.setFechaActualiza(rs.getString(9));
                be.setEstado(rs.getString(10));
                be.setNombreArchivo(rs.getString(11));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en mostrar Producto: " + e.getMessage());
        }
        return list;
    }

    @Override
    public ArrayList<Productos> ListarCategolo(String Categoria) throws ClassNotFoundException {
        ArrayList<Productos> list = new ArrayList<>();
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Productos_Mostrar_Categoria(?)}");
            cl.setString(1, Categoria);
            ResultSet rs = cl.executeQuery();
            while (rs.next()) {
                Productos be = new Productos();
                be.setIdProductos(rs.getString(1));
                be.setNombre(rs.getString(2));
                be.setStock(rs.getInt(3));
                be.setDescripcion(rs.getString(4));
                be.setPrecio(rs.getDouble(5));
                be.setIdCategoria(rs.getInt(6));
                be.setCategoria(rs.getString(7));
                be.setImagen(rs.getBinaryStream(8));
                be.setFechaActualiza(rs.getString(9));
                be.setEstado(rs.getString(10));
                be.setNombreArchivo(rs.getString(11));
                list.add(be);
            }
            cl.close();
            rs.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en mostrar Producto: " + e.getMessage());
        }
        return list;
    }

    @Override
    public String Registrar(Productos be) {
        String Respuesta = "";
        try {
            cl = con.Conectar().prepareCall("{call Productos_Registrar(?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getNombre());
            cl.setString(2, be.getDescripcion());
            cl.setDouble(3, be.getPrecio());
            cl.setInt(4, be.getIdCategoria());
            cl.setBlob(5, be.getImagen());
            cl.setInt(6, be.getStock());
            cl.setString(7, be.getNombreArchivo());
            cl.registerOutParameter(8, java.sql.Types.VARCHAR);
            cl.executeUpdate();
            Respuesta = cl.getString(8);
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error Registra Producto: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public String Actualizar(Productos be) {
        String Respuesta = "";
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Producto_Actulizar(?,?,?,?,?,?,?,?,?)}");
            cl.setString(1, be.getIdProductos());
            cl.setString(2, be.getNombre());
            cl.setString(3, be.getDescripcion());
            cl.setDouble(4, be.getPrecio());
            cl.setInt(5, be.getStock());
            cl.setInt(6, be.getIdCategoria());
            cl.setString(7, "Habilitado");
            cl.setBlob(8, be.getImagen());
            cl.setString(9, be.getNombreArchivo());
            cl.executeUpdate();
            Respuesta = "Producto Actualizado";
            cl.close();
            con.Conectar().close();

        } catch (Exception e) {
            System.err.println("Error en Actualiza Producto: " + e.getMessage());
        }
        return Respuesta;
    }

    @Override
    public void Eliminar(String id) {
        try {
            CallableStatement cl = con.Conectar().prepareCall("{call Producto_Eliminar(?)}");
            cl.setString(1, id);
            cl.executeUpdate();
            cl.close();
            con.Conectar().close();
        } catch (Exception e) {
            System.out.println("Error en Elimina Producto: " + e.getMessage());
        } finally {

        }
    }

}
