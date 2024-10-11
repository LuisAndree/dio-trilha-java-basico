package evento;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nome;
    private List<Palestra> palestras;
    private List<Participante> participantes;

    public Evento(String nome) {
        this.nome = nome;
        this.palestras = new ArrayList<>();
        this.participantes = new ArrayList<>();
    }

    public void adicionarPalestra(Palestra palestra) {
        palestras.add(palestra);
        System.out.println("Palestra adicionada: " + palestra.getTitulo());
    }

    public void adicionarParticipante(Participante participante) {
        participantes.add(participante);
        System.out.println("Participante adicionado: " + participante.getNome());
    }

    public void listarPalestras() {
        System.out.println("\n--- Palestras do Evento " + nome + " ---");
        for (Palestra palestra : palestras) {
            palestra.detalhes();
        }
    }

    public void listarParticipantes() {
        System.out.println("\n--- Participantes do Evento " + nome + " ---");
        for (Participante participante : participantes) {
            participante.apresentar();
        }
    }
}
