package setinterface.cursos;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", "20231001");
        Aluno aluno2 = new Aluno("José", "20231002");
        Aluno aluno3 = new Aluno("Maria", "20231001"); 

        Curso curso1 = new Curso("Java para Iniciantes");
        Curso curso2 = new Curso("Desenvolvimento Web");

        Plataforma plataforma = new Plataforma("EduTech");
        plataforma.adicionarCurso(curso1);
        plataforma.adicionarCurso(curso2);

        plataforma.listarCursos();

        Inscricao inscricao1 = new Inscricao(aluno1, curso1);
        inscricao1.realizarInscricao();

        Inscricao inscricao2 = new Inscricao(aluno2, curso1);
        inscricao2.realizarInscricao();

        Inscricao inscricao3 = new Inscricao(aluno3, curso1); 
        inscricao3.realizarInscricao();

        curso1.listarAlunos();
    }
}
