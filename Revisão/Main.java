package Revisao_2;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int inputMenu, inputCadastro;
        List <Funcionario> listaFuncionarios = new ArrayList<>();
        List <Gerente> listaGerentes = new ArrayList<>();
        Map<Integer, Funcionario> mapaFuncionarios = new TreeMap<>();
        Map<Integer, Gerente> mapaGerentes = new TreeMap<>();

        while(true){
            printaMenu();
            inputMenu = input(1, 4);

            switch(inputMenu){
                case 1:
                    System.out.println("1 - Cadastrar funcionário");
                    System.out.println("2 - Cadastrar gerente");
                    inputCadastro = sc.nextInt();

                    if(inputCadastro == 1){
                        Funcionario f = new Funcionario();
                        cadastraFuncionario(f,listaFuncionarios);
                    }else if(inputCadastro == 2){
                        Gerente g = new Gerente();
                        cadastraGerente(g, listaGerentes);
                    }
                    break;
            }
        }
    }
    private static void cadastraGerente(Gerente g, List<Gerente> listaGerente){
        System.out.print("Nome: ");
        g.setNome(sc.nextLine());
        System.out.print("ID: ");
        g.setId(sc.nextInt());
        System.out.print("Contribuição bruta: ");
        g.setContribuicao(sc.nextDouble());
        System.out.print("Pontos de inovação: ");
        g.setInovacao(sc.nextInt());
        listaGerente.add(g);
        System.out.println("\nGerente cadastrado com sucesso!\n");
    }

    private static void cadastraFuncionario(Funcionario f, List<Funcionario> listaFuncionario){
        System.out.print("Nome: ");
        f.setNome(sc.next());
        System.out.print("ID: ");
        f.setId(sc.nextInt());
        System.out.print("Contribuição bruta: ");
        f.setContribuicao(sc.nextDouble());
        System.out.print("Número de treinamentos fornecidos: ");
        f.setTreinamentoFornecido(sc.nextInt());
        listaFuncionario.add(f);
        System.out.println("\nFuncionário cadastrado com sucesso!\n");
    }


    private static void printaMenu(){
        System.out.println("1-Cadastrar servidor");
        System.out.println("2-Informações de um servidor");
        System.out.println("3-Listar servidores por salário");
        System.out.println("4-Sair");
    }

    private static int input(int lowLimit, int topLimit){
        int input = 0;
        do{
            input = sc.nextInt();

            if(input < lowLimit || input > topLimit){
                System.out.println("Digite uma entrada válida");
                continue;
            }
            return input;
        } while(input < lowLimit || input > topLimit);
        return 0;
    }
}
