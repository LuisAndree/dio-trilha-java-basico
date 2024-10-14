package list.equipe;

import java.util.List;

public class Gerente {
    private String nome;

    public Gerente(String nome) {
        this.nome = nome;
    }

    public void atribuirTarefas(Projeto projeto, List<Tarefa> tarefas) {
        for (Tarefa tarefa : tarefas) {
            projeto.adicionarTarefa(tarefa);
        }
    }

    public void mostrarDetalhesProjeto(Projeto projeto) {
        System.out.println("\nDetalhes do Projeto: " + projeto);
        projeto.listarTarefas();
        projeto.listarDesenvolvedores();
    }

    @Override
    public String toString() {
        return "Gerente: " + nome;
    }
}
