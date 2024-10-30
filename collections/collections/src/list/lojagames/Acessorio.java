package list.lojagames;

public class Acessorio extends Produto {
    private String tipo;

    public Acessorio(String nome, double preco, int quantidadeEmEstoque, String tipo) {
        super(nome, preco, quantidadeEmEstoque);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}
