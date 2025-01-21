package vinicius.joao.model.entities;

public class Tabela {
    private int posicao;
    private String time;
    private int pontos;
    private int jogos;
    private int vitorias;
    private int empates;
    private int derrotas;

    public Tabela(int posicao, String time, int pontos, int jogos, int vitorias, int empates, int derrotas) {
        this.posicao = posicao;
        this.time = time;
        this.pontos = pontos;
        this.jogos = jogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }

    public Tabela(int aInt, String string, int aInt0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getPosicao()
     { return posicao; }

    public void setPosicao(int posicao)
     { this.posicao = posicao; }

    public String getTime()
     { return time; }

    public void setTime(String time)
     { this.time = time; }

    public int getPontos()
     { return pontos; }

    public void setPontos(int pontos)
     { this.pontos = pontos; }

    public int getJogos()
     { return jogos; }

    public void setJogos(int jogos)
     { this.jogos = jogos; }

    public int getVitorias()
     { return vitorias; }

    public void setVitorias(int vitorias)
     { this.vitorias = vitorias; }

    public int getEmpates()
    { return empates; }

    public void setEmpates(int empates)
     { this.empates = empates; }

    public int getDerrotas()
     { return derrotas; }

    public void setDerrotas(int derrotas) { this.derrotas = derrotas; }
}