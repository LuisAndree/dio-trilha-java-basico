package list.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemCardapio> itens;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.total = 0.0;
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
        total += item.getPreco();
    }

    public double getTotal() {
        return total;
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        return "Pedido do " + cliente.getNome() + ": Total = R$" + total;
    }
}
