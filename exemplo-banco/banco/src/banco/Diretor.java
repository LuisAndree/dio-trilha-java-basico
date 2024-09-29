package banco;

public class Diretor extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        return this.salario * 1.5 + 1500;
    }

    @Override
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido ao Diretor!");
            return true;
        } else {
            System.out.println("Acesso Negado ao Diretor!");
            return false;
        }
    }
}
