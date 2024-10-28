package generics.cardapiomenu;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Mesa> mesas;
    private Menu menu;

    public Restaurante(Menu menu) {
        this.menu = menu;
        this.mesas = new ArrayList<>();
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public Mesa buscarMesa(int numero) {
        for (Mesa mesa : mesas) {
            if (mesa.getNumero() == numero) {
                return mesa;
            }
        }
        return null;
    }

    public Menu getMenu() {
        return menu;
    }
}
