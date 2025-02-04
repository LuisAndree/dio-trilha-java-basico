package mapinterface.estoque;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<String, Produto> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

    public Produto buscarProduto(String codigo) {
        return produtos.get(codigo);
    }

    public void removerProduto(String codigo) {
        produtos.remove(codigo);
    }

    public void listarProdutos() {
        System.out.println("\n📦 Produtos no Estoque:");
        for (Produto produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}
