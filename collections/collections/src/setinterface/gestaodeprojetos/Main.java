package setinterface.gestaodeprojetos;

public class Main {
    public static void main(String[] args) {
        MembroEquipe membro1 = new MembroEquipe("001", "Alice", "Desenvolvedora");
        MembroEquipe membro2 = new MembroEquipe("002", "Bob", "Analista");
        MembroEquipe membro3 = new MembroEquipe("003", "Carol", "Gerente de Projeto");

        Projeto projeto = new Projeto("P123", "Sistema de Gestão");

        projeto.adicionarMembro(membro1);
        projeto.adicionarMembro(membro2);
        projeto.adicionarMembro(membro3);

        Modulo modulo1 = new Modulo("Módulo de Autenticação");
        Modulo modulo2 = new Modulo("Módulo de Relatórios");

        Tarefa tarefa1 = new Tarefa("Implementar login", "Desenvolver funcionalidade de login", membro1);
        Tarefa tarefa2 = new Tarefa("Analisar requisitos de segurança", "Análise de segurança para autenticação", membro2);
        Tarefa tarefa3 = new Tarefa("Desenvolver relatórios", "Implementação de relatórios gerenciais", membro1);

        modulo1.adicionarTarefa(tarefa1);
        modulo1.adicionarTarefa(tarefa2);
        modulo2.adicionarTarefa(tarefa3);

        GerenciadorProjeto gerenciador = new GerenciadorProjeto();
        gerenciador.adicionarProjeto(projeto);

        RelatorioProjeto.gerarRelatorio(projeto);
    }
}
