package vinicius.joao.model.entities;

public class Artilheiros {
    private String nomeJogador;
    private int gols;
    private int jogos;

    public Artilheiros(String nomeJogador, int gols, int jogos) {
        this.nomeJogador = nomeJogador;
        this.gols = gols;
        this.jogos = jogos;
    }

    public String getNomeJogador()
    { return nomeJogador; }

    public void setNomeJogador(String nomeJogador)
    { this.nomeJogador = nomeJogador; }

    public int getGols()
     { return gols; }

    public void setGols(int gols)
     { this.gols = gols; }

    public int getJogos()
    { return jogos; }

    public void setJogos(int jogos)
     { this.jogos = jogos; }
}