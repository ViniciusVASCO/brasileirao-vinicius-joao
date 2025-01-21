package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarTimesDAOImpl {
    private Connection connection;

    public CadastrarTimesDAOImpl(Connection connection) {
        this.connection = connection;
    }
    public void cadastrarTime(String nome, String estado, String cidade) throws SQLException {
        String sql = "INSERT INTO Times_Brasileirao (nome, estado, cidade) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, estado);
            stmt.setString(3, cidade);
            stmt.executeUpdate();
        }
    }
}
