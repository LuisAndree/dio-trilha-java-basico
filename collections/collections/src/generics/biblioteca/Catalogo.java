package generics.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> livros;

    public Catalogo() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    @Override
    public String toString() {
        return "Catálogo de Livros: " + livros.size() + " livros no total";
    }
}
