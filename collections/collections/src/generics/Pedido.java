package generics;

import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public void mostrarDetalhesPedido() {
        System.out.println("\nPedido do Cliente: " + cliente.getNome());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
