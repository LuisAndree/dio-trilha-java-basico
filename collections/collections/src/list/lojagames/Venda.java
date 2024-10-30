package list.lojagames;

import java.time.LocalDate;

public class Venda {
    private Produto produto;
    private int quantidadeVendida;
    private LocalDate data;

    public Venda(Produto produto, int quantidadeVendida) {
        this.produto = produto;
        this.quantidadeVendida = quantidadeVendida;
        this.data = LocalDate.now();
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidadeVendida() {
        return quantidadeVendida;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Venda de " + quantidadeVendida + " unidade(s) de " + produto.getNome() + " em " + data;
    }
}
