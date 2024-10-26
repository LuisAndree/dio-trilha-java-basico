package generics.loja;

import java.util.ArrayList;
import java.util.List;

public class Carrinho<T> {
    private List<T> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(T item) {
        itens.add(item);
    }

    public void removerItem(T item) {
        itens.remove(item);
    }

    public void listarItens() {
        System.out.println("\nItens no carrinho:");
        for (T item : itens) {
            System.out.println(item.toString());
        }
    }

    public int contarItens() {
        return itens.size();
    }
}

