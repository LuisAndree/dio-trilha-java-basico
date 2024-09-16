public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 17;

        if (valorSolicitado <= saldo)
            saldo = saldo - valorSolicitado;

        else if (valorSolicitado > saldo)
            System.out.println("Saldo insuficiente");

        else
            System.out.println("Operação nao realizada");

        System.out.println("Novo saldo: " + saldo);
    }
}
