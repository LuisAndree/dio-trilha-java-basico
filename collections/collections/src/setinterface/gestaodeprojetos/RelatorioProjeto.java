package setinterface.gestaodeprojetos;

public class RelatorioProjeto {
    public static void gerarRelatorio(Projeto projeto) {
        System.out.println("Relatório do Projeto: " + projeto.getNome());
        System.out.println("Código: " + projeto.getCodigo());

        System.out.println("\nMembros da Equipe:");
        projeto.getMembrosEquipe().forEach(System.out::println);

        System.out.println("\nMódulos:");
        for (Modulo modulo : projeto.getModulos()) {
            System.out.println("- " + modulo.getNome());

            System.out.println("  Tarefas:");
            for (Tarefa tarefa : modulo.getTarefas()) {
                System.out.println("    * " + tarefa.getTitulo() + " (Responsável: " + tarefa.getMembroResponsavel().getNome() + ")");
            }
        }
    }
}
