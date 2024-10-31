package list.cursos;

import java.util.ArrayList;
import java.util.List;

public class RegistroDeMatriculas {
    private List<Matricula> matriculas = new ArrayList<>();

    public void registrarMatricula(Aluno aluno, Curso curso) {
        matriculas.add(new Matricula(aluno, curso));
    }

    public void listarMatriculas() {
        matriculas.forEach(System.out::println);
    }
}
