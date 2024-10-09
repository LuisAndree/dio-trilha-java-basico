package conferencia;

public class Palestrante {
    private String nome;
    private String especialidade;

    public Palestrante(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void palestrar() {
        System.out.println(nome + " está palestrando sobre " + especialidade);
    }
}
