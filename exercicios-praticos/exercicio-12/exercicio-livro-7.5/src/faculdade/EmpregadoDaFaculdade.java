package faculdade;

public class EmpregadoDaFaculdade {
    protected String nome;
    protected double salario;
    
    public EmpregadoDaFaculdade(double salario, String nome) {
        this.nome = nome;
        this.salario = salario;
    }

    double getGastos() {
        return this.salario;
    }

    String getInfo() {
        return "nome: " + this.nome + " com salario " + this.salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
