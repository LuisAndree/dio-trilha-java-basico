package generics;

import java.util.HashMap;
import java.util.Map;

public class Loja<T> {
    private Map<Integer, T> estoque;

    public Loja() {
        this.estoque = new HashMap<>();
    }

    public void adicionarAoEstoque(int id, T item) {
        estoque.put(id, item);
    }

    public void removerDoEstoque(int id) {
        estoque.remove(id);
    }

    public T buscarPorId(int id) {
        return estoque.get(id);
    }

    public void listarEstoque() {
        System.out.println("\nEstoque da loja:");
        for (Map.Entry<Integer, T> item : estoque.entrySet()) {
            System.out.println("ID: " + item.getKey() + " - " + item.getValue());
        }
    }
}
