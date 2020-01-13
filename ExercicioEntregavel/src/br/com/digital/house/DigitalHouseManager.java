package br.com.digital.house;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaAlunos = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();

    public void registrar(String nome, int codigoCurso, Integer quantidadeMax) {
        Curso curso = new Curso(nome, codigoCurso, quantidadeMax);
        listaCurso.add(curso);
    }
    public void excluirCurso(Integer codigoCurso) {
        Curso cursoEncontrado = null;
        for (Curso cursoProcurado : listaCurso) {
            if (cursoProcurado.getCodigoCurso().equals(codigoCurso)){
                cursoEncontrado = cursoProcurado;
                listaCurso.remove(cursoEncontrado);
                System.out.println("Curso removido");
        }else {
                System.out.println("Curso não encontrado");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int tempodeCasa, Integer codigoProfessor, int horasDeMentoria){
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, tempodeCasa, codigoProfessor, horasDeMentoria );
    listaProfessor.add(professorAdjunto);
}
    public void registrarProfessorTitular(String nome, String sobrenome, int tempoDeCasa, Integer codigoProfessor, String especialidade){
        ProfessorTitular professorTitular = new ProfessorTitular (nome, sobrenome, tempoDeCasa, codigoProfessor, especialidade);
        listaProfessor.add(professorTitular);
    }
    public void excluirProfessor(Integer codigoProfessor) {
        Professor professorEncontrado = null;
        for (Professor professorProcurado : listaProfessor) {
            if (listaProfessor.getCodigoProfessor().equals(codigoProfessor)) {
                professorEncontrado = professorProcurado;
                listaCurso.remove(professorEncontrado);
                System.out.println("Professor removido");
            } else {
                System.out.println("Professor não encontrado");
            }
        }
    }
    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){
        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaAlunos.add(aluno);
    }

        }