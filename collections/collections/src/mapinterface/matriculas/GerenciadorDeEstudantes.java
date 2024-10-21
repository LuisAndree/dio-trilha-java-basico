package mapinterface.matriculas;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeEstudantes {
    private Map<String, Estudante> estudantes;

    public GerenciadorDeEstudantes() {
        this.estudantes = new HashMap<>();
    }

    public void adicionarEstudante(String matricula, Estudante estudante) {
        if (estudantes.containsKey(matricula)) {
            System.out.println("Matrícula já existente: " + matricula);
        } else {
            estudantes.put(matricula, estudante);
            System.out.println("Estudante adicionado: " + estudante.getNome());
        }
    }

    public void removerEstudante(String matricula) {
        Estudante removido = estudantes.remove(matricula);
        if (removido != null) {
            System.out.println("Estudante removido: " + removido.getNome());
        } else {
            System.out.println("Estudante com matrícula " + matricula + " não encontrado.");
        }
    }

    public void listarEstudantes() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
        } else {
            System.out.println("Estudantes cadastrados:");
            for (Map.Entry<String, Estudante> entry : estudantes.entrySet()) {
                System.out.println("Matrícula: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
