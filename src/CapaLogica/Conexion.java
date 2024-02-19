package CapaLogica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static Connection conn = null;

    public static Connection conectar() {
        String url = "jdbc:sqlserver://DESKTOP-0CNK91I\\SQLEXPRESS\\SQLEXPRESS:1433;database=db_ventas";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error de sql" + e.getMessage());
        }

        try {
            conn = DriverManager.getConnection(url, "sa", "1234");
        } catch (SQLException e) {
            System.out.println("Error de conexion del driver" + e.getMessage());
        }
        return conn;

    }

}







