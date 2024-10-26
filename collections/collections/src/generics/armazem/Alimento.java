package generics.armazem;

public class Alimento implements Produto {
    private String nome;
    private double preco;
    private String validade;

    public Alimento(String nome, double preco, String validade) {
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getValidade() {
        return validade;
    }

    @Override
    public String toString() {
        return "Alimento: " + nome + ", Validade: " + validade + ", Preço: R$" + preco;
    }
}
