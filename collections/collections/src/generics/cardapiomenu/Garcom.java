package generics.cardapiomenu;

public class Garcom {
    private String nome;
    private String id;

    public Garcom(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public void adicionarItemPedido(Mesa mesa, ItemMenu item) {
        mesa.getPedidoAtual().adicionarItem(item);
        System.out.println("Item " + item.getNome() + " adicionado ao pedido da mesa " + mesa.getNumero());
    }

    public void finalizarPedido(Mesa mesa) {
        mesa.getPedidoAtual().finalizarPedido();
        System.out.println("Pedido da mesa " + mesa.getNumero() + " finalizado.");
    }

    @Override
    public String toString() {
        return "Garçom: " + nome + " (ID: " + id + ")";
    }
}
