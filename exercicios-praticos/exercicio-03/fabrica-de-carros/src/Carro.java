public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    Motor motor;

    public Carro() {
        this.motor = new Motor();
    }

    void liga() {
        System.out.println("O carro esta ligado");
    }

    void acelera(double quantia) {
        double velocidadeNova = this.velocidadeAtual + quantia;
        this.velocidadeAtual = velocidadeNova;
    }

    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
}
