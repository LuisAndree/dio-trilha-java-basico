package generics.armazem;

import java.util.ArrayList;
import java.util.List;

public class Inventario<T extends Produto> {
    private List<T> produtos;

    public Inventario() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        produtos.add(produto);
    }

    public void removerProduto(T produto) {
        produtos.remove(produto);
    }

    public List<T> listarProdutos() {
        return produtos;
    }

    public T buscarProdutoPorNome(String nome) {
        for (T produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }
}
