public class SmartTv {
    boolean estado;
    int volume = 10;
    int canal = 12;

    public void ligar() {
        estado = true;
    }

    public void desligar() {
        estado = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }
}
