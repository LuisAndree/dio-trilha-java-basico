package mapinterface.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros;
    private List<Membro> membros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.membros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarMembro(Membro membro) {
        membros.add(membro);
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.isDisponivel()) {
                return livro;
            }
        }
        return null;
    }

    public Membro buscarMembroPorCpf(String cpf) {
        for (Membro membro : membros) {
            if (membro.getCpf().equals(cpf)) {
                return membro;
            }
        }
        return null;
    }

    public Emprestimo realizarEmprestimo(String tituloLivro, String cpfMembro) {
        Livro livro = buscarLivroPorTitulo(tituloLivro);
        Membro membro = buscarMembroPorCpf(cpfMembro);
        
        if (livro != null && membro != null) {
            return new Emprestimo(livro, membro);
        } else {
            System.out.println("Empréstimo não pode ser realizado.");
            return null;
        }
    }

    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void listarMembros() {
        for (Membro membro : membros) {
            System.out.println(membro);
        }
    }
}
