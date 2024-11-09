package list.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<ItemCardapio> itens;

    public Cardapio() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCardapio item) {
        itens.add(item);
    }

    public List<ItemCardapio> getItens() {
        return itens;
    }

    public void listarItens() {
        for (ItemCardapio item : itens) {
            System.out.println(item);
        }
    }
}
