package Revisao_2;

public class CalculaSalario {

    public static void calcula(Pessoa p){
        if(p instanceof Funcionario){
        Funcionario f = (Funcionario) p;
        f.setSalario(1000 + f.getContribuicao() * 0.1 + f.getTreinamentoFornecido() * 300);
        }else if(p instanceof Gerente){
            Gerente g = (Gerente) p;
            g.setSalario(4000 + g.getContribuicao()*0.2 + g.getInovacao() * 5000);
        }
    }
}
