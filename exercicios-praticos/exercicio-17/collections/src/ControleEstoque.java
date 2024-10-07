import java.util.LinkedList;

public class ControleEstoque {
    private LinkedList<String> produtos;

    public ControleEstoque() {
        produtos = new LinkedList<>();
    }

    public void adicionarProduto(String produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado: " + produto);
    }

    public void removerProduto() {
        if (!produtos.isEmpty()) {
            String produtoRemovido = produtos.removeFirst();
            System.out.println("Produto removido: " + produtoRemovido);
        } else {
            System.out.println("Estoque vazio.");
        }
    }

    public void listarProdutos() {
        System.out.println("Produtos em estoque:");
        for (String produto : produtos) {
            System.out.println(produto);
        }
    }

    public static void main(String[] args) {
        ControleEstoque estoque = new ControleEstoque();
        estoque.adicionarProduto("Teclado");
        estoque.adicionarProduto("Monitor");
        estoque.listarProdutos();
        estoque.removerProduto();
        estoque.listarProdutos();
    }
}
