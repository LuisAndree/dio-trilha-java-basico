package list.equipe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Alice", "Backend");
        Desenvolvedor dev2 = new Desenvolvedor("Bob", "Frontend");
        Desenvolvedor dev3 = new Desenvolvedor("Charlie", "DevOps");

        Equipe equipe = new Equipe("Time Alpha");
        equipe.adicionarDesenvolvedor(dev1);
        equipe.adicionarDesenvolvedor(dev2);
        equipe.listarEquipe();

        Tarefa tarefa1 = new Tarefa("Implementar API");
        Tarefa tarefa2 = new Tarefa("Desenvolver Interface Web");
        Tarefa tarefa3 = new Tarefa("Configurar CI/CD");

        Projeto projeto = new Projeto("Sistema E-Commerce");
        projeto.adicionarDesenvolvedor(dev1);
        projeto.adicionarDesenvolvedor(dev2);
        projeto.adicionarDesenvolvedor(dev3);

        Gerente gerente = new Gerente("Lucas");
        List<Tarefa> tarefasParaProjeto = new ArrayList<>();
        tarefasParaProjeto.add(tarefa1);
        tarefasParaProjeto.add(tarefa2);
        tarefasParaProjeto.add(tarefa3);

        gerente.atribuirTarefas(projeto, tarefasParaProjeto);

        projeto.listarTarefas();
        projeto.listarDesenvolvedores();
    }
}
