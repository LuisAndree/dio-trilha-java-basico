package setinterface.cursos;

import java.util.Objects;

public class Instrutor {
    private String nome;
    private String especialidade;

    public Instrutor(String nome, String especialidade) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrutor instrutor = (Instrutor) o;
        return Objects.equals(nome, instrutor.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "Instrutor: " + nome + " (Especialidade: " + especialidade + ")";
    }
}
