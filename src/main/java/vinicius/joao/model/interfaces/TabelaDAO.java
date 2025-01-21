package vinicius.joao.model.interfaces;

public interface TabelaDAO {
    int getPosicao();
    void setPosicao(int posicao);

    String getTime();
    void setTime(String time);

    int getPontos();
    void setPontos(int pontos);

    int getJogos();
    void setJogos(int jogos);

    int getVitorias();
    void setVitorias(int vitorias);

    int getEmpates();
    void setEmpates(int empates);

    int getDerrotas();
    void setDerrotas(int derrotas);
}
