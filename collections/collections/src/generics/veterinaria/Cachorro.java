package generics.veterinaria;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, int idade, String dono, String raca) {
        super(nome, idade, dono);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "[Cachorro] " + super.toString() + " | Raça: " + raca;
    }
}

