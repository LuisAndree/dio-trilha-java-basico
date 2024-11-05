package mapinterface.conferencia;

public class Funcionario {
    private String nome;
    private String idFuncionario;

    public Funcionario(String nome, String idFuncionario) {
        this.nome = nome;
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public String getIdFuncionario() {
        return idFuncionario;
    }

    @Override
    public String toString() {
        return "Funcionario [Nome: " + nome + ", ID: " + idFuncionario + "]";
    }
}
