package vinicius.joao.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.layout.AnchorPane;

public class TelaBrasileiraoController {

    @FXML
    private Tab tabTabela;
    @FXML
    private Tab tabTimesCadastrados;
    @FXML
    private Tab tabArtilheiros;
    @FXML
    private Tab tabCadastroTimes;
    @FXML
    private Tab tabCadastroJogos;

    @FXML
    public void initialize() {
        tabTabela.setOnSelectionChanged(event -> {
            if (tabTabela.isSelected() && tabTabela.getContent() == null) {
                carregarConteudoTab(tabTabela, "Tabela.fxml");
            }
        });

        tabTimesCadastrados.setOnSelectionChanged(event -> {
            if (tabTimesCadastrados.isSelected() && tabTimesCadastrados.getContent() == null) {
                carregarConteudoTab(tabTimesCadastrados, "TimesCadastrados.fxml");
            }
        });

        tabArtilheiros.setOnSelectionChanged(event -> {
            if (tabArtilheiros.isSelected() && tabArtilheiros.getContent() == null) {
                carregarConteudoTab(tabArtilheiros, "Artilheiros.fxml");
            }
        });

        tabCadastroTimes.setOnSelectionChanged(event -> {
            if (tabCadastroTimes.isSelected() && tabCadastroTimes.getContent() == null) {
                carregarConteudoTab(tabCadastroTimes, "CadastroTimes.fxml");
            }
        });

        tabCadastroJogos.setOnSelectionChanged(event -> {
            if (tabCadastroJogos.isSelected() && tabCadastroJogos.getContent() == null) {
                carregarConteudoTab(tabCadastroJogos, "CadastroTimes.fxml");
            }
        });
    }

    private void carregarConteudoTab(Tab tab, String fxmlPath) {
        try {
            AnchorPane content = FXMLLoader.load(getClass().getResource(fxmlPath));
            tab.setContent(content);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
