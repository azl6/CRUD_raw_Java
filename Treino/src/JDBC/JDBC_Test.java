package JDBC;

import JDBC.Classes.Comprador;
import JDBC.Tables.CompradorDB;

import java.util.ArrayList;
import java.util.List;

public class JDBC_Test {
    public static void main(String[] args) {
        List<Comprador> listaComprador = new ArrayList<>();
        //Statement para inserções, atualizações e remoções
        //ResultSet para buscas (executeQuery)

//        Comprador comprador = new Comprador("555.555.555-55","Vitória Delmouro");
//        comprador.setId(4);
//        CompradorDB.update(comprador);

        CompradorDB.searchByName("Silva");


    }
}
