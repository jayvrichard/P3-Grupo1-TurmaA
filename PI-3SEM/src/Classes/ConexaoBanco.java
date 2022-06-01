package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBanco {

    /*private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://remotemysql.com:3306/WhwBtP484b";
    private static final String USER = "WhwBtP484b";
    private static final String PASS = "FAnt8f8rte";*/
    private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/comanda";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {

        try {

            Class.forName(Driver);
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    private Connection con = null;

    public void Cadastrar() {

        con = ConexaoBanco.getConnection();

    }

    public static void main(String[] args) {
        getConnection();
    }

    public static void closeConnection(Connection con) {

        if (con != null) {

            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        if (stmt != null) {

            try {
                stmt.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con);
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        if (rs != null) {

            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro: " + ex);
            }
        }
        closeConnection(con, stmt);
    }
}
