package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastrarJogosDAOImpl {
    private Connection connection;

    public CadastrarJogosDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public void cadastrarJogo(int timeCasa, int timeVisitante, int golsCasa, int golsVisitante, Date dataJogo) throws SQLException {
        String sql = "INSERT INTO Jogos_Brasileirao (time_casa, time_visitante, gols_casa, gols_visitante, data_jogo) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, timeCasa);
            stmt.setInt(2, timeVisitante);
            stmt.setInt(3, golsCasa);
            stmt.setInt(4, golsVisitante);
            stmt.setDate(5, dataJogo);
            stmt.executeUpdate();
        }
    }
}
