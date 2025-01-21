module vinicius.joao {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens vinicius.joao to javafx.fxml;
    exports vinicius.joao;
}
