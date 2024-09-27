package banco;

public class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getBonificacao() {
        return this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Conta [\nNome: " + nome + "\nCPF: " + cpf + "\nSalario: " + salario + "\n]";
    }
}
