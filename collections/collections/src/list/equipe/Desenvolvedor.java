package list.equipe;

public class Desenvolvedor {
    private String nome;
    private String especialidade;

    public Desenvolvedor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Desenvolvedor: " + nome + " (Especialidade: " + especialidade + ")";
    }
}
