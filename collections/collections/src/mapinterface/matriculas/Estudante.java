package mapinterface.matriculas;

public class Estudante {
    private String nome;
    private String cpf;
    private Curso curso;

    public Estudante(String nome, String cpf, Curso curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return nome + " - CPF: " + cpf + "\nCurso: " + curso;
    }
}

