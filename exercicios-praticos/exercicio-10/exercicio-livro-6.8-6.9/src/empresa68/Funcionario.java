package empresa68;
public class Funcionario {
    private int id;
    private static int contadorIdentificadores = 0;
    private String nome;
    private String rg;
    private double salario;
    private Data dataDeEntrada;
    private String departamento;

    public Funcionario(String nome, String rg, double salario, String departamento, Data dataDeIngresso) {
        this.id = ++contadorIdentificadores;
        this.dataDeEntrada = dataDeIngresso;
        this.nome = nome;
        this.rg = rg;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDataDeEntrada(Data dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void recebeAumento(double aumento){
        this.salario += aumento;
        System.out.println("Novo Salario: " + this.salario);
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    @Override
    public String toString() {
        return "Funcionario [\nid: "+ id +"\nnome: "+ nome +"\nrg: "+ rg +"\ndata de ingresso: "+ dataDeEntrada.toString() +"\nsalario: "+ salario +"\ndepartamento: "+ departamento +"\n]";
    }

}
