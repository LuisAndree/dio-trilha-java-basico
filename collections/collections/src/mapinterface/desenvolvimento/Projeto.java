package mapinterface.desenvolvimento;

import java.util.HashMap;
import java.util.Map;

public class Projeto {
    private String nome;
    private Map<Desenvolvedor, Tarefa> tarefasPorDesenvolvedor;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefasPorDesenvolvedor = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public Map<Desenvolvedor, Tarefa> getTarefasPorDesenvolvedor() {
        return tarefasPorDesenvolvedor;
    }

    public void adicionarTarefa(Desenvolvedor desenvolvedor, Tarefa tarefa) {
        tarefasPorDesenvolvedor.put(desenvolvedor, tarefa);
    }

    @Override
    public String toString() {
        return "Projeto: " + nome + " - Tarefas: " + tarefasPorDesenvolvedor.size();
    }
}
