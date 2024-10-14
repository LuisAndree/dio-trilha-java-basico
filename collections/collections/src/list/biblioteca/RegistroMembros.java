package list.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class RegistroMembros {
    private List<Membro> membros;

    public RegistroMembros() {
        this.membros = new ArrayList<>();
    }

    public void adicionarMembro(Membro membro) {
        membros.add(membro);
    }

    public void listarMembros() {
        System.out.println("\nMembros registrados:");
        for (Membro membro : membros) {
            System.out.println(membro);
        }
    }
}
