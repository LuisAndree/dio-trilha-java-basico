package setinterface.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class Biblioteca {
    private Set<Livro> livros;

    public Biblioteca() {
        this.livros = new HashSet<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livros.add(livro)) {
            System.out.println("Livro adicionado: " + livro.getTitulo());
        } else {
            System.out.println("Livro já está na biblioteca: " + livro.getTitulo());
        }
    }

    public void listarLivros() {
        System.out.println("\nLivros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
