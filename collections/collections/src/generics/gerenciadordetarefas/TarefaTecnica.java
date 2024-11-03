package generics.gerenciadordetarefas;

public class TarefaTecnica extends Tarefa {
    private String complexidade;

    public TarefaTecnica(String descricao, int prioridade, String complexidade) {
        super(descricao, prioridade);
        this.complexidade = complexidade;
    }

    public String getComplexidade() {
        return complexidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", Complexidade: " + complexidade;
    }
}
