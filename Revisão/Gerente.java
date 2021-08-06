package Revisao_2;

public class Gerente extends Pessoa {
    private int inovacao;

    public Gerente(String nome, int id, double contribuicao, int inovacao) {
        super(nome, id, contribuicao);
        this.inovacao = inovacao;
    }
    public Gerente(){}

    public int getInovacao() {
        return inovacao;
    }

    public void setInovacao(int inovacao) {
        this.inovacao = inovacao;
    }
}
