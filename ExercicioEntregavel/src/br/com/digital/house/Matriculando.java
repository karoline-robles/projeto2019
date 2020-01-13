package br.com.digital.house;

import java.util.Date;

public class Matriculando {
    private Aluno aluno;
    private Curso curso;
    private Date data;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Matriculando(Aluno aluno, Curso curso, Date data) {
        this.aluno = aluno;
        this.curso = curso;
        this.data = data;


    }
}
