package br.com.digital.house;

public class Professor {
    private String nome;
    private String sobrenome;
    private Integer tempoEmCasa;
    private int codigoProfessor;

    public String getNomeProfessor() {
        return nome;
    }

    public void setNomeProfessor(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoProfessor() {
        return codigoProfessor;
    }

    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }

    public Professor(String nome, String sobrenome, int tempoEmCasa, int codigoProfessor) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tempoEmCasa = tempoEmCasa;
        this.codigoProfessor = codigoProfessor;
    }


}
