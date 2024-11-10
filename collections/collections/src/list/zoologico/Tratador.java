package list.zoologico;

import java.util.ArrayList;
import java.util.List;

public class Tratador {
    private String nome;
    private List<Animal> animaisResponsaveis;

    public Tratador(String nome) {
        this.nome = nome;
        this.animaisResponsaveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAnimal(Animal animal) {
        animaisResponsaveis.add(animal);
    }

    public List<Animal> getAnimaisResponsaveis() {
        return animaisResponsaveis;
    }

    public void listarAnimais() {
        animaisResponsaveis.forEach(System.out::println);
    }
}
