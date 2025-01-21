package vinicius.joao.model.interfaces;

public interface CadastrarJogosDAO {
    String getTimeMandante();
    void setTimeMandante(String timeMandante);

    String getTimeVisitante();
    void setTimeVisitante(String timeVisitante);

    int getPlacarMandante();
    void setPlacarMandante(int placarMandante);

    int getPlacarVisitante();
    void setPlacarVisitante(int placarVisitante);

    String getEstadio();
    void setEstadio(String estadio);

    String getHorario();
    void setHorario(String horario);

    String getData();
    void setData(String data);
}