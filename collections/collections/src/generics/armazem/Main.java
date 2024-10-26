package generics.armazem;

public class Main {
    public static void main(String[] args) {
        GestorInventario gestor = new GestorInventario();

        Eletronico eletronico1 = new Eletronico("Notebook", 4500.00, "Dell");
        Alimento alimento1 = new Alimento("Arroz", 25.00, "01/01/2025");
        Roupa roupa1 = new Roupa("Camisa", 80.00, "M");

        gestor.getInventarioEletronicos().adicionarProduto(eletronico1);
        gestor.getInventarioAlimentos().adicionarProduto(alimento1);
        gestor.getInventarioRoupas().adicionarProduto(roupa1);

        gestor.exibirTodosProdutos();
    }
}
