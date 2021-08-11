package JDBC;

import JDBC.Classes.Comprador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ConnectionFactory {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";

        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void closeConnection(Connection con) {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con, Statement stmt) {
        closeConnection(con);
        try {
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeConnection(Connection con, Statement stmt, ResultSet rs) {
        closeConnection(con,stmt);
        try {
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void add(Connection con, String command) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
            closeConnection(con, stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Connection con, String command) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
            closeConnection(con, stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Connection con, String command) {
        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(command);
            closeConnection(con, stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void allToUpperCase(Connection con, String command){
        try {
            Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery(command);

            while(rs.next()){
                rs.updateString("nome",rs.getString("nome").toUpperCase());
                rs.updateRow();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
