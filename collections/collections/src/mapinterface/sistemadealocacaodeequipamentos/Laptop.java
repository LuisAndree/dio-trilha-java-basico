package mapinterface.sistemadealocacaodeequipamentos;

public class Laptop extends Equipamento {
    private String sistemaOperacional;

    public Laptop(String codigo, String nome, String sistemaOperacional) {
        super(codigo, nome);
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    @Override
    public String toString() {
        return super.toString() + ", Sistema Operacional: " + sistemaOperacional;
    }
}
