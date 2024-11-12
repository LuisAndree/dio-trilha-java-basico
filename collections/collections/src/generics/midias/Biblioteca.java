package generics.midias;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {
    private List<T> midias;

    public Biblioteca() {
        this.midias = new ArrayList<>();
    }

    public void adicionarMidia(T midia) {
        midias.add(midia);
    }

    public void removerMidia(T midia) {
        midias.remove(midia);
    }

    public void listarMidias() {
        midias.forEach(System.out::println);
    }

    public T buscarPorTitulo(String titulo) {
        return midias.stream()
                .filter(m -> m.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }
}
