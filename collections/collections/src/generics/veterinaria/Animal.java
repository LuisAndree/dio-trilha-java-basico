package generics.veterinaria;

public abstract class Animal {
    private String nome;
    private int idade;
    private String dono;

    public Animal(String nome, int idade, String dono) {
        this.nome = nome;
        this.idade = idade;
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDono() {
        return dono;
    }

    @Override
    public String toString() {
        return nome + " | Idade: " + idade + " anos | Dono: " + dono;
    }
}
