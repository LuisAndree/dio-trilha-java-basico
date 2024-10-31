package list.cursos;

public class Instituicao {
    private CadastroDeAlunos cadastroDeAlunos;
    private CadastroDeCursos cadastroDeCursos;
    private RegistroDeMatriculas registroDeMatriculas;

    public Instituicao() {
        this.cadastroDeAlunos = new CadastroDeAlunos();
        this.cadastroDeCursos = new CadastroDeCursos();
        this.registroDeMatriculas = new RegistroDeMatriculas();
    }

    public CadastroDeAlunos getCadastroDeAlunos() {
        return cadastroDeAlunos;
    }

    public CadastroDeCursos getCadastroDeCursos() {
        return cadastroDeCursos;
    }

    public RegistroDeMatriculas getRegistroDeMatriculas() {
        return registroDeMatriculas;
    }
}
