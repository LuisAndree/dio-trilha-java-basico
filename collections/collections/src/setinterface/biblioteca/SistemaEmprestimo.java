package setinterface.biblioteca;

import java.util.HashSet;
import java.util.Set;

public class SistemaEmprestimo {
    private Set<Membro> membros;

    public SistemaEmprestimo() {
        this.membros = new HashSet<>();
    }

    public void adicionarMembro(Membro membro) {
        if (membros.add(membro)) {
            System.out.println("Membro adicionado: " + membro.getNome());
        } else {
            System.out.println("Membro já cadastrado: " + membro.getNome());
        }
    }

    public void listarMembros() {
        System.out.println("\nMembros cadastrados:");
        for (Membro membro : membros) {
            System.out.println(membro);
        }
    }
}
