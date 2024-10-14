package list.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell", "123456789");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "987654321");

        Membro membro1 = new Membro("João", "M001");

        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.listarLivros();

        RegistroMembros registro = new RegistroMembros();
        registro.adicionarMembro(membro1);
        registro.listarMembros();

        List<Livro> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add(livro1);

        Emprestimo emprestimo = new Emprestimo(membro1, livrosEmprestados);
        emprestimo.mostrarDetalhesEmprestimo();
    }
}
