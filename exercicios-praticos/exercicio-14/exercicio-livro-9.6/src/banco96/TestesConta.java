package banco96;

public class TestesConta {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.deposita(1000);
        cp.deposita(1000);

        // c.atualiza(0.01);
        // cc.atualiza(0.01);
        // cp.atualiza(0.01);

        // System.out.println(c.getSaldo());
        // System.out.println(cc.getSaldo());
        // System.out.println(cp.getSaldo());

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());

        Banco b1 = new Banco(3);

        b1.setContas(cc);
        b1.setContas(cp);

        b1.getContas();
    }
}
