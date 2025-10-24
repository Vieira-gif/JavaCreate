package jdbc;

import java.net.ConnectException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Conectado com sucesso!");

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        conexao.close();
    }
}
