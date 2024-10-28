package generics.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaBiblioteca {
    private Catalogo catalogo;
    private List<Emprestimo> emprestimos;

    public SistemaBiblioteca() {
        this.catalogo = new Catalogo();
        this.emprestimos = new ArrayList<>();
    }

    public void registrarEmprestimo(Livro livro, Cliente cliente, Funcionario funcionario, LocalDate dataInicio, LocalDate dataTermino) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, cliente, funcionario, dataInicio, dataTermino);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo registrado com sucesso para o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro " + livro.getTitulo() + " não está disponível para empréstimo.");
        }
    }

    public List<Emprestimo> listarEmprestimosAtivos(LocalDate dataAtual) {
        List<Emprestimo> ativos = new ArrayList<>();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataTermino().isAfter(dataAtual)) {
                ativos.add(emprestimo);
            }
        }
        return ativos;
    }

    public Catalogo getCatalogo() {
        return catalogo;
    }
}
