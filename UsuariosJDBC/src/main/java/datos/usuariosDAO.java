package datos;

import domain.Usuarios;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class usuariosDAO {

    public static final String SQL_INSERTAR = "INSERT INTO usuarios(nombre,password)VALUES(?,?)";
    public static final String SQL_ACTUALIZAR = "UPDATE usuarios SET nombre=?, password=? WHERE id=?";
    public static final String SQL_ELIMINAR = "DELETE FROM usuarios WHERE id=?";
    public static final String SQL_SELECCIONAR = "SELECT * FROM usuarios";

    public static int insertar(Usuarios u) {
        int registrosInsertados = 0;
        Connection conexion;
        PreparedStatement query = null;

        try {
            conexion = Conexion.getConexion();
            query = conexion.prepareStatement(SQL_INSERTAR);
            query.setString(1, u.getUsuario());
            query.setString(2, u.getPassword());
            query.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return registrosInsertados;
    }

    public static int actualizar(Usuarios u) {
        int registrosActualizados = 0;
        Connection conexion;
        PreparedStatement query = null;
        try {
            conexion = Conexion.getConexion();
            query = conexion.prepareStatement(SQL_ACTUALIZAR);
            query.setString(1, u.getUsuario());
            query.setString(2, u.getPassword());
            query.setInt(3, u.getId());
            query.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }

        return registrosActualizados;
    }

    public static int eliminar(Usuarios u) {
        int registrosEliminados = 0;

        Connection conexion;
        PreparedStatement query;

        try {
            conexion = Conexion.getConexion();
            query = conexion.prepareStatement(SQL_ELIMINAR);
            query.setInt(1, u.getId());
            query.execute();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }

        return registrosEliminados;
    }

    public static List<Usuarios> obtener() {
        List<Usuarios> usuarios = new ArrayList<>();
        Connection conexion = null;
        PreparedStatement query = null;
        ResultSet res;
        try {
            conexion = Conexion.getConexion();
            query = conexion.prepareStatement(SQL_SELECCIONAR);
            query.executeQuery();
            res = query.getResultSet();

            while (res.next()) {
                res.getString("nombre");
                res.getString("password");
                res.getString("id");
                Usuarios usr=new Usuarios(res.getString("nombre"), res.getString("password"),res.getInt("id"));
                usuarios.add(usr);
            }

        } catch (SQLException e) {
        } finally {
            try {
                Conexion.close(conexion);
                Conexion.close(query);
            } catch (SQLException e) {
            }

        }

        return usuarios;
    }

}
