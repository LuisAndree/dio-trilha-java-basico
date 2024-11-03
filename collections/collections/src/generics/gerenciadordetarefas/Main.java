package generics.gerenciadordetarefas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TarefaTecnica codificacao = new TarefaTecnica("Implementar funcionalidade X", 2, "Alta");
        TarefaTecnica testes = new TarefaTecnica("Testar módulo Y", 3, "Média");

        TarefaGerencial reuniao = new TarefaGerencial("Reunião semanal de status", 1, "2024-10-15");
        TarefaGerencial planejamento = new TarefaGerencial("Planejar sprints", 1, "2024-10-10");

        List<TarefaTecnica> tarefasTecnicas = new ArrayList<>();
        MembroEquipe<TarefaTecnica> dev = new MembroEquipe<>("Carlos", tarefasTecnicas);
        dev.adicionarTarefa(codificacao);
        dev.adicionarTarefa(testes);

        List<TarefaGerencial> tarefasGerenciais = new ArrayList<>();
        MembroEquipe<TarefaGerencial> gerente = new MembroEquipe<>("Ana", tarefasGerenciais);
        gerente.adicionarTarefa(reuniao);
        gerente.adicionarTarefa(planejamento);

        Projeto projeto = new Projeto("Projeto X");
        projeto.adicionarMembro(dev, tarefasTecnicas);
        projeto.adicionarMembro(gerente, tarefasGerenciais);

        projeto.listarMembrosETarefas();
    }
}

