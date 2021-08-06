package Revisao_2;

public class Pessoa {
    private String nome;
    private int id;
    private double salario;
    private double contribuicao;

    public Pessoa(String nome, int id, double contribuicao){
        this.nome = nome;
        this.id = id;
        this.contribuicao = contribuicao;
    }
    public Pessoa(){}

    public void printaInformacoes(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Salario: R$ %.2f\n\n", this.salario);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getId(){
        return this.id;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario(){
        return this.salario;
    }

    public double getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(double contribuicao) {
        this.contribuicao = contribuicao;
    }
}
