package JDBC;

import JDBC.Classes.Carro;
import com.mysql.cj.jdbc.result.UpdatableResultSet;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConnectionFactory {

    static Scanner sc = new Scanner(System.in);

    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/db_carros";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Carro> select(Connection con, String command){
        List<Carro> listaCarros = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(command);
            while(rs.next()){
                Carro c = new Carro(rs.getString("nome"),rs.getDouble("preço"));
                System.out.printf("[%d] - %s - R$ %.2f\n", rs.getInt("ID"), rs.getString("nome"), rs.getDouble("preço"));
            }
            System.out.println();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return listaCarros;
    }

    public static void insert(Connection con, String command){
        try {
            //para o insert com PreparedStatement, usa-se o executeUpdate();
            PreparedStatement ps = con.prepareStatement(command);
            System.out.print("Nome: ");
            ps.setString(1, sc.nextLine());
            System.out.print("Preço: ");
            ps.setDouble(2, sc.nextDouble());
            ps.executeUpdate();
            System.out.println("Inserção concluída!\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(Connection con, String command){
        try {
            PreparedStatement ps = con.prepareStatement(command);
            System.out.print("Novo nome: ");
            ps.setString(1, sc.nextLine());
            System.out.print("Novo preço: ");
            ps.setDouble(2, sc.nextDouble());
            ps.executeUpdate();
            System.out.println("Atualização concluída!\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(Connection con, String command){
        try {
            PreparedStatement ps = con.prepareStatement(command);
            ps.executeUpdate();
            System.out.println("Remoção realizada com sucesso!\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
