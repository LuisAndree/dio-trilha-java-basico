package generics.gerenciadordetarefas;

public class TarefaGerencial extends Tarefa {
    private String prazo;

    public TarefaGerencial(String descricao, int prioridade, String prazo) {
        super(descricao, prioridade);
        this.prazo = prazo;
    }

    public String getPrazo() {
        return prazo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prazo: " + prazo;
    }
}
