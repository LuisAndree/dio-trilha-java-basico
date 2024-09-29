package banco;

public class Gerente extends Funcionario implements Autenticavel {
    private int senha;
    // private int numeroDeFuncionariosGerenciados;

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido ao Gerente!");
            return true;
        } else {
            System.out.println("Acesso Negado ao Gerente!");
            return false;
        }
    }

    @Override
    public double getBonificacao() {
        return this.salario * 1.4 + 1000;
    }
}
