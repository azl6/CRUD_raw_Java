package Revisao_2;

public class Funcionario extends Pessoa{
    int treinamentoFornecido;

    public Funcionario(String nome, int id, double contribuicao, int treinamentoFornecido) {
        super(nome, contribuicao);
        this.treinamentoFornecido = treinamentoFornecido;
    }
    public Funcionario(){}

    public int getTreinamentoFornecido() {
        return treinamentoFornecido;
    }

    public void setTreinamentoFornecido(int treinamentoFornecido) {
        this.treinamentoFornecido = treinamentoFornecido;
    }
}
