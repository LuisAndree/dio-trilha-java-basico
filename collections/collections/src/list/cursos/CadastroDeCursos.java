package list.cursos;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeCursos {
    private List<Curso> cursos = new ArrayList<>();

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo)) {
                return curso;
            }
        }
        return null;
    }

    public void listarCursos() {
        cursos.forEach(System.out::println);
    }
}
