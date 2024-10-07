import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgendaTarefas {
    private List<Tarefa> tarefas;

    public AgendaTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao, int prioridade) {
        Tarefa tarefa = new Tarefa(descricao, prioridade);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + tarefa);
    }

    public void listarTarefas() {
        Collections.sort(tarefas, Comparator.comparingInt(Tarefa::getPrioridade));
        System.out.println("Tarefas:");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public static void main(String[] args) {
        AgendaTarefas agenda = new AgendaTarefas();
        agenda.adicionarTarefa("Estudar Java", 2);
        agenda.adicionarTarefa("Fazer exercícios", 1);
        agenda.adicionarTarefa("Assistir a uma palestra", 3);
        agenda.listarTarefas();
    }
}
