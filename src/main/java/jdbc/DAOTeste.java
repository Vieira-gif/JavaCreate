package jdbc;

import java.sql.SQLException;

public class DAOTeste {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DAO dao = new DAO();

        String sql = "INSERT INTO PESSOA (nome) VALUES (?)";

        dao.incluir(sql,  "Fulano da Silva");
        dao.incluir(sql, "Djalma");
        dao.incluir(sql, "Ciclano");
        dao.incluir(sql, "Beltrano");

        dao.close();
    }
}
