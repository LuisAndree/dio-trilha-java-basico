package banco96;

abstract class Conta {
    protected double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    abstract void atualiza(double taxa);
    

    @Override
    public String toString() {
        return "Conta [\nSaldo: " + getSaldo() + "\n]";
    }
}
