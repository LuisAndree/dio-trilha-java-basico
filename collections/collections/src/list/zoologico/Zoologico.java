package list.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<AreaZoologico> areas;
    private List<Tratador> tratadores;
    private List<Visitante> visitantes;

    public Zoologico() {
        this.areas = new ArrayList<>();
        this.tratadores = new ArrayList<>();
        this.visitantes = new ArrayList<>();
    }

    public void adicionarArea(AreaZoologico area) {
        areas.add(area);
    }

    public void adicionarTratador(Tratador tratador) {
        tratadores.add(tratador);
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public void listarVisitantes() {
        visitantes.forEach(System.out::println);
    }

    public void listarTratadores() {
        tratadores.forEach(System.out::println);
    }
}
