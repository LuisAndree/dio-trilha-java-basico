import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nome;
    private List<String> estudantes;

    public Turma(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public void adicionarEstudante(String nomeEstudante) {
        estudantes.add(nomeEstudante);
    }

    public void removerEstudante(String nomeEstudante) {
        estudantes.remove(nomeEstudante);
    }

    public List<String> getEstudantes() {
        return estudantes;
    }

    public void listarEstudantes() {
        System.out.println("Estudantes na turma " + nome + ":");
        for (String estudante : estudantes) {
            System.out.println(estudante);
        }
    }

    public static void main(String[] args) {
        Turma turma = new Turma("Matemática");
        turma.adicionarEstudante("Luis");
        turma.adicionarEstudante("André");
        turma.listarEstudantes();
    }
}
