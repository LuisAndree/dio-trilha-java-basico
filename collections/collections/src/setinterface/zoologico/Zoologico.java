package setinterface.zoologico;

import java.util.HashSet;
import java.util.Set;

public class Zoologico {
    private Set<Animal> animais;
    private Set<Cuidador> cuidadores;

    public Zoologico() {
        this.animais = new HashSet<>();
        this.cuidadores = new HashSet<>();
    }

    public void adicionarAnimal(Animal animal) {
        if (animais.add(animal)) {
            System.out.println(animal.getNome() + " foi adicionado ao zoológico.");
        } else {
            System.out.println("⚠ O animal " + animal.getNome() + " já está no zoológico.");
        }
    }

    public void removerAnimal(String nome) {
        animais.removeIf(animal -> animal.getNome().equalsIgnoreCase(nome));
    }

    public void listarAnimais() {
        System.out.println("\n🐾 Animais no Zoológico:");
        animais.forEach(System.out::println);
    }

    public void adicionarCuidador(Cuidador cuidador) {
        if (cuidadores.add(cuidador)) {
            System.out.println(cuidador.getNome() + " foi adicionado como cuidador.");
        } else {
            System.out.println("⚠ O cuidador " + cuidador.getNome() + " já está registrado.");
        }
    }

    public void listarCuidadores() {
        System.out.println("\n👨‍🌾 Cuidadores do Zoológico:");
        cuidadores.forEach(System.out::println);
    }
}

