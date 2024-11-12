package generics.midias;

public class Livro extends Midia {
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Páginas: " + numeroPaginas;
    }
}
