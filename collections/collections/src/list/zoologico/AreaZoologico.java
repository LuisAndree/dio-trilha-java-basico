package list.zoologico;

import java.util.ArrayList;
import java.util.List;

public class AreaZoologico {
    private String nome;
    private List<Animal> animais;

    public AreaZoologico(String nome) {
        this.nome = nome;
        this.animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public List<Animal> getAnimais() {
        return animais;
    }

    public void listarAnimais() {
        animais.forEach(System.out::println);
    }
}
