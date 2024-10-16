package setinterface.biblioteca;

import java.util.Objects;

public class Membro {
    private String nome;
    private int id;

    public Membro(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membro membro = (Membro) o;
        return id == membro.id && Objects.equals(nome, membro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }

    @Override
    public String toString() {
        return "Membro: " + nome + " (ID: " + id + ")";
    }
}
