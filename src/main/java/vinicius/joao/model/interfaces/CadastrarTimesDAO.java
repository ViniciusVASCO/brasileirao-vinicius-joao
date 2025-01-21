package vinicius.joao.model.interfaces;

public interface CadastrarTimesDAO {
    String getNomeTime();
    void setNomeTime(String nomeTime);

    String getAbreviacao();
    void setAbreviacao(String abreviacao);

    int getQuantidadeJogadores();
    void setQuantidadeJogadores(int quantidadeJogadores);

    String getNomeEstadio();
    void setNomeEstadio(String nomeEstadio);

    String getDataFundacao();
    void setDataFundacao(String dataFundacao);

    String getLocalOrigem();
    void setLocalOrigem(String localOrigem);
}