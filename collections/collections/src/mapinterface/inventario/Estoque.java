package mapinterface.inventario;

public class Estoque {
    private int quantidade;

    public Estoque(int quantidadeInicial) {
        this.quantidade = quantidadeInicial;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionar(int quantidade) {
        this.quantidade += quantidade;
    }

    public void remover(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente no estoque.");
        }
    }

    @Override
    public String toString() {
        return "Quantidade em estoque: " + quantidade;
    }
}
