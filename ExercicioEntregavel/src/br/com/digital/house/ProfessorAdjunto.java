package br.com.digital.house;

public class ProfessorAdjunto extends Professor {
    private int horasDeMonitoria;

    public int getHorasDeMonitoria() {
        return horasDeMonitoria;
    }

    public void setHorasDeMonitoria(int horasDeMonitoria) {
        this.horasDeMonitoria = horasDeMonitoria;
    }

    public ProfessorAdjunto(String nome, String sobrenome, int tempoEmCasa, Integer codigoProfessor, int horasDeMentoria) {
        super(nome, sobrenome, tempoEmCasa, codigoProfessor);
        this.horasDeMonitoria = horasDeMentoria;
    }
}

