package generics.armazem;

public class Eletronico implements Produto {
    private String nome;
    private double preco;
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Eletronico: " + nome + ", Marca: " + marca + ", Preço: R$" + preco;
    }
}
