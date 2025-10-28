package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ConsultarPessoaPorNome {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection conexao = FabricaConexao.getConexao();
        Scanner sc = new Scanner(System.in);

        String nomeConsulta = sc.nextLine();

        String sql = """
                Select * from pessoa where nome like ?;
                """;

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + nomeConsulta + "%");
        ResultSet rs = stmt.executeQuery();

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        while (rs.next()) {
            pessoas.add(new Pessoa(rs.getInt("codigo"), rs.getString("nome")));
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getCodigo() + " - " + pessoa.getNome());
        }

        rs.close();
        conexao.close();
    }
}
