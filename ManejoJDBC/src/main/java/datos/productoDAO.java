package datos;

import domain.producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class productoDAO {

    public static final String SQL_SELECT = "SELECT * FROM productos";
    public static final String SQL_INSERT = "INSERT INTO productos(referenciaProducto,nombreProducto,precioCosto,precioVenta)VALUES(? ,? ,? ,?)";
    public static final String SQL_ELIMINAR = "DELETE FROM productos WHERE id=?";
    public static final String SQL_ACTUALIZAR="UPDATE productos SET referenciaProducto=?,nombreProducto=?,precioCosto=?,precioVenta=? WHERE id=?";

    public List<producto> seleccionar() {
        Connection conexion = null; //se define objeto de la interface CONNECTION

        PreparedStatement query = null;//se define objeto de la interface PreparedStatement que va a contener el query
        ResultSet res = null;//se define objeto de la interface RESULTSET
        producto pro = null; //definimos el objeto pro de la clase producto
        List<producto> productos = new ArrayList<>(); //creamos una lista para almacenar los objetos de tipo producto
        try {
            conexion = Conexion.getConnection(); //crea una conexion
            query = conexion.prepareStatement(SQL_SELECT);//prepara el query
            res = query.executeQuery(); //Ejecuta el query
            while (res.next()) {
                int id = res.getInt("id");
                String referenciaProducto = res.getString("referenciaProducto");
                String nombreProducto = res.getString("nombreProducto");
                double precioCosto = res.getDouble("precioCosto");
                double precioVenta = res.getDouble("precioVenta");
                pro = new producto(id, referenciaProducto, nombreProducto, precioCosto, precioVenta);   // creamos objeto de tipo persona, con información de la bdd
                productos.add(pro);//agregar a la lista el objeto persona
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(res);
                /*cerramos objetos de conexion, statement y resulset*/
                Conexion.close(query);
                Conexion.close(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return productos;
    }

    public int insertar(producto p) {
        int cantidadRegistros = 0;
        Connection conexion;
        PreparedStatement query;

        try {
            conexion = Conexion.getConnection();
            query = conexion.prepareStatement(SQL_INSERT);
            query.setString(1, p.getReferenciaProducto());
            query.setString(2, p.getNombreProducto());
            query.setDouble(3, p.getPrecioCosto());
            query.setDouble(4, p.getPrecioVenta());
            query.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return cantidadRegistros;
    }

    public int elmininar(producto p) {
        int registrosBorrados = 0;
        Connection conexion;
        PreparedStatement query;

        try {
            conexion = Conexion.getConnection();
            query = conexion.prepareStatement(SQL_ELIMINAR);
            query.setInt(1, p.getId());
            query.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return registrosBorrados;
    }

    public int actualizar(producto p) {
        int registrosActualizados = 0;
        Connection conexion;
        PreparedStatement query;
        
        try {
            conexion=Conexion.getConnection();
            query=conexion.prepareStatement(SQL_ACTUALIZAR);
            query.setString(1, p.getReferenciaProducto());
            query.setString(2, p.getNombreProducto());
            query.setDouble(3, p.getPrecioCosto());
            query.setDouble(4, p.getPrecioVenta());
            query.setDouble(5, p.getId());
            query.executeUpdate();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        
        
        
        
        return registrosActualizados;
    }

}
