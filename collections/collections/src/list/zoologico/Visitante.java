package list.zoologico;

public class Visitante {
    private String nome;
    private int idade;

    public Visitante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Visitante: " + nome + " | Idade: " + idade + " anos";
    }
}
