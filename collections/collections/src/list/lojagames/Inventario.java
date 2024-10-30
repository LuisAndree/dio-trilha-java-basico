package list.lojagames;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Produto> produtos;

    public Inventario() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public Produto buscarProduto(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public void listarProdutos() {
        produtos.forEach(System.out::println);
    }
}
