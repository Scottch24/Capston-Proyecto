package Controlador;

import Modelo.DetalleVenta;
import Modelo.Factura;
import Modelo.Productos;
import Modelo.Ventas;
import ModeloDAO.daoCesta;
import ModeloDAO.daoFactura;
import ModeloDAO.daoVentaDetalle;
import ModeloDAO.daoVentas;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
public class SevVentas extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SevVentas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SevVentas at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        daoCesta c = (daoCesta) request.getSession().getAttribute("Cesta");

        if (c == null) {
            c = new daoCesta();
        }
        
        String VentaEleccion = request.getParameter("accion");

        switch (VentaEleccion) {
            case "Empleados": {

                //Instacias de clases
                Ventas ven = new Ventas();
                DetalleVenta detVen = new DetalleVenta();
                Factura fac = new Factura();

                daoVentas daoven = new daoVentas();
                daoVentaDetalle daodetVen = new daoVentaDetalle();
                daoFactura daofac = new daoFactura();

                //Instacia De la Tabla Cesta
                List<Productos> lista = c.getLista();

                //Variables
                String idCli = request.getParameter("idCliente");
                int idFormapag = Integer.parseInt(request.getParameter("selFormaPago"));
                double totFac = 0.0;

                //Setteo Venta
                ven.setIdCliente(idCli);
                ven.setLongitud("0");
                ven.setLatitud("0");
                ven.setTotal(c.getTotal());
                String idVenta = daoven.Registrar(ven); //Registra Venta Devuelve IdVenta

                //Recorre filas de la tabla Cesta
                for (Productos dat: lista) {
                    //Setteo del detalle venta
                    detVen.setidVenta(idVenta);
                    detVen.setIdProducto(dat.getIdProductos());
                    detVen.setCantidad(dat.getStock());
                    detVen.setPrecio(dat.getPrecio());
                    detVen.setSubTotal(dat.getPrecio() * dat.getStock());
                    //guarda El total de todo el arreglo
                    totFac = totFac + (dat.getPrecio() * dat.getStock());
                    //Registra el detalle venta
                    daodetVen.Registrar(detVen);
                }

                //Setteo Factura 
                fac.setIgv(totFac * 0.18);
                fac.setTotalPagar(totFac + fac.getIgv());
                fac.setIdCLiente(idCli);
                fac.setIdFormaPago(1);
                fac.setIdPedido(idVenta);

                //Registra la Factura
                daofac.Registrar(fac);

                //Limpiamos Cesta
                lista.clear();
                c.setTotal(0);
                //Setteamos Nueva Cesta
                request.getSession().setAttribute("Cesta", c);
                //Enviamos Datos al Ventas.jsp
                request.getRequestDispatcher("Web/Empresa/NVentas.jsp").forward(request, response);

                break;
            }
            case "Clientes": {

            }

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
