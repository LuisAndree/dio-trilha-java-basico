import java.util.HashSet;
import java.util.Set;

public class Estoque {
    private Set<String> produtos;

    public Estoque() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(String produto) {
        if (produtos.add(produto)) {
            System.out.println(produto + " adicionado ao estoque.");
        } else {
            System.out.println(produto + " já existe no estoque.");
        }
    }

    public void removerProduto(String produto) {
        if (produtos.remove(produto)) {
            System.out.println(produto + " removido do estoque.");
        } else {
            System.out.println(produto + " não encontrado no estoque.");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos em estoque:");
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarProduto("Teclado");
        estoque.adicionarProduto("Mouse");
        estoque.adicionarProduto("Teclado"); // Produto duplicado
        estoque.listarProdutos();
    }
}
