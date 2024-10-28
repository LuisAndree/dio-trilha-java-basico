package generics.cardapiomenu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<ItemMenu> itens;

    public Menu() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public List<ItemMenu> listarItens() {
        return itens;
    }
}
