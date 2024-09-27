package empresa68;

import java.util.Scanner;

public class Empresa {
    Funcionario[] empregados;
    String cnpj;

    private int contador = 0;

    public Empresa(int capacidade) {
        this.empregados = new Funcionario[capacidade];
    }

    public void setEmpregados(Funcionario f) {
        if (contador >= empregados.length) {
            Funcionario[] novaArray = new Funcionario[empregados.length * 2];
            for (int i = 0; i < empregados.length; i++) {
                novaArray[i] = empregados[i];
            }
            empregados = novaArray;
            empregados[contador] = f;
            contador++;
        } else if (contador < empregados.length) {
            empregados[contador] = f;
            contador++;
        }
    }

    public void getEmpregados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(empregados[i]);
        }
    }

    public void getEmpregado(int id) {
        System.out.println(empregados[id - 1]);
    }

    public boolean contemFuncionario(Funcionario f) {
        boolean temFuncionario = false;
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == f) {
                temFuncionario = true;
                System.out.println("Funcionario " + empregados[i].getNome() + " encontrado no sistema");
            }
        }
        return temFuncionario;
    }

    public void atualizaFuncionario(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o novo nome para o funcionario:");
        String novoNome = scanner.next();
        empregados[id - 1].setNome(novoNome);
        System.out.println("Nome do funcionario " + empregados[id - 1].getNome() + " atualizado");

        scanner.close();
    }
}
