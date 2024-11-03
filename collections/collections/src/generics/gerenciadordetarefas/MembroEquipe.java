package generics.gerenciadordetarefas;

import java.util.List;

public class MembroEquipe<T extends Tarefa> {
    private String nome;
    private List<T> tarefas;

    public MembroEquipe(String nome, List<T> tarefas) {
        this.nome = nome;
        this.tarefas = tarefas;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTarefa(T tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada para " + nome + ": " + tarefa.getDescricao());
    }

    public void listarTarefas() {
        System.out.println("Tarefas de " + nome + ":");
        tarefas.forEach(System.out::println);
    }
}
