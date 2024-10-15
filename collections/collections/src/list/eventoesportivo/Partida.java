package list.eventoesportivo;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private String data;
    private String local;
    private List<Time> times;

    public Partida(String data, String local) {
        this.data = data;
        this.local = local;
        this.times = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        if (times.size() < 2) {
            times.add(time);
        } else {
            System.out.println("A partida já tem dois times.");
        }
    }

    public void mostrarDetalhes() {
        System.out.println("\nPartida no local: " + local + " em " + data);
        for (Time time : times) {
            System.out.println("Time: " + time.getNome());
        }
    }
}
