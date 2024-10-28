package generics.cardapiomenu;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemMenu> itens;
    private boolean finalizado;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.finalizado = false;
    }

    public void adicionarItem(ItemMenu item) {
        if (!finalizado) {
            itens.add(item);
        } else {
            System.out.println("Não é possível adicionar itens a um pedido finalizado.");
        }
    }

    public void finalizarPedido() {
        finalizado = true;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemMenu::getPreco).sum();
    }

    @Override
    public String toString() {
        return "Pedido{" + "itens=" + itens + ", total=" + calcularTotal() + '}';
    }
}
