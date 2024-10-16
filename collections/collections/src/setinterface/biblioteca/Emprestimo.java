package setinterface.biblioteca;

public class Emprestimo {
    private Membro membro;
    private Livro livro;

    public Emprestimo(Membro membro, Livro livro) {
        this.membro = membro;
        this.livro = livro;
    }

    public void realizarEmprestimo() {
        System.out.println("\nEmpréstimo realizado:");
        System.out.println("Membro: " + membro.getNome() + " emprestou o livro: " + livro.getTitulo());
    }
}
