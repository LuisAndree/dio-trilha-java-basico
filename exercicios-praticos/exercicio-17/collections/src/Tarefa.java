public class Tarefa {
    private String descricao;
    private int prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return descricao + " (Prioridade: " + prioridade + ")";
    }
}
