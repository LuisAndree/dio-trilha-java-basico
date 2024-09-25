public class Conta {
    int numero;
    Cliente titular;
    private double saldo;
    private double limite;

    void saca(double quantidade) {
        this.saldo = this.saldo - quantidade;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo + limite;
    }
}
