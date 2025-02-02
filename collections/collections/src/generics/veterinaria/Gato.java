package generics.veterinaria;

public class Gato extends Animal {
    private boolean castrado;

    public Gato(String nome, int idade, String dono, boolean castrado) {
        super(nome, idade, dono);
        this.castrado = castrado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    @Override
    public String toString() {
        return "[Gato] " + super.toString() + " | Castrado: " + (castrado ? "Sim" : "Não");
    }
}
