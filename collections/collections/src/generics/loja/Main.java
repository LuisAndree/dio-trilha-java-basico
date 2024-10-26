package generics.loja;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.00);
        Produto produto2 = new Produto("Teclado", 150.00);
        Produto produto3 = new Produto("Mouse", 50.00);

        Cliente cliente = new Cliente("João", "joao@example.com");

        Carrinho<Produto> carrinho = new Carrinho<>();
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);
        carrinho.listarItens();

        Loja<Produto> loja = new Loja<>();
        loja.adicionarAoEstoque(1, produto1);
        loja.adicionarAoEstoque(2, produto2);
        loja.adicionarAoEstoque(3, produto3);
        loja.listarEstoque();

        List<Produto> produtosPedido = new ArrayList<>();
        produtosPedido.add(produto1);
        produtosPedido.add(produto3);

        Pedido pedido = new Pedido(cliente, produtosPedido);
        pedido.mostrarDetalhesPedido();
    }
}
