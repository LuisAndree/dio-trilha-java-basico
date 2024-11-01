package mapinterface.contabancaria;

import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Cliente> clientes = new HashMap<>();
    private GerenteContas gerenteContas = new GerenteContas();

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);
    }

    public void abrirConta(String numeroConta, Cliente cliente) {
        Conta conta = new Conta(numeroConta, cliente);
        gerenteContas.adicionarConta(conta);
    }

    public void realizarDeposito(String numeroConta, double valor) {
        Conta conta = gerenteContas.buscarContaPorNumero(numeroConta);
        if (conta != null) {
            conta.depositar(valor);
        }
    }

    public void realizarSaque(String numeroConta, double valor) {
        Conta conta = gerenteContas.buscarContaPorNumero(numeroConta);
        if (conta != null && conta.sacar(valor)) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void listarContas() {
        gerenteContas.listarContas();
    }
}
