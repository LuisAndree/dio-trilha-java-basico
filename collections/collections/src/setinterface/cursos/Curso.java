package setinterface.cursos;

import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nome;
    private Set<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.alunos = new HashSet<>();
    }

    public void adicionarAluno(Aluno aluno) {
        if (alunos.add(aluno)) {
            System.out.println("Aluno matriculado: " + aluno.getNome());
        } else {
            System.out.println("Aluno já está matriculado: " + aluno.getNome());
        }
    }

    public void listarAlunos() {
        System.out.println("\nAlunos matriculados no curso " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }

    public String getNome() {
        return nome;
    }
}
