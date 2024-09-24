package empresa;
public class Funcionario {
    String nome;
    String rg;
    double salario;
    Data dataDeEntrada;
    String departamento;

    public Funcionario(String nome, String rg, double salario, String departamento, Data dataDeIngresso) {
        this.dataDeEntrada = dataDeIngresso;
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
        this.departamento = departamento;
    }

    void recebeAumento(double aumento){
        this.salario += aumento;
        System.out.println("Novo Salario: " + this.salario);
    }

    double calculaGanhoAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Funcionario [\nnome: "+ nome +"\nrg: "+ rg +"\ndata de ingresso: "+ dataDeEntrada.toString() +"\nsalario: "+ salario +"\ndepartamento: "+ departamento +"\n]";
    }

}
