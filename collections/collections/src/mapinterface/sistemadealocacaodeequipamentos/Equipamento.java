package mapinterface.sistemadealocacaodeequipamentos;

public class Equipamento {
    private String codigo;
    private String nome;

    public Equipamento(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Equipamento [Código: " + codigo + ", Nome: " + nome + "]";
    }
}
