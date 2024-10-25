package mapinterface.desenvolvimento;

public class Main {
    public static void main(String[] args) {
        GerenteDeProjetos gerente = new GerenteDeProjetos();

        Projeto projetoA = new Projeto("Projeto A");

        Desenvolvedor dev1 = new Desenvolvedor("Alice", "Frontend");
        Desenvolvedor dev2 = new Desenvolvedor("Bob", "Backend");

        Tarefa tarefa1 = new Tarefa("Criar Tela de Login", "Implementação da tela de login no sistema.");
        Tarefa tarefa2 = new Tarefa("Configurar Banco de Dados", "Configurar PostgreSQL para o sistema.");

        projetoA.adicionarTarefa(dev1, tarefa1);
        projetoA.adicionarTarefa(dev2, tarefa2);

        gerente.adicionarProjeto(projetoA);

        gerente.listarTarefasPorProjeto("Projeto A");
    }
}
