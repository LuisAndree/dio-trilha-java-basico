package setinterface.gestaodeprojetos;

import java.util.HashSet;
import java.util.Set;

public class Modulo {
    private String nome;
    private Set<Tarefa> tarefas;

    public Modulo(String nome) {
        this.nome = nome;
        this.tarefas = new HashSet<>();
    }

    public String getNome() {
        return nome;
    }

    public Set<Tarefa> getTarefas() {
        return tarefas;
    }

    public boolean adicionarTarefa(Tarefa tarefa) {
        return tarefas.add(tarefa);
    }

    @Override
    public String toString() {
        return "Modulo [Nome: " + nome + "]";
    }
}
