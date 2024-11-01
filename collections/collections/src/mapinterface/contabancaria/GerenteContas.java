package mapinterface.contabancaria;

import java.util.HashMap;
import java.util.Map;

public class GerenteContas {
    private Map<String, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumeroConta(), conta);
    }

    public Conta buscarContaPorNumero(String numeroConta) {
        return contas.get(numeroConta);
    }

    public void listarContas() {
        contas.values().forEach(System.out::println);
    }
}
