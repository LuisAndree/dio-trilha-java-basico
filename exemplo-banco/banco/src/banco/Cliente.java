package banco;

public class Cliente implements Autenticavel {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int senha;

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
    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso Permitido ao Ciente!");
            return true;
        } else {
            System.out.println("Acesso Negado ao Cliente!");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cliente [\nnome: " + nome + " " + sobrenome + "\ncpf: " + cpf + "\n]";
    }
}
