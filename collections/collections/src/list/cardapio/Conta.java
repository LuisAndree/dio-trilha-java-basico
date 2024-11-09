package list.cardapio;

public class Conta {
    private Mesa mesa;
    private double total;

    public Conta(Mesa mesa) {
        this.mesa = mesa;
        this.total = calcularTotal();
    }

    private double calcularTotal() {
        return mesa.getPedidos().stream().mapToDouble(Pedido::getTotal).sum();
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Conta para a Mesa " + mesa.getNumero() + ": Total = R$" + total;
    }
}
