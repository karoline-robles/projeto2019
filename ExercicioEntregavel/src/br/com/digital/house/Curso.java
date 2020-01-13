package br.com.digital.house;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private Professor professorAdjunt;
    private Professor professorTitu;
    private List<Aluno> listaAlunos = new ArrayList<>();
    private Integer quantidadeMax;
    private int quantidadeAtual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigoCurso;
    }

    public void setCodigo(int codigo) {
        this.codigoCurso = codigo;
    }

    public Professor getProfessorTitu() {
        return professorTitu;
    }

    public void setProfessorTitu(Professor professorTitu) {
        this.professorTitu = professorTitu;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public Integer getQuantidadeMax() {
        return quantidadeMax;
    }

    public void setQuantidadeMax(Integer quantidadeMax) {
        this.quantidadeMax = quantidadeMax;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public Curso(String nome, int codigoCurso, Integer quantidadeMax) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.professorAdjunt = professorAdjunt;
        this.professorTitu = professorTitu;
        this.listaAlunos = listaAlunos;
        this.quantidadeMax = quantidadeMax;
    }


    public Boolean adicAluno(Aluno umaAluno) {
        if (quantidadeMax < quantidadeAtual) {

            System.out.println("Aluno adicionado: ");
            listaAlunos.add(umaAluno);
            quantidadeMax++;
            return true;
        } else {
            System.out.println("Não há mais vagas: ");
            return false;
        }
    }

    public void removerAluno(Aluno umAluno) {
        listaAlunos.remove(umAluno);
        System.out.println("Aluno não existe!");
    }
}