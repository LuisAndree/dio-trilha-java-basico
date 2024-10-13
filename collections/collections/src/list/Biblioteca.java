package list;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.remove(livro);
    }

    public void listarLivros() {
        System.out.println("\nLivros na Biblioteca " + nome + ":");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
