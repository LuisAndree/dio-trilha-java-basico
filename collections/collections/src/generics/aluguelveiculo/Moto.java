package generics.aluguelveiculo;

public class Moto extends Veiculo {
    private String tipo;

    public Moto(String placa, String modelo, double precoDiaria, String tipo) {
        super(placa, modelo, precoDiaria);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tipo: " + tipo;
    }
}
