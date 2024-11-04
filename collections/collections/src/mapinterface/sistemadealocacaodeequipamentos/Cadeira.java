package mapinterface.sistemadealocacaodeequipamentos;

public class Cadeira extends Equipamento {
    private String material;

    public Cadeira(String codigo, String nome, String material) {
        super(codigo, nome);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return super.toString() + ", Material: " + material;
    }
}
