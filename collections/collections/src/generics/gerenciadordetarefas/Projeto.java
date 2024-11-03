package generics.gerenciadordetarefas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Projeto {
    private String nome;
    private Map<MembroEquipe<? extends Tarefa>, List<? extends Tarefa>> membrosETarefas = new HashMap<>();

    public Projeto(String nome) {
        this.nome = nome;
    }

    public void adicionarMembro(MembroEquipe<? extends Tarefa> membro, List<? extends Tarefa> tarefas) {
        membrosETarefas.put(membro, tarefas);
        System.out.println("Membro adicionado ao projeto: " + membro.getNome());
    }

    public void listarMembrosETarefas() {
        System.out.println("Projeto: " + nome);
        for (Map.Entry<MembroEquipe<? extends Tarefa>, List<? extends Tarefa>> entrada : membrosETarefas.entrySet()) {
            System.out.println("Membro: " + entrada.getKey().getNome());
            entrada.getValue().forEach(System.out::println);
        }
    }
}
