package mapinterface.matriculas;

public class Professor {
    private String nome;
    private String especializacao;
    private String cpf;

    public Professor(String nome, String especializacao, String cpf) {
        this.nome = nome;
        this.especializacao = especializacao;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " - Especialização: " + especializacao + " - CPF: " + cpf;
    }
}
