package generics.midias;

public class Main {
    public static void main(String[] args) {
        GestorDeMidias gestor = new GestorDeMidias();

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
        Livro livro2 = new Livro("1984", "George Orwell", 328);
        gestor.getBibliotecaLivros().adicionarMidia(livro1);
        gestor.getBibliotecaLivros().adicionarMidia(livro2);

        Filme filme1 = new Filme("Inception", "Christopher Nolan", 148);
        Filme filme2 = new Filme("Interstellar", "Christopher Nolan", 169);
        gestor.getBibliotecaFilmes().adicionarMidia(filme1);
        gestor.getBibliotecaFilmes().adicionarMidia(filme2);

        Musica musica1 = new Musica("Bohemian Rhapsody", "Queen", "Rock");
        Musica musica2 = new Musica("Billie Jean", "Michael Jackson", "Pop");
        gestor.getBibliotecaMusicas().adicionarMidia(musica1);
        gestor.getBibliotecaMusicas().adicionarMidia(musica2);

        System.out.println("Biblioteca de Livros:");
        gestor.getBibliotecaLivros().listarMidias();

        System.out.println("\nBiblioteca de Filmes:");
        gestor.getBibliotecaFilmes().listarMidias();

        System.out.println("\nBiblioteca de Músicas:");
        gestor.getBibliotecaMusicas().listarMidias();
    }
}
