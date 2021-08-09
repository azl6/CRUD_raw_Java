package JDBC.DB;

import JDBC.Classes.Comprador;
import JDBC.ConexaoFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CompradorDB {

    //para qualquer comando no BD:
    //1-digita-se o comando em uma string
    //2-realiza-se a conexao com o bd
    //3-chama-se a função

    public static void salvarDados(Comprador comprador){
         String command = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('" + comprador.getCpf() +  "', '" + comprador.getNome() +"');";

        Connection con = ConexaoFactory.getConexao();
        ConexaoFactory.insertData(con, command);
    }
    public static void deletaDados(Comprador comprador){
        String command = "DELETE FROM `agencia`.`comprador` WHERE (`id` = '" + comprador.getId() + "');";
        Connection con = ConexaoFactory.getConexao();
        ConexaoFactory.deleteData(con,command);
    }
    public static void atualizaDados(Comprador comprador){
        String command = "UPDATE `agencia`.`comprador` SET `cpf` = '111.111.111-11', `nome` = 'MariaB' WHERE (`id` = '" + comprador.getId() + "');";
        Connection con = ConexaoFactory.getConexao();
        ConexaoFactory.updateData(con,command);
    }
}
