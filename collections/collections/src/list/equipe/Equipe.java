package list.equipe;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Desenvolvedor> desenvolvedores;

    public Equipe(String nome) {
        this.nome = nome;
        this.desenvolvedores = new ArrayList<>();
    }

    public void adicionarDesenvolvedor(Desenvolvedor dev) {
        desenvolvedores.add(dev);
    }

    public void listarEquipe() {
        System.out.println("\nEquipe: " + nome);
        for (Desenvolvedor dev : desenvolvedores) {
            System.out.println(dev);
        }
    }
}
