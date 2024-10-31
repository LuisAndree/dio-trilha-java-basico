package list.cursos;

public class Main {
    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();

        instituicao.getCadastroDeCursos().adicionarCurso(new Curso("Java Avançado", "JAV101", 60));
        instituicao.getCadastroDeCursos().adicionarCurso(new Curso("Banco de Dados", "DB102", 45));

        instituicao.getCadastroDeAlunos().adicionarAluno(new Aluno("Lucas Silva", "2023001"));
        instituicao.getCadastroDeAlunos().adicionarAluno(new Aluno("Maria Oliveira", "2023002"));

        System.out.println("Cursos Disponíveis:");
        instituicao.getCadastroDeCursos().listarCursos();

        System.out.println("\nAlunos Cadastrados:");
        instituicao.getCadastroDeAlunos().listarAlunos();

        System.out.println("\nRealizando Matrículas...");
        Aluno aluno1 = instituicao.getCadastroDeAlunos().buscarAlunoPorMatricula("2023001");
        Curso curso1 = instituicao.getCadastroDeCursos().buscarCursoPorCodigo("JAV101");
        instituicao.getRegistroDeMatriculas().registrarMatricula(aluno1, curso1);

        System.out.println("\nMatrículas Realizadas:");
        instituicao.getRegistroDeMatriculas().listarMatriculas();
    }
}
