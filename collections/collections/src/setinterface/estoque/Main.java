package setinterface.estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        Produto produto1 = new Produto("P001", "Arroz", 5.99);
        Produto produto2 = new Produto("P002", "Feijão", 4.49);
        Produto produto3 = new Produto("P003", "Óleo", 7.99);

        estoque.adicionarProduto(produto1, 50);
        estoque.adicionarProduto(produto2, 30);
        estoque.adicionarProduto(produto3, 20);

        GerenciadorVendas gerenciadorVendas = new GerenciadorVendas(estoque);

        gerenciadorVendas.realizarVenda("P001", 5);
        gerenciadorVendas.realizarVenda("P002", 10);
        gerenciadorVendas.realizarVenda("P003", 25);  

        System.out.println("\nVendas Realizadas:");
        gerenciadorVendas.getVendas().forEach(System.out::println);

        System.out.println("\nEstoque Atualizado:");
        estoque.getProdutos().forEach(produto ->
                System.out.println(produto.getNome() + ": " + estoque.getQuantidade(produto.getCodigo())));
    }
}

