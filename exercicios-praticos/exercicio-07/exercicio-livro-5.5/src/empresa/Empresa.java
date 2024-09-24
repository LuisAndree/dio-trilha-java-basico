package empresa;
public class Empresa {
    Funcionario[] empregados;
    String cnpj;

    private int contador = 0; 

    public Empresa(int capacidade) {
        this.empregados = new Funcionario[capacidade];
    }

    public void adiciona(Funcionario f) {
        if (contador < empregados.length) {
            empregados[contador] = f;
            contador++; 
        } else {
            System.out.println("Empresa cheia, não é possível adicionar mais funcionários.");
        }
    }

    public void mostraEmpregados() {
        for (int i = 0; i < contador; i++) {
            System.out.println(empregados[i]);
        }
    }
}


