package generics.aluguelveiculo;

public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double precoDiaria;

    public Veiculo(String placa, String modelo, double precoDiaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.precoDiaria = precoDiaria;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    @Override
    public String toString() {
        return modelo + " (Placa: " + placa + ") - R$" + precoDiaria + " por dia";
    }
}
