package mapinterface.biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Autor autor1 = new Autor("J.K. Rowling", "Reino Unido");
        Autor autor2 = new Autor("George R.R. Martin", "EUA");

        Livro livro1 = new Livro("Harry Potter e a Pedra Filosofal", "1234567890", autor1);
        Livro livro2 = new Livro("Game of Thrones", "0987654321", autor2);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        Membro membro1 = new Membro("Carlos Silva", "111.222.333-44");
        Membro membro2 = new Membro("Maria Oliveira", "555.666.777-88");

        biblioteca.cadastrarMembro(membro1);
        biblioteca.cadastrarMembro(membro2);

        Emprestimo emprestimo1 = biblioteca.realizarEmprestimo("Harry Potter e a Pedra Filosofal", "111.222.333-44");
        if (emprestimo1 != null) {
            System.out.println(emprestimo1);
        }

        System.out.println("\nLivros disponíveis:");
        biblioteca.listarLivros();

        if (emprestimo1 != null) {
            emprestimo1.devolverLivro();
        }

        System.out.println("\nMembros cadastrados:");
        biblioteca.listarMembros();
    }
}
