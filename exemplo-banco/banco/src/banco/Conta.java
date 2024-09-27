package banco;

public class Conta {
    private int numero = 0;
    private static int contadorNumeroConta = 0;
    private Cliente titular;
    private double saldo;
    private double limite;

    public Conta(Cliente titular) {
        this.numero = ++contadorNumeroConta;
        this.titular = titular;
    }

    public void sacar(double valor) {
        boolean conseguiuSacar = false;

        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            conseguiuSacar = true;
        }
        enviaMensagemOperacao(conseguiuSacar);
    }

    public void depositar(double valor) {
        if(valor > 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Deposite um valor positivo!!");
        }
    }

    public void transferirPara(Conta contaDestino, double valor) {
        boolean conseguiuTransferir = false;

        if ((this.saldo + this.limite) >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            conseguiuTransferir = true;
        }
        enviaMensagemOperacao(conseguiuTransferir);
    }

    private void enviaMensagemOperacao(boolean operacao) {
        if (operacao) {
            System.out.println("Operação realisada com sucesso!!");
        } else {
            System.out.println("Operação não realisada, checkar saldo!!");
        }
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo + limite;
    }

    public int getNumero() {
        return numero;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Conta [\nNumero: " + getNumero() + "\nTitular: " + titular.getNome() + " " + titular.getSobrenome()
                + "\nCPF: " + titular.getCpf() + "\nSaldo: " + getSaldo() + "\n]";
    }

}
