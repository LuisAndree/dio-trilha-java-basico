package banco;

import pessoafisica.ValidaCpf;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = validaCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void updateCpf(String cpf) {
        validaCpf(cpf);
        this.cpf = cpf;
    }

    private String validaCpf(String cpf) {
        ValidaCpf validaCpf = new ValidaCpf(cpf);
        if (validaCpf.valida()) {
            return cpf;
        } else {
            return "CPF invalido";
        }
    }

    @Override
    public String toString() {
        return "Cliente [\nnome: " + nome + " " + sobrenome + "\ncpf: " + cpf + "\n]";
    }
}
