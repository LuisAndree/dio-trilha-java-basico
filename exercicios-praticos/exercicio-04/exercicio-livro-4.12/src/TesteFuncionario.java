public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario;
        funcionario = new Funcionario();

        funcionario.nome = "Andre";
        funcionario.rg = "455497982012-7";
        funcionario.dataDeEntrada.setDia(5);
        funcionario.dataDeEntrada.setMes(11);
        funcionario.dataDeEntrada.setAno(2024);
        funcionario.departamento.nome = "TI";
        funcionario.salario = 3000.0;
        funcionario.recebeAumento(500);

        System.out.println(funcionario.toString());
        System.out.println(funcionario.calculaGanhoAnual());

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        //Q4  
        f1.nome = "Luis";
        f1.salario = 2000;
        f2.nome = "Luis";
        f2.salario = 2000;

        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        //Aqui, a comparação f1 == f2 está verificando se os dois objetos apontam para o mesmo endereço de memória. Em Java, o operador == para objetos não compara os valores internos dos atributos, mas sim se as referências são idênticas, ou seja, se os dois objetos são exatamente o mesmo.
        // Mesmo que os atributos de f1 e f2 sejam iguais (nome e salario), eles são dois objetos distintos na memória.
        // Portanto, como f1 e f2 referenciam dois objetos diferentes, o resultado será "diferentes".

        //Q5
        f1 = f2;
        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        //Você está atribuindo a referência de f2 para f1. Agora, ambas as variáveis estão apontando para o mesmo objeto na memória. Isso significa que f1 e f2 referenciam o mesmo objeto após essa atribuição.

        //Funcionario f3 = new Funcionario();
        
    }
}
