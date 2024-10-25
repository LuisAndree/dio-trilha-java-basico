package mapinterface.desenvolvimento;

public class Tarefa {
    private String nome;
    private String descricao;
    private Status status;

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.status = Status.PENDENTE;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Status getStatus() {
        return status;
    }

    public void atualizarStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + " - Status: " + status;
    }
}
