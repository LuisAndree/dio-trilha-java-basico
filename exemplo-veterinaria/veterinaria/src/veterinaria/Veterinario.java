package veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private List<Animal> animais;

    public Veterinario() {
        this.animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
        System.out.println("Animal " + animal.getNome() + " adicionado.");
    }

    public void realizarConsulta() {
        for (Animal animal : animais) {
            System.out.println("Examinando o " + animal.getNome());
            animal.fazerSom();
        }
    }
}
