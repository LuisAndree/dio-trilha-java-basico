package setinterface.cursos;

import java.util.HashSet;
import java.util.Set;

public class Plataforma {
    private String nome;
    private Set<Curso> cursos;

    public Plataforma(String nome) {
        this.nome = nome;
        this.cursos = new HashSet<>();
    }

    public void adicionarCurso(Curso curso) {
        if (cursos.add(curso)) {
            System.out.println("Curso adicionado: " + curso.getNome());
        } else {
            System.out.println("Curso já existe na plataforma: " + curso.getNome());
        }
    }

    public void listarCursos() {
        System.out.println("\nCursos disponíveis na plataforma " + nome + ":");
        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }
    }
}
