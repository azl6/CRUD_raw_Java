package JDBCteste1;

import JDBC.ConexaoFactory.ConexaoFactory;

public class TesteConexao {
    public static void main(String[] args) {
        ConexaoFactory conexao = new ConexaoFactory();

        conexao.getConexao();
    }
}
