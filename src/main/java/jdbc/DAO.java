package jdbc;

import java.sql.*;

public class DAO {
    private Connection connection;

    public int incluir(String sql, Object... params) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, params);

            if (stmt.executeUpdate() > 0) {
                ResultSet rs = stmt.getGeneratedKeys();
                if (rs.next()) return rs.getInt(1);
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {
        try {
            getConnection().close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            connection = null;
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] params) throws SQLException {
        for(Object param : params) {

            int indice = 1;

            if(param instanceof String) {
                stmt.setString(indice, (String) param);
            } else if(param instanceof Integer) {
                stmt.setInt(indice, (Integer) param);
            } else if (param instanceof Double) {
                stmt.setDouble(indice, (Double) param);
            } else if (param instanceof Boolean) {
                stmt.setBoolean(indice, (Boolean) param);
            }
            indice++;
        }
    }

    private Connection getConnection(){
        try {
            if(connection != null && !connection.isClosed()){
                return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        connection = FabricaConexao.getConexao();
        return connection;
    }
}
