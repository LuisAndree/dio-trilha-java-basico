package mapinterface.inventario;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeInventario {
    private Map<String, Produto> inventario;

    public GerenciadorDeInventario() {
        this.inventario = new HashMap<>();
    }

    public void adicionarProduto(String codigo, Produto produto) {
        if (inventario.containsKey(codigo)) {
            System.out.println("Código de produto já cadastrado: " + codigo);
        } else {
            inventario.put(codigo, produto);
            System.out.println("Produto adicionado: " + produto.getNome());
        }
    }

    public void atualizarQuantidade(String codigo, int novaQuantidade) {
        Produto produto = inventario.get(codigo);
        if (produto != null) {
            produto.getEstoque().adicionar(novaQuantidade);
            System.out.println("Quantidade atualizada para o produto: " + produto.getNome());
        } else {
            System.out.println("Produto com código " + codigo + " não encontrado.");
        }
    }

    public void removerProduto(String codigo) {
        Produto removido = inventario.remove(codigo);
        if (removido != null) {
            System.out.println("Produto removido: " + removido.getNome());
        } else {
            System.out.println("Produto com código " + codigo + " não encontrado.");
        }
    }

    public void listarProdutos() {
        if (inventario.isEmpty()) {
            System.out.println("Inventário vazio.");
        } else {
            System.out.println("Produtos no inventário:");
            for (Map.Entry<String, Produto> entry : inventario.entrySet()) {
                System.out.println("Código: " + entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}

