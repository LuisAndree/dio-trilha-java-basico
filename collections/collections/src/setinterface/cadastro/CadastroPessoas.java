package setinterface.cadastro;

import java.util.HashSet;
import java.util.Set;

public class CadastroPessoas {
    private Set<PessoaFisica> pessoas;

    public CadastroPessoas() {
        this.pessoas = new HashSet<>();
    }

    public void adicionarPessoa(PessoaFisica pessoa) {
        if (pessoas.add(pessoa)) {
            System.out.println("Pessoa cadastrada: " + pessoa.getNome());
        } else {
            System.out.println("CPF já cadastrado: " + pessoa.getCpf());
        }
    }

    public void listarPessoas() {
        System.out.println("\nPessoas cadastradas:");
        for (PessoaFisica pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
