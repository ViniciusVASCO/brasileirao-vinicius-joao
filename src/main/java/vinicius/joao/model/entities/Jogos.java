package vinicius.joao.model.entities;

public class Jogos {
    private String timeMandante;
    private String timeVisitante;
    private int placarMandante;
    private int placarVisitante;
    private String estadio;
    private String horario;
    private String data;

    public Jogos(String timeMandante, String timeVisitante, int placarMandante, int placarVisitante, String estadio, String horario, String data) {
        this.timeMandante = timeMandante;
        this.timeVisitante = timeVisitante;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
        this.estadio = estadio;
        this.horario = horario;
        this.data = data;
    }

    public String getTimeMandante()
    { return timeMandante; }

    public void setTimeMandante(String timeMandante)
    { this.timeMandante = timeMandante; }

    public String getTimeVisitante()
    { return timeVisitante; }

    public void setTimeVisitante(String timeVisitante)
     { this.timeVisitante = timeVisitante; }

    public int getPlacarMandante()
     { return placarMandante; }

    public void setPlacarMandante(int placarMandante)
     { this.placarMandante = placarMandante; }

    public int getPlacarVisitante()
     { return placarVisitante; }

    public void setPlacarVisitante(int placarVisitante)
     { this.placarVisitante = placarVisitante; }

    public String getEstadio()
     { return estadio; }

    public void setEstadio(String estadio)
     { this.estadio = estadio; }

    public String getHorario()
    { return horario; }

    public void setHorario(String horario
    ) { this.horario = horario; }

    public String getData()
     { return data; }

    public void setData(String data)
     { this.data = data; }
}
