package jdbc;

import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;

public class ConsultarPessoa {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = """
                SELECT * FROM pessoa;
        """;
        Statement statement = conexao.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        ArrayList<Pessoa> pessoas = new ArrayList();

        while (resultSet.next()) {
            pessoas.add(new Pessoa(resultSet.getInt("codigo"), resultSet.getString("nome")));
        }

        pessoas.forEach(pessoa ->  System.out.println(pessoa.getCodigo() + " " + pessoa.getNome()));

        statement.close();
        conexao.close();
    }
}
