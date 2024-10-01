package banco96;

public interface Conta {

    public void deposita(double valor);

    public void saca(double valor);

    public double getSaldo();

    public void atualiza(double taxa);
    
    @Override
    public String toString();
}
