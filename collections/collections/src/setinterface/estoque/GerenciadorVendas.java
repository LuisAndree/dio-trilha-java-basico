package setinterface.estoque;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorVendas {
    private Estoque estoque;
    private List<Venda> vendas;

    public GerenciadorVendas(Estoque estoque) {
        this.estoque = estoque;
        this.vendas = new ArrayList<>();
    }

    public boolean realizarVenda(String codigoProduto, int quantidade) {
        Produto produto = estoque.getProdutos().stream()
                .filter(p -> p.getCodigo().equals(codigoProduto))
                .findFirst()
                .orElse(null);

        if (produto != null && estoque.getQuantidade(codigoProduto) >= quantidade) {
            vendas.add(new Venda(produto, quantidade));
            estoque.atualizarQuantidade(codigoProduto, -quantidade);
            System.out.println("Venda realizada: " + produto.getNome());
            return true;
        }
        System.out.println("Venda não realizada. Produto fora de estoque ou quantidade insuficiente.");
        return false;
    }

    public List<Venda> getVendas() {
        return vendas;
    }
}
