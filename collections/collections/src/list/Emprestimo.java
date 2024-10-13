package list;

import java.util.List;

public class Emprestimo {
    private Membro membro;
    private List<Livro> livrosEmprestados;

    public Emprestimo(Membro membro, List<Livro> livrosEmprestados) {
        this.membro = membro;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void mostrarDetalhesEmprestimo() {
        System.out.println("\nEmpréstimo do Membro: " + membro.getNome());
        for (Livro livro : livrosEmprestados) {
            System.out.println(livro);
        }
    }
}
