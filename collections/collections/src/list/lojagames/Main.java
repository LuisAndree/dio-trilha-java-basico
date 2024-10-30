package list.lojagames;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        loja.getInventario().adicionarProduto(new Jogo("The Legend of Zelda", 299.90, 10, "Nintendo Switch"));
        loja.getInventario().adicionarProduto(new Console("PlayStation 5", 4999.90, 5, "Sony"));
        loja.getInventario().adicionarProduto(new Acessorio("Controle Xbox", 250.00, 20, "Controle"));

        System.out.println("Inventário da Loja:");
        loja.getInventario().listarProdutos();

        System.out.println("\nRealizando venda...");
        loja.realizarVenda("The Legend of Zelda", 2);

        System.out.println("\nHistórico de Vendas:");
        loja.getHistoricoVendas().listarVendas();
    }
}
