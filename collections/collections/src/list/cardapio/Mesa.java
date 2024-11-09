package list.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private int numero;
    private List<Pedido> pedidos;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void listarPedidos() {
        pedidos.forEach(System.out::println);
    }
}
