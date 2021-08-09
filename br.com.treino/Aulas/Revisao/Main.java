package Revisao;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
//    static int qtdServidores = 1;
//    static Map<Integer, Pessoa> mapaServidores = new TreeMap<>();

    public static void main(String[] args) {

        //COMENTAR A CLASSE "COMPRADOR" PRA REVISAO FUNCIONAR

//        int inputMenu, inputCadastro, inputMap;
//        List <Funcionario> listaFuncionarios = new ArrayList<>();
//        List <Gerente> listaGerentes = new ArrayList<>();
//
//        while(true){
//            printaMenu();
//            inputMenu = input(1, 5);
//
//            switch(inputMenu){
//                case 1:
//                    System.out.println("1 - Cadastrar funcionário");
//                    System.out.println("2 - Cadastrar gerente");
//                    inputCadastro = sc.nextInt();
//
//                    if(inputCadastro == 1){
//                        Funcionario f = new Funcionario();
//                        cadastraFuncionario(f,listaFuncionarios);
//                    }else if(inputCadastro == 2){
//                        Gerente g = new Gerente();
//                        cadastraGerente(g, listaGerentes);
//                    }
//                    break;
//                case 2:
//                    System.out.println("Escolha o servidor");
//                    for(Map.Entry<Integer, Pessoa> entry : mapaServidores.entrySet()){
//                        System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
//                    }
//                    inputMap = sc.nextInt();
//                    System.out.println(mapaServidores.get(inputMap));
//                    break;
//
//
//                case 4:
//                    listaServidores(listaFuncionarios, listaGerentes);
//                    break;
//            }
//        }
//    }
//    private static void cadastraGerente(Gerente g, List<Gerente> listaGerente){
//        System.out.print("Nome: ");
//        g.setNome(sc.next());
//        g.setId(qtdServidores);
//        System.out.print("Contribuição bruta: ");
//        g.setContribuicao(sc.nextDouble());
//        System.out.print("Pontos de inovação: ");
//        g.setInovacao(sc.nextInt());
//        CalculaSalario.calcula(g);
//        listaGerente.add(g);
//        System.out.println("\nGerente cadastrado com sucesso!\n");
//        mapaServidores.put(qtdServidores, g);
//        Main.qtdServidores++;
//    }
//
//    private static void cadastraFuncionario(Funcionario f, List<Funcionario> listaFuncionario){
//        System.out.print("Nome: ");
//        f.setNome(sc.next());
//        f.setId(qtdServidores);
//        System.out.print("Contribuição bruta: ");
//        f.setContribuicao(sc.nextDouble());
//        System.out.print("Número de treinamentos fornecidos: ");
//        f.setTreinamentoFornecido(sc.nextInt());
//        CalculaSalario.calcula(f);
//        listaFuncionario.add(f);
//        System.out.println("\nFuncionário cadastrado com sucesso!\n");
//        mapaServidores.put(qtdServidores, f);
//        Main.qtdServidores++;
//    }
//
//
//    private static void printaMenu(){
//        System.out.println("1-Cadastrar servidor");
//        System.out.println("2-Informações de um servidor");
//        System.out.println("3-Listar servidores por salário");
//        System.out.println("4-Listar todos os servidores");
//        System.out.println("5-Sair");
//    }
//
//    private static void listaServidores(List<Funcionario> listaFuncionario, List<Gerente> listaGerente){
//        System.out.println("*****FUNCIONÁRIOS*****");
//        if(listaFuncionario.isEmpty()){
//            System.out.println("Não há funcionários cadastrados.\n");
//        }
//        for(Funcionario f: listaFuncionario){
//            System.out.println(f);
//        }
//
//        System.out.println("*****GERENTES*****");
//        if(listaGerente.isEmpty()){
//            System.out.println("Não há gerentes cadastrados.\n");
//        }
//        for(Gerente g: listaGerente){
//            System.out.println(g);
//        }
//    }
//
//    private static int input(int lowLimit, int topLimit){
//        int input = 0;
//        do{
//            input = sc.nextInt();
//
//            if(input < lowLimit || input > topLimit){
//                System.out.println("Digite uma entrada válida");
//                continue;
//            }
//            return input;
//        } while(input < lowLimit || input > topLimit);
//        return 0;
//    }
    }
}
