package veterinaria;

public class Passaro extends Animal {

    public Passaro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Pássaro " + getNome() + " está cantando.");
    }

    public void voar() {
        System.out.println("Pássaro " + getNome() + " está voando.");
    }
}
