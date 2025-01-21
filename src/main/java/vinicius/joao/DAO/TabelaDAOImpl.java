package vinicius.joao.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vinicius.joao.model.entities.Tabela;

public class TabelaDAOImpl {
    private Connection connection;

    public TabelaDAOImpl(Connection connection) {
        this.connection = connection;
    }

    public List<Tabela> listarTabela() throws SQLException {
        List<Tabela> tabela = new ArrayList<>();
        String sql = "SELECT * FROM Times_Brasileirao ORDER BY pontos DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tabela.add(new Tabela(rs.getInt("id"), rs.getString("nome"),
                        rs.getInt("pontos"), 0, 0, 0, 0));
            }
        }
        return tabela;
    }
}