package br.com.digital.house;

public class ProfessorTitular extends Professor {
    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, int tempoEmCasa, int codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoEmCasa, codigoProfessor);
        this.especialidade = especialidade;
    }
}
