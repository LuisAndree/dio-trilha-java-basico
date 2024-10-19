package setinterface.cadastro;

import java.util.Objects;

public class PessoaFisica {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private Contato contato;

    public PessoaFisica(String nome, String cpf, Endereco endereco, Contato contato) {
        if (!ValidadorCPF.validar(cpf)) {
            throw new IllegalArgumentException("CPF inválido!");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return contato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaFisica that = (PessoaFisica) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "Pessoa: " + nome + " (CPF: " + cpf + ")\n" +
                "Endereço: " + endereco + "\n" +
                "Contato: " + contato;
    }
}
