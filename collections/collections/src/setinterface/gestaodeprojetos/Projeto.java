package setinterface.gestaodeprojetos;

import java.util.HashSet;
import java.util.Set;

public class Projeto {
    private String codigo;
    private String nome;
    private Set<MembroEquipe> membrosEquipe;

    public Projeto(String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.membrosEquipe = new HashSet<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Set<MembroEquipe> getMembrosEquipe() {
        return membrosEquipe;
    }

    public boolean adicionarMembro(MembroEquipe membro) {
        return membrosEquipe.add(membro);
    }

    @Override
    public String toString() {
        return "Projeto [Código: " + codigo + ", Nome: " + nome + "]";
    }

    public Modulo[] getModulos() {
        throw new UnsupportedOperationException("Unimplemented method 'getModulos'");
    }
}
