package JDBC;

import JDBC.Classes.Carro;
import JDBC.ConnectionFactory;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static int input;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList<>();

        while(true){
            menu();
            input = sc.nextInt();

            switch (input){
                case 1:
                    insert();
                    break;
                case 2:
                    select();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    return;
            }
        }
    }

    private static void menu(){
        System.out.println("MENU DE OPÇÕES");
        System.out.println("[1] Inserir carro");
        System.out.println("[2] Listar carros");
        System.out.println("[3] Atualizar carro");
        System.out.println("[4] Deletar carro");
        System.out.println("[5] Sair");
    }
    private static List<Carro> select(){
        Connection con = ConnectionFactory.getConnection();
        String command = "SELECT * from carro";
        return ConnectionFactory.select(con, command);
    }

    private static void insert(){
        Connection con = ConnectionFactory.getConnection();
        String command = "INSERT into CARRO(nome, preço) values(? , ?)";
        ConnectionFactory.insert(con, command);
    }
    private static void update() {
        //Os ? não devem ser escritos como '?', senão o código não reconhece!
        Connection con = ConnectionFactory.getConnection();
        System.out.println("Selecione uma das opções para atualizar:");
        select();
        input =  sc.nextInt();

        String command = "UPDATE `db_carros`.`carro` SET `nome` = ?, `preço` = ? WHERE (`id` = '" + input + "');";
        ConnectionFactory.update(con, command);
    }
    private static void delete(){
        Connection con = ConnectionFactory.getConnection();
        System.out.println("Selecione uma das opções para deletar:");
        select();
        input =  sc.nextInt();

        String command = "DELETE FROM `db_carros`.`carro` WHERE (`id` = '" + input + "');\n";
        ConnectionFactory.delete(con, command);
    }


}
