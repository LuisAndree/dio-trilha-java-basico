package setinterface.gestaodeprojetos;

public class Tarefa {
    private String titulo;
    private String descricao;
    private MembroEquipe membroResponsavel;

    public Tarefa(String titulo, String descricao, MembroEquipe membroResponsavel) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.membroResponsavel = membroResponsavel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public MembroEquipe getMembroResponsavel() {
        return membroResponsavel;
    }

    @Override
    public String toString() {
        return "Tarefa [Título: " + titulo + ", Descrição: " + descricao + ", Responsável: " + membroResponsavel.getNome() + "]";
    }
}
