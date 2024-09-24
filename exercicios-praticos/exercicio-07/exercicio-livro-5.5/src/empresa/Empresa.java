package empresa;

public class Empresa {
    Funcionario[] empregados;
    String cnpj;

    private int contador = 0;

    public Empresa(int capacidade) {
        this.empregados = new Funcionario[capacidade];
    }

    public void adiciona(Funcionario f) {
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

    public void mostraEmpregados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(empregados[i]);
        }
    }

    public boolean contemFuncionario(Funcionario f) {
        boolean temFuncionario = false;
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == f) {
                temFuncionario = true;
                System.out.println("Funcionario " + empregados[i].nome + " encontrado no sistema");
            }
        }
        return temFuncionario;
    }
}
