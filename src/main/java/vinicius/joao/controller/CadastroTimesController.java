package vinicius.joao.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class CadastroTimesController {
    @FXML
    private TextField quantidadeJogadoresField;

    @FXML
    private Tab tabTabela;

    @FXML
    private TextField horarioField;

    @FXML
    private Tab tabCadastroTimes;

    @FXML
    private TextField timesJogaramField;

    @FXML
    private TextField nomeEstadioField;

    @FXML
    private TextField quantidadeJogadoresCadastroField;

    @FXML
    private TextField posicaoField;

    @FXML
    private TextField nomeTimeField;

    @FXML
    private TextField estadioField;

    @FXML
    private Button cadastrarJogoButton;

    @FXML
    private TextField pesquisarTimeField;

    @FXML
    private Button cadastrarTimeButton;

    @FXML
    private Tab tabTimesCadastrados;

    @FXML
    private DatePicker dataFundacaoPicker;

    @FXML
    private Tab tabCadastroJogos;

    @FXML
    private TextField pontuacaoField;

    @FXML
    private DatePicker dataPicker;

    @FXML
    private Tab tabArtilheiros;


    @FXML
    void onTabelaTabSelected(ActionEvent event) {
        System.out.println("Aba Tabela selecionada.");
    }

    @FXML
    void onTimesCadastradosTabSelected(ActionEvent event) {

        System.out.println("Aba Times Cadastrados selecionada.");
    }


    @FXML
    void onPesquisarTime(ActionEvent event) {
        String time = pesquisarTimeField.getText();
        System.out.println("Pesquisando o time: " + time);
    }

    @FXML
    void onArtilheirosTabSelected(ActionEvent event) {
        System.out.println("Aba Artilheiros selecionada.");
    }

    @FXML
    void onCadastrarTime(ActionEvent event) {
        String nomeTime = nomeTimeField.getText();
        String estadio = nomeEstadioField.getText();
        String quantidadeJogadores = quantidadeJogadoresCadastroField.getText();
        String dataFundacao = dataFundacaoPicker.getValue().toString();
        System.out.println("Cadastrando time: " + nomeTime + ", Estádio: " + estadio + 
                           ", Jogadores: " + quantidadeJogadores + ", Data de Fundação: " + dataFundacao);
    }

    @FXML
    void onCadastrarQuantidadeJogadores(ActionEvent event) {
        String quantidade = quantidadeJogadoresField.getText();
        System.out.println("Quantidade de jogadores cadastrada: " + quantidade);
    }

    @FXML
    void onCadastrarNomeEstadio(ActionEvent event) {
        String estadio = nomeEstadioField.getText();
        System.out.println("Nome do estádio cadastrado: " + estadio);
    }

    @FXML
    void onCadastrarDataFundacao(ActionEvent event) {
        String dataFundacao = dataFundacaoPicker.getValue().toString();
        System.out.println("Data de fundação cadastrada: " + dataFundacao);
    }

    @FXML
    void onCadastrarJogo(ActionEvent event) {
        String horario = horarioField.getText();
        String estadio = estadioField.getText();
        String pontuacao = pontuacaoField.getText();
        String data = dataPicker.getValue().toString();
        System.out.println("Jogo cadastrado: " + horario + ", " + estadio + ", Pontuação: " + pontuacao + ", Data: " + data);
    }

    @FXML
    void onPosicaoSelecionada(ActionEvent event) {
        String posicao = posicaoField.getText();
        System.out.println("Posição do jogador: " + posicao);
    }

    @FXML
    void onCadastrarPontuacao(ActionEvent event) {
        String pontuacao = pontuacaoField.getText();
        System.out.println("Pontuação cadastrada: " + pontuacao);
    }

    @FXML
    void onSelecionarData(ActionEvent event) {
        String data = dataPicker.getValue().toString();
        System.out.println("Data selecionada: " + data);
    }
}


