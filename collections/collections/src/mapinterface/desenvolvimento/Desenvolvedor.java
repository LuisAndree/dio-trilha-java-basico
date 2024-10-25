package mapinterface.desenvolvimento;

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
        return "Desenvolvedor: " + nome + " - Especialidade: " + especialidade;
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + especialidade.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Desenvolvedor other = (Desenvolvedor) obj;
        return nome.equals(other.nome) && especialidade.equals(other.especialidade);
    }
}
