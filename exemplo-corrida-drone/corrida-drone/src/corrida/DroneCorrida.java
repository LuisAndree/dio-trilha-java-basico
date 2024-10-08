package corrida;

public class DroneCorrida extends Drone {

    public DroneCorrida(String modelo, int velocidadeMaxima, int autonomia) {
        super(modelo, velocidadeMaxima, autonomia);
    }

    @Override
    public void realizarManobra() {
        System.out.println("O drone de corrida " + getModelo() + " está realizando uma manobra de alta velocidade!");
    }
}
