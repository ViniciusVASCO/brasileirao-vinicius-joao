module vinicius.joao {
    requires javafx.controls;
    requires javafx.fxml;

    opens vinicius.joao to javafx.fxml;
    exports vinicius.joao;
}
