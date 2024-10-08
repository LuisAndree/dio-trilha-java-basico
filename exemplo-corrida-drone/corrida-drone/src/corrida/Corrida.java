package corrida;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private String local;
    private List<Piloto> pilotos;
    private List<Drone> drones;

    public Corrida(String local) {
        this.local = local;
        this.pilotos = new ArrayList<>();
        this.drones = new ArrayList<>();
    }

    public void adicionarPiloto(Piloto piloto) {
        pilotos.add(piloto);
        System.out.println("Piloto " + piloto.getNome() + " adicionado à corrida.");
    }

    public void adicionarDrone(Drone drone) {
        drones.add(drone);
        System.out.println("Drone " + drone.getModelo() + " adicionado à corrida.");
    }

    public void iniciarCorrida() {
        System.out.println("Corrida no local " + local + " iniciada!");
        for (Drone drone : drones) {
            drone.realizarManobra();
        }
    }
}
