package datos;

import java.sql.*;

public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/productos?useSSl=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public static void close(ResultSet res) throws SQLException {

        res.close();

    }

    public static void close(Statement query) throws SQLException {
        query.close();
    }

    public static void close(Connection conexion) throws SQLException {
        conexion.close();
    }

}
