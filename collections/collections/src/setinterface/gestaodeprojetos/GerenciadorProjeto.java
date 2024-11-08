package setinterface.gestaodeprojetos;

import java.util.HashSet;
import java.util.Set;

public class GerenciadorProjeto {
    private Set<Projeto> projetos;

    public GerenciadorProjeto() {
        this.projetos = new HashSet<>();
    }

    public boolean adicionarProjeto(Projeto projeto) {
        return projetos.add(projeto);
    }

    public void listarProjetos() {
        projetos.forEach(System.out::println);
    }

    public Set<Projeto> getProjetos() {
        return projetos;
    }
}
