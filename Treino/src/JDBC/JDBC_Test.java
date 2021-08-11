package JDBC;

import JDBC.Classes.Comprador;
import JDBC.Tables.CompradorDB;

import java.util.ArrayList;
import java.util.List;

public class JDBC_Test {
    public static void main(String[] args) {
        List<Comprador> listaComprador = new ArrayList<>();

        //atualizar rows com RESULT SET!!! (chegando em casa) - FEITO!
        //criar uma stored procedure no DB e chamá-la pelo código

        //Statement para inserções, atualizações e remoções (ou PreparedStatement, para ações mais seguras)
        //ResultSet para buscas (executeQuery)

//        Comprador comprador = new Comprador("555.555.555-55","Vitória Delmouro");
//        comprador.setId(4);
//        CompradorDB.update(comprador);

          CompradorDB.searchByNamePreparedStatement("delmouro");


    }
}
