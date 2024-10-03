package livrearia;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro, int quantidade) {
        itens.add(new ItemCarrinho(livro, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho item : itens) {
            total += item.getLivro().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void esvaziarCarrinho() {
        itens.clear();
    }
}
