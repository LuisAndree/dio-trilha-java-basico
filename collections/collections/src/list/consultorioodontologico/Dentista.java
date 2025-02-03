package list.consultorioodontologico;

public class Dentista {
    private String nome;
    private String cro; // Cadastro de Registro Odontológico
    private String especialidade;

    public Dentista(String nome, String cro, String especialidade) {
        this.nome = nome;
        this.cro = cro;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public String getCro() {
        return cro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    @Override
    public String toString() {
        return "Dentista: " + nome + " | CRO: " + cro + " | Especialidade: " + especialidade;
    }
}

