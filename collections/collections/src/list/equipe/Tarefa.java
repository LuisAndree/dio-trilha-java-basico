package list.equipe;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    public boolean isConcluida() {
        return concluida;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao + " (Concluída: " + (concluida ? "Sim" : "Não") + ")";
    }
}
