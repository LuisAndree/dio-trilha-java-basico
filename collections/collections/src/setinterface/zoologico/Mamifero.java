package setinterface.zoologico;

public class Mamifero extends Animal {
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " faz um som de mamífero!");
    }
}
