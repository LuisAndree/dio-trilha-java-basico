package mapinterface.biblioteca;

public class Emprestimo {
    private Livro livro;
    private Membro membro;

    public Emprestimo(Livro livro, Membro membro) {
        this.livro = livro;
        this.membro = membro;
        livro.setDisponivel(false);
        membro.adicionarLivro(livro);
    }

    public void devolverLivro() {
        livro.setDisponivel(true);
        membro.removerLivro(livro);
        System.out.println("Livro " + livro.getTitulo() + " devolvido por " + membro.getNome());
    }

    @Override
    public String toString() {
        return "Emprestimo: Livro [" + livro.getTitulo() + "] - Membro [" + membro.getNome() + "]";
    }
}
