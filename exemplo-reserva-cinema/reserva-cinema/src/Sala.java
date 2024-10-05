public class Sala {
    private int numeroSala;
    private int capacidade;

    public Sala(int numeroSala, int capacidade) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void exibirInformacoes() {
        System.out.println("Sala: " + numeroSala + " | Capacidade: " + capacidade + " pessoas");
    }
}

