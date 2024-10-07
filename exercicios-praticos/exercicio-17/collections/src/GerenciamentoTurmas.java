import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenciamentoTurmas {
    private Map<String, List<String>> turmas;

    public GerenciamentoTurmas() {
        turmas = new HashMap<>();
    }

    public void adicionarProfessor(String turma, String professor) {
        turmas.putIfAbsent(turma, new ArrayList<>());
        turmas.get(turma).add(professor);
        System.out.println("Professor " + professor + " adicionado à turma " + turma);
    }

    public void listarProfessores(String turma) {
        List<String> professores = turmas.get(turma);
        if (professores != null) {
            System.out.println("Professores da turma " + turma + ":");
            for (String professor : professores) {
                System.out.println(professor);
            }
        } else {
            System.out.println("Turma não encontrada.");
        }
    }

    public static void main(String[] args) {
        GerenciamentoTurmas gerenciamento = new GerenciamentoTurmas();
        gerenciamento.adicionarProfessor("Matemática", "Professor A");
        gerenciamento.adicionarProfessor("Matemática", "Professor B");
        gerenciamento.adicionarProfessor("História", "Professor C");
        gerenciamento.listarProfessores("Matemática");
    }
}
