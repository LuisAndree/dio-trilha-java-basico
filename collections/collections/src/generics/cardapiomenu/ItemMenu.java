package generics.cardapiomenu;

public class ItemMenu {
    private String nome;
    private double preco;
    private String tipo;

    public ItemMenu(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo + ": " + nome + " - R$" + preco;
    }
}
