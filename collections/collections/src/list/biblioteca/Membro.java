package list.biblioteca;

public class Membro {
    private String nome;
    private String matricula;

    public Membro(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Membro: " + nome + ", Matrícula: " + matricula;
    }
}
