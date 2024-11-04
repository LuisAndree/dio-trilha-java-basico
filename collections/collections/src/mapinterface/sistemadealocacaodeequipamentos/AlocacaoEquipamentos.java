package mapinterface.sistemadealocacaodeequipamentos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlocacaoEquipamentos {
    private Map<Funcionario, List<Equipamento>> alocacoes = new HashMap<>();

    public void adicionarEquipamento(Funcionario funcionario, Equipamento equipamento) {
        alocacoes.computeIfAbsent(funcionario, k -> new ArrayList<>()).add(equipamento);
        System.out.println("Equipamento " + equipamento.getNome() + " alocado para " + funcionario.getNome());
    }

    public void listarEquipamentos(Funcionario funcionario) {
        System.out.println("Equipamentos alocados para " + funcionario.getNome() + ":");
        List<Equipamento> equipamentos = alocacoes.get(funcionario);
        if (equipamentos != null) {
            equipamentos.forEach(System.out::println);
        } else {
            System.out.println("Nenhum equipamento alocado.");
        }
    }

    public void listarAlocacoes() {
        System.out.println("Lista de Alocações:");
        for (Map.Entry<Funcionario, List<Equipamento>> entrada : alocacoes.entrySet()) {
            System.out.println(entrada.getKey().getNome() + ":");
            entrada.getValue().forEach(System.out::println);
        }
    }
}
