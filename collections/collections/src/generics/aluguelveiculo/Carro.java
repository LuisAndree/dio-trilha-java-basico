package generics.aluguelveiculo;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String placa, String modelo, double precoDiaria, int numeroPortas) {
        super(placa, modelo, precoDiaria);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Portas: " + numeroPortas;
    }
}
