package setinterface.cursos;

public class Inscricao {
    private Aluno aluno;
    private Curso curso;

    public Inscricao(Aluno aluno, Curso curso) {
        this.aluno = aluno;
        this.curso = curso;
    }

    public void realizarInscricao() {
        System.out.println("\nInscrição realizada:");
        System.out.println("Aluno: " + aluno.getNome() + " se inscreveu no curso: " + curso.getNome());
        curso.adicionarAluno(aluno);
    }
}
