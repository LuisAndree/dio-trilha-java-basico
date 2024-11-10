package list.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Exibicao {
    private String nome;
    private List<Animal> animaisExibidos;
    private Tratador tratadorResponsavel;

    public Exibicao(String nome, Tratador tratadorResponsavel) {
        this.nome = nome;
        this.tratadorResponsavel = tratadorResponsavel;
        this.animaisExibidos = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animaisExibidos.add(animal);
    }

    public List<Animal> getAnimaisExibidos() {
        return animaisExibidos;
    }

    public Tratador getTratadorResponsavel() {
        return tratadorResponsavel;
    }

    public void exibirAnimais() {
        System.out.println("Exibição: " + nome);
        animaisExibidos.forEach(System.out::println);
        System.out.println("Tratador responsável: " + tratadorResponsavel.getNome());
    }
}
