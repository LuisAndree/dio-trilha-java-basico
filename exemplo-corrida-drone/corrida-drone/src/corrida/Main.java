package corrida;

public class Main {
    public static void main(String[] args) {
        Piloto piloto1 = new Piloto("Luis", 5);
        Piloto piloto2 = new Piloto("Ana", 3);

        DroneCorrida drone1 = new DroneCorrida("Phantom X", 120, 30);
        DroneFreestyle drone2 = new DroneFreestyle("Racer Y", 80, 40);

        Corrida corrida = new Corrida("Deserto");
        corrida.adicionarPiloto(piloto1);
        corrida.adicionarPiloto(piloto2);

        corrida.adicionarDrone(drone1);
        corrida.adicionarDrone(drone2);

        corrida.iniciarCorrida();

        ResultadoCorrida resultado1 = new ResultadoCorrida(piloto1, 360);
        resultado1.exibirResultado();
    }
}

