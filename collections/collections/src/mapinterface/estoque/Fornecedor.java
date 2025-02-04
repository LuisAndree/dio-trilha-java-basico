package mapinterface.estoque;

public class Fornecedor {
    private String nome;
    private String contato;

    public Fornecedor(String nome, String contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return nome + " (Contato: " + contato + ")";
    }
}
