package vinicius.joao.model.interfaces;

public interface ArtilheirosDAO {
    String getNomeJogador();
    void setNomeJogador(String nomeJogador);

    int getGols();
    void setGols(int gols);

    int getJogos();
    void setJogos(int jogos);
}