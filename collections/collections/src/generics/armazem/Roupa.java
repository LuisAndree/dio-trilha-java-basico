package generics.armazem;

public class Roupa implements Produto {
    private String nome;
    private double preco;
    private String tamanho;

    public Roupa(String nome, double preco, String tamanho) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        return "Roupa: " + nome + ", Tamanho: " + tamanho + ", Preço: R$" + preco;
    }
}
