package generics.midias;

public class GestorDeMidias {
    private Biblioteca<Livro> bibliotecaLivros;
    private Biblioteca<Filme> bibliotecaFilmes;
    private Biblioteca<Musica> bibliotecaMusicas;

    public GestorDeMidias() {
        this.bibliotecaLivros = new Biblioteca<>();
        this.bibliotecaFilmes = new Biblioteca<>();
        this.bibliotecaMusicas = new Biblioteca<>();
    }

    public Biblioteca<Livro> getBibliotecaLivros() {
        return bibliotecaLivros;
    }

    public Biblioteca<Filme> getBibliotecaFilmes() {
        return bibliotecaFilmes;
    }

    public Biblioteca<Musica> getBibliotecaMusicas() {
        return bibliotecaMusicas;
    }
}
