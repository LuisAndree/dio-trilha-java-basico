package list.cursos;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeAlunos {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarAlunoPorMatricula(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    public void listarAlunos() {
        alunos.forEach(System.out::println);
    }
}
