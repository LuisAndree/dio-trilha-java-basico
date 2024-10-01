package banco96;

public class ContaPoupanca implements ContaTributavel {
    private double saldo;

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 3;
    }

    @Override
    public void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    public void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "Conta [\nSaldo Poupança: " + getSaldo() + "\n]";
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo() * 0.05;
    }
}
