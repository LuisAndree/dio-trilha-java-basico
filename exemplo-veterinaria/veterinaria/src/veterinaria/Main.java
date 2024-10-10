package veterinaria;

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de animais
        Cachorro cachorro = new Cachorro("Rex", 5);
        Gato gato = new Gato("Mia", 3);
        Passaro passaro = new Passaro("Piu", 2);

        Veterinario veterinario = new Veterinario();

        veterinario.adicionarAnimal(cachorro);
        veterinario.adicionarAnimal(gato);
        veterinario.adicionarAnimal(passaro);

        veterinario.realizarConsulta();

        passaro.voar();
    }
}

