package generics.armazem;

public class GestorInventario {
    private Inventario<Eletronico> inventarioEletronicos;
    private Inventario<Alimento> inventarioAlimentos;
    private Inventario<Roupa> inventarioRoupas;

    public GestorInventario() {
        this.inventarioEletronicos = new Inventario<>();
        this.inventarioAlimentos = new Inventario<>();
        this.inventarioRoupas = new Inventario<>();
    }

    public Inventario<Eletronico> getInventarioEletronicos() {
        return inventarioEletronicos;
    }

    public Inventario<Alimento> getInventarioAlimentos() {
        return inventarioAlimentos;
    }

    public Inventario<Roupa> getInventarioRoupas() {
        return inventarioRoupas;
    }

    public void exibirTodosProdutos() {
        System.out.println("Eletrônicos:");
        inventarioEletronicos.listarProdutos().forEach(System.out::println);

        System.out.println("\nAlimentos:");
        inventarioAlimentos.listarProdutos().forEach(System.out::println);

        System.out.println("\nRoupas:");
        inventarioRoupas.listarProdutos().forEach(System.out::println);
    }
}
