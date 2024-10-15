package list.eventoesportivo;

public class Arbitro {
    private String nome;
    private int experiencia;

    public Arbitro(String nome, int experiencia) {
        this.nome = nome;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return "Árbitro: " + nome + " (Experiência: " + experiencia + " anos)";
    }
}
