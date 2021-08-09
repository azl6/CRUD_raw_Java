package Revisao_2;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int id;
    private Double salario;
    private double contribuicao;

    public Pessoa(String nome, double contribuicao){
        this.nome = nome;
        this.contribuicao = contribuicao;
    }
    public Pessoa(){}

    @Override
    public int compareTo(Pessoa o) {
        return this.salario.compareTo(o.getSalario());
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nID: " + this.id +
                "\nSalário: " + this.salario +
                "\n";
    }

    public void printaInfo() {
        System.out.printf("Nome: %s\nID: %d\nSalário: R$ %.2f\n\n", this.nome, this.id, this.salario);
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
