package datos;

import java.sql.*;

public class Conexion {

    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static final String BASEDD = "productos";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BASEDD + "?useSSl=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    public static Connection getConexion() throws SQLException {

        return DriverManager.getConnection(URL, USUARIO, PASSWORD);

    }

    public static void close(ResultSet res) throws SQLException {
        res.close();
    }

    public static void close(Connection c) throws SQLException {
        c.close();
    }

    public static void close(PreparedStatement ps) throws SQLException {
        ps.close();
    }

}
