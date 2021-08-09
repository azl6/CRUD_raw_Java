package JDBC;

import javax.swing.plaf.nimbus.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoFactory {

    public static Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "jeisonsuper1";

        try {
            return DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void fecha(Connection con){
        try {
            if(con != null)
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void fecha(Connection con, Statement stmt) {
        fecha(con);
        try {
            if (stmt != null)
                stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static void insertData(Connection con, String command){
        //este método já se escarrega de fechar a conexão e o statement
        Statement stmt = null;
        try {

            //inicializa-se o statement, e depois executa-se o comando passado
            stmt = con.createStatement();
            stmt.executeUpdate(command);
            System.out.println("Dado inserido com sucesso!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            ConexaoFactory.fecha(con,stmt);
        }
    }
    public static void deleteData(Connection con, String command){
        Statement stmt = null;

        try {
            stmt = con.createStatement();
            stmt.executeUpdate(command);
            System.out.println("Dado deletado com sucesso!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally{
            ConexaoFactory.fecha(con,stmt);
        }
    }

    public static void updateData(Connection con, String command){
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(command);
            System.out.println("Dados atualizados com sucesso!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            ConexaoFactory.fecha(con,stmt);
        }

    }
}
