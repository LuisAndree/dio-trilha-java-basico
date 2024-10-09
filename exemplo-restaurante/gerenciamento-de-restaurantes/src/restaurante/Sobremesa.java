package restaurante;
public class Sobremesa extends Prato {
    public Sobremesa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando sobremesa: " + getNome());
    }
}
