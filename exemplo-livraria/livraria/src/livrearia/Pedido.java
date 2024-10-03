package livrearia;

import java.time.LocalDate;

public class Pedido {
    private Cliente cliente;
    private CarrinhoDeCompras carrinho;
    private LocalDate dataPedido;
    private String status;

    public Pedido(Cliente cliente, CarrinhoDeCompras carrinho) {
        this.cliente = cliente;
        this.carrinho = carrinho;
        this.dataPedido = LocalDate.now();
        this.status = "Processando";
    }

    public void finalizarPedido() {
        this.status = "Finalizado";
        carrinho.esvaziarCarrinho();
    }

    public CarrinhoDeCompras getCarrinho() {
        return carrinho;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public LocalDate getDataPedido() {
        return dataPedido;
    }
    public String getStatus() {
        return status;
    }
}
