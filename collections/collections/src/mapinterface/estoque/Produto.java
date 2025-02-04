package mapinterface.estoque;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;
    private Categoria categoria;
    private Fornecedor fornecedor;

    public Produto(String codigo, String nome, double preco, Categoria categoria, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.fornecedor = fornecedor;
    }

    public String getCodigo() {
        return codigo;
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

    @Override
    public String toString() {
        return "📦 Produto: " + nome +
                " | Código: " + codigo +
                " | Preço: R$" + preco +
                " | Categoria: " + categoria.getNome() +
                " | Fornecedor: " + fornecedor.getNome();
    }
}
