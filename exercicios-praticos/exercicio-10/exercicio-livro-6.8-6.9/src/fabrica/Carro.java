package fabrica;

public class Carro {
    private String modelo;
    private static Carro carro;

    private Carro() {
        this.modelo = "Fuscao preto invocado";
    }

    public static Carro getInstancia() {
        if (carro == null) {
            carro = new Carro(); 
        }
        return carro;
    }

    public void getCarro() {
        System.out.println(this.modelo);
    }

    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.getCarro();
    }
}
