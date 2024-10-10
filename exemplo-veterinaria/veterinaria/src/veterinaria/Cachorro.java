package veterinaria;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Cachorro " + getNome() + " está latindo.");
    }
}
