public class TestaConta {
    public static void main(String args[]) {
        Conta minhaConta = new Conta();
        // minhaConta.saldo = 1000.0;
        // minhaConta.limite = 1000.0;
        // minhaConta.saca(50000);

        // System.out.println(minhaConta.saldo);
        minhaConta.setSaldo(2000);
        minhaConta.saca(20);
        System.out.println(minhaConta.getSaldo());
        
    }
}
