package generics.cardapiomenu;

public class Mesa {
    private int numero;
    private Pedido pedidoAtual;

    public Mesa(int numero) {
        this.numero = numero;
        this.pedidoAtual = new Pedido();
    }

    public int getNumero() {
        return numero;
    }

    public Pedido getPedidoAtual() {
        return pedidoAtual;
    }

    @Override
    public String toString() {
        return "Mesa " + numero;
    }
}
