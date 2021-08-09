package JDBC.ConexaoFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    public Connection getConexao(){
        String url = "jdbc:mysql://localhost:3306/agencia";
        String user = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url,user,password);
            System.out.println(con);
            return con;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
