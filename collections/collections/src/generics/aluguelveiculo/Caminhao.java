package generics.aluguelveiculo;

public class Caminhao extends Veiculo {
    private double cargaMaxima;

    public Caminhao(String placa, String modelo, double precoDiaria, double cargaMaxima) {
        super(placa, modelo, precoDiaria);
        this.cargaMaxima = cargaMaxima;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + " | Carga Máxima: " + cargaMaxima + " kg";
    }
}
