package restaurante;
public class PratoPrincipal extends Prato {
    public PratoPrincipal(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando prato principal: " + getNome());
    }
}
