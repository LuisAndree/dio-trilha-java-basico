package mapinterface.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria alimentos = new Categoria("Alimentos");

        Fornecedor samsung = new Fornecedor("Samsung", "contato@samsung.com");
        Fornecedor nestle = new Fornecedor("Nestlé", "contato@nestle.com");

        Produto tv = new Produto("ELE-001", "Smart TV 50\"", 2500.00, eletronicos, samsung);
        Produto chocolate = new Produto("ALI-002", "Chocolate ao Leite", 5.99, alimentos, nestle);

        estoque.adicionarProduto(tv);
        estoque.adicionarProduto(chocolate);

        estoque.listarProdutos();

        System.out.println("\n🔎 Buscando produto ELE-001:");
        System.out.println(estoque.buscarProduto("ELE-001"));

        estoque.removerProduto("ALI-002");

        estoque.listarProdutos();
    }
}
