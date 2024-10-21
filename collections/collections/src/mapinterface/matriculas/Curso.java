package mapinterface.matriculas;

public class Curso {
    private String nome;
    private int duracao; 
    private Professor professorResponsavel; 

    public Curso(String nome, int duracao, Professor professorResponsavel) {
        this.nome = nome;
        this.duracao = duracao;
        this.professorResponsavel = professorResponsavel;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    @Override
    public String toString() {
        return nome + " - Duração: " + duracao + " semestres - " + professorResponsavel;
    }
}
