package JDBC.Tables;

import JDBC.Classes.Comprador;
import JDBC.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
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

    public static List<Comprador> selectAll(){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * FROM agencia.comprador;";
        List<Comprador> listaCompradores = new ArrayList<>();
        listaCompradores = ConnectionFactory.selectAll(con, command);
        return listaCompradores;
    }
    public static void searchByName(String pesquisa){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * FROM agencia.comprador WHERE nome LIKE '%" + pesquisa + "%';";
        ConnectionFactory.searchByName(con, pesquisa);
    }
}
