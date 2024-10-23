package mapinterface.biblioteca;

public class Livro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private boolean disponivel;

    public Livro(String titulo, String isbn, Autor autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.disponivel = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " - ISBN: " + isbn + " - Autor: " + autor.getNome();
    }
}
