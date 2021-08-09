package JDBC;

import JDBC.Classes.Comprador;
import JDBC.ConexaoFactory;
import JDBC.DB.CompradorDB;

public class JDBCteste1 {
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("333.333.333-33","Renan Silva Rodrigues");
        //CompradorDB.salvarDados(comprador1);
        comprador1.setId(6);
        CompradorDB.atualizaDados(comprador1);
    }
}
