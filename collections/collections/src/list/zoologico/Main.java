package list.zoologico;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Animal leao = new Animal("Leão", "Panthera leo", 5);
        Animal elefante = new Animal("Elefante", "Loxodonta africana", 10);
        Animal tigre = new Animal("Tigre", "Panthera tigris", 3);

        AreaZoologico areaSavanna = new AreaZoologico("Savanna");
        AreaZoologico areaJungle = new AreaZoologico("Jungle");
        areaSavanna.adicionarAnimal(leao);
        areaJungle.adicionarAnimal(tigre);
        areaJungle.adicionarAnimal(elefante);

        Tratador tratadorJoao = new Tratador("João");
        tratadorJoao.adicionarAnimal(leao);
        tratadorJoao.adicionarAnimal(tigre);

        Tratador tratadorMaria = new Tratador("Maria");
        tratadorMaria.adicionarAnimal(elefante);

        Exibicao exibicaoSelvagem = new Exibicao("Selvagem", tratadorJoao);
        exibicaoSelvagem.adicionarAnimal(leao);
        exibicaoSelvagem.adicionarAnimal(tigre);

        Visitante visitante1 = new Visitante("Lucas", 20);
        Visitante visitante2 = new Visitante("Ana", 30);

        HorarioVisita horarioManha = new HorarioVisita(LocalTime.of(9, 0));
        horarioManha.adicionarVisitante(visitante1);
        horarioManha.adicionarVisitante(visitante2);

        Zoologico zoologico = new Zoologico();
        zoologico.adicionarArea(areaSavanna);
        zoologico.adicionarArea(areaJungle);
        zoologico.adicionarTratador(tratadorJoao);
        zoologico.adicionarTratador(tratadorMaria);
        zoologico.adicionarVisitante(visitante1);
        zoologico.adicionarVisitante(visitante2);

        System.out.println("Zoológico - Visitantes:");
        zoologico.listarVisitantes();

        System.out.println("\nTratadores:");
        zoologico.listarTratadores();

        System.out.println("\nExibição Especial:");
        exibicaoSelvagem.exibirAnimais();
    }
}
