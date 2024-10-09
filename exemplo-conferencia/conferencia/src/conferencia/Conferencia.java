package conferencia;

import java.util.ArrayList;
import java.util.List;

public class Conferencia {
    private String nome;
    private List<Palestrante> palestrantes;

    public Conferencia(String nome) {
        this.nome = nome;
        this.palestrantes = new ArrayList<>();
    }

    public void adicionarPalestrante(Palestrante palestrante) {
        palestrantes.add(palestrante);
        System.out.println("Palestrante " + palestrante.getNome() + " adicionado.");
    }

    public void realizarConferencia() {
        System.out.println("Conferência " + nome + " iniciada!");
        for (Palestrante palestrante : palestrantes) {
            palestrante.palestrar();
        }
    }
}
