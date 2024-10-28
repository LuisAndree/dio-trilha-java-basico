package generics.biblioteca;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca biblioteca = new SistemaBiblioteca();

        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        biblioteca.getCatalogo().adicionarLivro(livro1);
        biblioteca.getCatalogo().adicionarLivro(livro2);

        Cliente cliente = new Cliente("Alice", "12345678900");
        Funcionario funcionario = new Funcionario("Carlos", "ID123");

        biblioteca.registrarEmprestimo(livro1, cliente, funcionario, LocalDate.of(2024, 10, 10), LocalDate.of(2024, 10, 24));

        System.out.println("Livros disponíveis:");
        biblioteca.getCatalogo().listarLivrosDisponiveis().forEach(System.out::println);

        System.out.println("\nEmpréstimos Ativos:");
        biblioteca.listarEmprestimosAtivos(LocalDate.of(2024, 10, 15)).forEach(System.out::println);
    }
}
