package restaurante;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Prato> pratos;

    public Pedido() {
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
        System.out.println(prato.getNome() + " adicionado ao pedido.");
    }

    public double calcularTotal() {
        return pratos.stream().mapToDouble(Prato::getPreco).sum();
    }

    public void prepararPedido() {
        for (Prato prato : pratos) {
            prato.preparar();
        }
    }
}
