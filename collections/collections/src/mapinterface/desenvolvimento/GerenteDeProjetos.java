package mapinterface.desenvolvimento;

import java.util.Map;
import java.util.HashMap;

public class GerenteDeProjetos {
    private Map<String, Projeto> projetos;

    public GerenteDeProjetos() {
        this.projetos = new HashMap<>();
    }

    public void adicionarProjeto(Projeto projeto) {
        projetos.put(projeto.getNome(), projeto);
    }

    public Projeto obterProjeto(String nome) {
        return projetos.get(nome);
    }

    public void listarTarefasPorProjeto(String nomeProjeto) {
        Projeto projeto = projetos.get(nomeProjeto);
        if (projeto != null) {
            System.out.println("Tarefas no Projeto: " + nomeProjeto);
            for (Map.Entry<Desenvolvedor, Tarefa> entry : projeto.getTarefasPorDesenvolvedor().entrySet()) {
                System.out.println("Desenvolvedor: " + entry.getKey() + " - Tarefa: " + entry.getValue());
            }
        } else {
            System.out.println("Projeto não encontrado.");
        }
    }
}


