public class Funcionario {
    String nome;
    String rg;
    double salario;
    Data dataDeEntrada;
    Departamento departamento;

    public Funcionario() {
        departamento = new Departamento();
        dataDeEntrada = new Data();
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
        return "Funcionario [\nnome: "+ nome +"\nrg: "+ rg +"\ndata de ingresso: "+ dataDeEntrada.toString() +"\nsalario: "+ salario +"\ndepartamento: "+ departamento.nome +"\n]";
    }

    //Q8
    //Funcionario.salario = 3000;
    //Esse código não faz sentido se salario for um atributo de instância, porque você está tentando acessar o atributo diretamente a partir da classe (Funcionario) e não de uma instância específica de Funcionario.
    //Diferença entre Atributo de Instância e Atributo Estático:
    //Atributos de Instância: São específicos para cada objeto criado. Ou seja, cada objeto (instância) da classe Funcionario tem seu próprio valor de salario. 

    //Funcionario.ganhoAnual();
    //Esse código faz sentido se calculaGanhoAtual() for um método estático. Métodos estáticos podem ser chamados diretamente pela classe, sem a necessidade de criar uma instância de Funcionario.
    //Se o método não for estático, o código não faz sentido, porque você estaria tentando chamar um método que pertence a uma instância específica, não à classe.

    //Faz sentido perguntar para o esquema da classe (Funcionario) sobre o valor anual?
    //Perguntar para a classe (Funcionario) sobre o valor anual só faz sentido se essa informação for comum a todos os funcionários. Nesse caso, o método poderia ser estático.
    //Se o valor anual depender de dados específicos de cada funcionário, o método não deveria ser estático, pois diferentes funcionários podem ter salários diferentes, o que implica que o cálculo do ganho atual deve ser feito individualmente para cada instância.
}
