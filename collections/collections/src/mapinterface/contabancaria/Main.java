package mapinterface.contabancaria;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente cliente1 = new Cliente("João Silva", "11122233344");
        Cliente cliente2 = new Cliente("Maria Oliveira", "55566677788");
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);

        banco.abrirConta("12345", cliente1);
        banco.abrirConta("67890", cliente2);

        banco.realizarDeposito("12345", 1000.00);
        banco.realizarSaque("12345", 200.00);
        banco.realizarDeposito("67890", 500.00);

        System.out.println("\nListagem de Contas:");
        banco.listarContas();
    }
}
