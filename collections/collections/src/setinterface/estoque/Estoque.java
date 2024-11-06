package setinterface.estoque;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Estoque {
    private Set<Produto> produtos;
    private Map<String, Integer> quantidadeProdutos;

    public Estoque() {
        this.produtos = new HashSet<>();
        this.quantidadeProdutos = new HashMap<>();
    }

    public boolean adicionarProduto(Produto produto, int quantidade) {
        if (produtos.add(produto)) {
            quantidadeProdutos.put(produto.getCodigo(), quantidade);
            return true;
        } else {
            atualizarQuantidade(produto.getCodigo(), quantidade);
            return false;
        }
    }

    public void atualizarQuantidade(String codigoProduto, int quantidade) {
        quantidadeProdutos.put(codigoProduto, quantidadeProdutos.getOrDefault(codigoProduto, 0) + quantidade);
    }

    public int getQuantidade(String codigoProduto) {
        return quantidadeProdutos.getOrDefault(codigoProduto, 0);
    }

    public Set<Produto> getProdutos() {
        return produtos;
    }
}
