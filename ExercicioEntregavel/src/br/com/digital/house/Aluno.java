package br.com.digital.house;

public class Aluno {
    public String nome;
    private String sobrenome;
    private Integer codigoAluno;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(Integer codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public Aluno(String nome, String sobrenome, Integer ra) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoAluno = codigoAluno;

    }
}

