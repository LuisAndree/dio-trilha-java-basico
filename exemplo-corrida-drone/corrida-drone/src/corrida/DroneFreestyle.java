package corrida;

public class DroneFreestyle extends Drone {

    public DroneFreestyle(String modelo, int velocidadeMaxima, int autonomia) {
        super(modelo, velocidadeMaxima, autonomia);
    }

    @Override
    public void realizarManobra() {
        System.out.println("O drone freestyle " + getModelo() + " está fazendo acrobacias incríveis!");
    }
}
