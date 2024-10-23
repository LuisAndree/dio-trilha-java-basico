package mapinterface.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    private String nome;
    private String cpf;
    private List<Livro> livrosEmprestados;

    public Membro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "Membro: " + nome + " - CPF: " + cpf;
    }
}
