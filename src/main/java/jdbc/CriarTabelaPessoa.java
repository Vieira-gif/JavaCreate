package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoa {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();

        String sql = """
            CREATE TABLE IF NOT EXISTS Pessoa (codigo INT AUTO_INCREMENT PRIMARY KEY NOT NULL, nome VARCHAR(80) NOT NULL)
""";
        
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Criado com sucesso!");
        conexao.close();
    }
}
