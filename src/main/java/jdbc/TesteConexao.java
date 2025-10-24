package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true&serverTimezone=UTC";
        final String user = "root";
        final String password = "root";

        Connection conexao = DriverManager.getConnection(url, user, password);
        System.out.println("Conectado com sucesso!");
        conexao.close();
    }
}
