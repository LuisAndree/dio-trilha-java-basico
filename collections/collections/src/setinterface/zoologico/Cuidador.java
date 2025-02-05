package setinterface.zoologico;

import java.util.Objects;

public class Cuidador {
    private String nome;
    private int experiencia; // Em anos

    public Cuidador(String nome, int experiencia) {
        this.nome = nome;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cuidador cuidador = (Cuidador) obj;
        return Objects.equals(nome, cuidador.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return "👨‍🌾 Cuidador: " + nome + " | Experiência: " + experiencia + " anos";
    }
}
