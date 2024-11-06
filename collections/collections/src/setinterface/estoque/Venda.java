package setinterface.estoque;

public class Venda {
    private Produto produto;
    private int quantidade;

    public Venda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularTotal() {
        return quantidade * produto.getPreco();
    }

    @Override
    public String toString() {
        return "Venda [Produto: " + produto.getNome() + ", Quantidade: " + quantidade + ", Total: R$" + calcularTotal() + "]";
    }
}
