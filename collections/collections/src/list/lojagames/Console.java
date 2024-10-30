package list.lojagames;

public class Console extends Produto {
    private String fabricante;

    public Console(String nome, double preco, int quantidadeEmEstoque, String fabricante) {
        super(nome, preco, quantidadeEmEstoque);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    @Override
    public String toString() {
        return super.toString() + " | Fabricante: " + fabricante;
    }
}
