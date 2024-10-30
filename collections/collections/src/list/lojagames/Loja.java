package list.lojagames;

public class Loja {
    private Inventario inventario;
    private HistoricoVendas historicoVendas;

    public Loja() {
        this.inventario = new Inventario();
        this.historicoVendas = new HistoricoVendas();
    }

    public Inventario getInventario() {
        return inventario;
    }

    public HistoricoVendas getHistoricoVendas() {
        return historicoVendas;
    }

    public void realizarVenda(String nomeProduto, int quantidade) {
        Produto produto = inventario.buscarProduto(nomeProduto);
        if (produto != null && produto.getQuantidadeEmEstoque() >= quantidade) {
            produto.atualizarEstoque(-quantidade);
            Venda venda = new Venda(produto, quantidade);
            historicoVendas.registrarVenda(venda);
            System.out.println("Venda realizada: " + venda);
        } else {
            System.out.println("Estoque insuficiente ou produto não encontrado.");
        }
    }
}
