package setinterface.zoologico;

public class Ave extends Animal {
    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " canta alegremente!");
    }
}

