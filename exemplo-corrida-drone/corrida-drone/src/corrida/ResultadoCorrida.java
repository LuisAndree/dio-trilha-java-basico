package corrida;

public class ResultadoCorrida {
    private Piloto piloto;
    private int tempoFinal; 

    public ResultadoCorrida(Piloto piloto, int tempoFinal) {
        this.piloto = piloto;
        this.tempoFinal = tempoFinal;
    }

    public void exibirResultado() {
        System.out.println("Piloto: " + piloto.getNome() + " | Tempo final: " + tempoFinal + " segundos");
    }
}
