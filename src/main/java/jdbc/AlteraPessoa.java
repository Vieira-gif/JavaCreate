package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AlteraPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o Nome do Pessoa: ");
        String novoNome = sc.nextLine();

        System.out.println("Digite o codigo: ");
        int codigo = sc.nextInt();

        sc.close();

        String sql  = """
                UPDATE pessoa SET nome = ? where codigo = ?;
        """;

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement smt = conexao.prepareStatement(sql);
        smt.setString(1, novoNome);
        smt.setInt(2, codigo);
        smt.executeUpdate();

        conexao.close();
    }
}
