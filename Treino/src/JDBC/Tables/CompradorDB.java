package JDBC.Tables;

import JDBC.Classes.Comprador;
import JDBC.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CompradorDB {

    public static void add(Comprador comprador){
        Connection con = ConnectionFactory.getConnection();
        String command = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() + "', '" + comprador.getName() + "');";
        ConnectionFactory.add(con, command);
        System.out.println("Informações adicionadas ao BD!");
    }

    public static void delete(Comprador comprador){

        Connection con = ConnectionFactory.getConnection();
        String command = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        ConnectionFactory.delete(con, command);
    }

    public static void update(Comprador comprador){
        Connection con = ConnectionFactory.getConnection();
        String command = "UPDATE `agencia`.`comprador` SET `cpf` = '" + comprador.getCpf() + "', `nome` = '" + comprador.getName() + "' WHERE (`id` = '" + comprador.getId() + "');";
        ConnectionFactory.update(con, command);
    }

    public static void selectAll(){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * FROM agencia.comprador;";

        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);

            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("nome"));
                System.out.println("-------------------------");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void searchByName(String search){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * FROM agencia.comprador WHERE nome LIKE '%" + search + "%';";

        Statement stmt = null;
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);

            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("cpf"));
                System.out.println(rs.getString("nome"));
                System.out.println("-------------------------");
            }
            ConnectionFactory.closeConnection(con,stmt,rs);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void searchByNamePreparedStatement(String search){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * FROM agencia.comprador WHERE nome LIKE ?";

        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(command);
            ps.setString(1, "%" + search + "%");
            ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println(rs.getInt("id"));
                    System.out.println(rs.getString("cpf")) ;
                    System.out.println(rs.getString("nome"));
                    System.out.println("-------------------------");
                }

            ConnectionFactory.closeConnection(con,ps,rs);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void allToUpperCase(){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * from agencia.comprador;";
        ConnectionFactory.allToUpperCase(con, command);

    }
}
