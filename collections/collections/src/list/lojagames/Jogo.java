package list.lojagames;

public class Jogo extends Produto {
    private String plataforma;

    public Jogo(String nome, double preco, int quantidadeEmEstoque, String plataforma) {
        super(nome, preco, quantidadeEmEstoque);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + " | Plataforma: " + plataforma;
    }
}
