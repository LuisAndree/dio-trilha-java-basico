package generics.biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Cliente cliente;
    private Funcionario funcionario;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Emprestimo(Livro livro, Cliente cliente, Funcionario funcionario, LocalDate dataInicio, LocalDate dataTermino) {
        this.livro = livro;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.livro.setDisponivel(false);
    }

    public Livro getLivro() {
        return livro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    @Override
    public String toString() {
        return "Empréstimo: " + livro + " para " + cliente + " até " + dataTermino;
    }
}
