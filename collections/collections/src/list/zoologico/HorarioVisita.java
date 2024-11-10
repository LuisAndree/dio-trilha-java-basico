package list.zoologico;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HorarioVisita {
    private LocalTime horario;
    private List<Visitante> visitantes;

    public HorarioVisita(LocalTime horario) {
        this.horario = horario;
        this.visitantes = new ArrayList<>();
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void adicionarVisitante(Visitante visitante) {
        visitantes.add(visitante);
    }

    public List<Visitante> getVisitantes() {
        return visitantes;
    }
}
