package setinterface.conferencia;

import java.util.Objects;

public class Sala {
    private String identificador;
    private int capacidade;

    public Sala(String identificador, int capacidade) {
        this.identificador = identificador;
        this.capacidade = capacidade;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Sala sala = (Sala) obj;
        return Objects.equals(identificador, sala.identificador);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public String toString() {
        return "Sala: " + identificador + ", Capacidade: " + capacidade;
    }
}
