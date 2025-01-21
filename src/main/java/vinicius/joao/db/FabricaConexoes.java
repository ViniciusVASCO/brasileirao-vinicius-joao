package vinicius.joao.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexoes {

    private static int MAX_CONNECTIONS = 5;
    private final String URL_DB;
    private final String DB_NAME;
    private final String USER;
    private final String PASSWORD;
    private final String CON_STRING;

    private Connection[] conexoes;
    private static FabricaConexoes instance;

    private FabricaConexoes() {
        conexoes = new Connection[MAX_CONNECTIONS];

        URL_DB = "jdbc:mysql://localhost:3306/brasileirao";
        DB_NAME = "brasileirao";
        CON_STRING = URL_DB + "/" + DB_NAME;
        USER = "info22_vinicius";
        PASSWORD = "info22_vinicius";
    }

    public static FabricaConexoes getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new FabricaConexoes();
        return instance;
    }

    public Connection getConnection() throws SQLException {

        for (int i = 0; i < MAX_CONNECTIONS; i++) {
            if (instance.conexoes[i] == null || instance.conexoes[i].isClosed()) {
                instance.conexoes[i] = DriverManager.getConnection(CON_STRING, USER, PASSWORD);
                return instance.conexoes[i];
            }
        }
        throw new SQLException("Máximo de conexões");
    }
}
