package mapinterface.inventario;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeInventario inventario = new GerenciadorDeInventario();

        Categoria eletronicos = new Categoria("Eletrônicos", "Dispositivos eletrônicos e acessórios");
        Categoria moveis = new Categoria("Móveis", "Móveis para casa e escritório");

        Fornecedor fornecedor1 = new Fornecedor("Tech Supplier", "11999999999");
        Fornecedor fornecedor2 = new Fornecedor("Home Furniture", "11888888888");

        Estoque estoque1 = new Estoque(10);
        Estoque estoque2 = new Estoque(5);
        Estoque estoque3 = new Estoque(20);

        Produto produto1 = new Produto("Laptop", 2500.00, eletronicos, fornecedor1, estoque1);
        Produto produto2 = new Produto("Mesa", 500.00, moveis, fornecedor2, estoque2);
        Produto produto3 = new Produto("Smartphone", 1500.00, eletronicos, fornecedor1, estoque3);

        inventario.adicionarProduto("P001", produto1);
        inventario.adicionarProduto("P002", produto2);
        inventario.adicionarProduto("P003", produto3);

        inventario.atualizarQuantidade("P001", 5);

        inventario.removerProduto("P002");

        inventario.listarProdutos();
    }
}

