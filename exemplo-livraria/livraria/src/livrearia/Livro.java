package livrearia;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private double preco;
    private int estoque;

    public Livro(String titulo, String autor, String isbn, double preco, int estoque) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
        this.estoque = estoque;
    }

    public boolean verificarEstoque() {
        return estoque > 0;
    }

    public void reduzirEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        }
    }

    public String getAutor() {
        return autor;
    }
    public int getEstoque() {
        return estoque;
    }
    public String getIsbn() {
        return isbn;
    }
    public double getPreco() {
        return preco;
    }
    public String getTitulo() {
        return titulo;
    }
}
