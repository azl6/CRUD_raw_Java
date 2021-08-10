package JDBC;

import JDBC.Classes.Comprador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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

    public static List<Comprador> selectAll(Connection con, String command) {
        List<Comprador> listaCompradores = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);

            while (rs.next()) {
                listaCompradores.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("nome"));
                System.out.println("------------------");
            }
            closeConnection(con, stmt);
            return listaCompradores;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void searchByName(Connection con, String pesquisa) {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(pesquisa);

            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("nome"));
                System.out.println("------------------");
            }
            closeConnection(con, stmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
