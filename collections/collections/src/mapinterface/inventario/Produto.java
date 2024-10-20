package mapinterface.inventario;

public class Produto {
    private String nome;
    private double preco;
    private Categoria categoria;
    private Fornecedor fornecedor;
    private Estoque estoque;

    public Produto(String nome, double preco, Categoria categoria, Fornecedor fornecedor, Estoque estoque) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    @Override
    public String toString() {
        return nome + " - Preço: R$ " + preco + "\n" +
                "Categoria: " + categoria + "\n" +
                "Fornecedor: " + fornecedor + "\n" +
                estoque;
    }
}

