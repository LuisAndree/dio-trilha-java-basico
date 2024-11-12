package generics.midias;

public class Filme extends Midia {
    private int duracaoMinutos;

    public Filme(String titulo, String autor, int duracaoMinutos) {
        super(titulo, autor);
        this.duracaoMinutos = duracaoMinutos;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    @Override
    public String toString() {
        return super.toString() + " | Duração: " + duracaoMinutos + " minutos";
    }
}
