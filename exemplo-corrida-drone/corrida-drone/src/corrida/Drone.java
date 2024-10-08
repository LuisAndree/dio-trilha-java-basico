package corrida;

public abstract class Drone {
    private String modelo;
    private int velocidadeMaxima; 
    private int autonomia; 

    public Drone(String modelo, int velocidadeMaxima, int autonomia) {
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.autonomia = autonomia;
    }

    public abstract void realizarManobra();

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public int getAutonomia() {
        return autonomia;
    }
}
