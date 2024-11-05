package mapinterface.conferencia;

public class SalaConferencia {
    private String numero;
    private int capacidade;

    public SalaConferencia(String numero, int capacidade) {
        this.numero = numero;
        this.capacidade = capacidade;
    }

    public String getNumero() {
        return numero;
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "SalaConferencia [Número: " + numero + ", Capacidade: " + capacidade + "]";
    }
}
