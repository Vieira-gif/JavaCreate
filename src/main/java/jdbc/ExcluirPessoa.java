package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        int codigo =  sc.nextInt();
        sc.close();

        Connection conexao = FabricaConexao.getConexao();
        String sql = "delete from pessoa where codigo = ?";

        PreparedStatement smt = conexao.prepareStatement(sql);
        smt.setInt(1, codigo);
        smt.execute();
        conexao.close();


    }
}
