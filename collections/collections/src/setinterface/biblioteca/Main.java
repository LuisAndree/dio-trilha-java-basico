package setinterface.biblioteca;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"); 

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3); 

        biblioteca.listarLivros();

        Membro membro1 = new Membro("Alice", 101);
        Membro membro2 = new Membro("Bob", 102);
        Membro membro3 = new Membro("Alice", 101); 

        SistemaEmprestimo sistema = new SistemaEmprestimo();
        sistema.adicionarMembro(membro1);
        sistema.adicionarMembro(membro2);
        sistema.adicionarMembro(membro3); 

        sistema.listarMembros();

        Emprestimo emprestimo = new Emprestimo(membro1, livro1);
        emprestimo.realizarEmprestimo();
    }
}
