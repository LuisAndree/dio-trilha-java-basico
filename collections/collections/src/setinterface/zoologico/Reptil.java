package setinterface.zoologico;

public class Reptil extends Animal {
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som de réptil!");
    }
}

