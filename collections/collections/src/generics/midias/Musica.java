package generics.midias;

public class Musica extends Midia {
    private String genero;

    public Musica(String titulo, String autor, String genero) {
        super(titulo, autor);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return super.toString() + " | Gênero: " + genero;
    }
}
