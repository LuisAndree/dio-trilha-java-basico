package list.eventoesportivo;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private String nome;
    private List<Partida> partidas;

    public Campeonato(String nome) {
        this.nome = nome;
        this.partidas = new ArrayList<>();
    }

    public void adicionarPartida(Partida partida) {
        partidas.add(partida);
    }

    public void listarPartidas() {
        System.out.println("\nPartidas do Campeonato " + nome + ":");
        for (Partida partida : partidas) {
            partida.mostrarDetalhes();
        }
    }
}
