package list.equipe;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String nome;
    private List<Tarefa> tarefas;
    private List<Desenvolvedor> desenvolvedores;

    public Projeto(String nome) {
        this.nome = nome;
        this.tarefas = new ArrayList<>();
        this.desenvolvedores = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void adicionarDesenvolvedor(Desenvolvedor dev) {
        desenvolvedores.add(dev);
    }

    public void listarTarefas() {
        System.out.println("\nTarefas no projeto " + nome + ":");
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    public void listarDesenvolvedores() {
        System.out.println("\nDesenvolvedores no projeto " + nome + ":");
        for (Desenvolvedor dev : desenvolvedores) {
            System.out.println(dev);
        }
    }
}
