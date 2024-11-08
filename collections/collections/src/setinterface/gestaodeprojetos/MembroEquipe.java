package setinterface.gestaodeprojetos;

import java.util.Objects;

public class MembroEquipe {
    private String id;
    private String nome;
    private String cargo;

    public MembroEquipe(String id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MembroEquipe that = (MembroEquipe) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "MembroEquipe [ID: " + id + ", Nome: " + nome + ", Cargo: " + cargo + "]";
    }
}
