package generics.biblioteca;

public class Funcionario {
    private String nome;
    private String id;

    public Funcionario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " (ID: " + id + ")";
    }
}
