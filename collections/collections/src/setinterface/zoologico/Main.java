package setinterface.zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        Animal leao = new Mamifero("Simba", 5, "Leão");
        Animal elefante = new Mamifero("Dumbo", 10, "Elefante");
        Animal arara = new Ave("Azul", 3, "Arara Azul");
        Animal cobra = new Reptil("Kaa", 7, "Cobra Píton");

        Cuidador cuidador1 = new Cuidador("Carlos", 8);
        Cuidador cuidador2 = new Cuidador("Mariana", 5);

        zoologico.adicionarAnimal(leao);
        zoologico.adicionarAnimal(elefante);
        zoologico.adicionarAnimal(arara);
        zoologico.adicionarAnimal(cobra);
        zoologico.adicionarAnimal(leao); 

        zoologico.adicionarCuidador(cuidador1);
        zoologico.adicionarCuidador(cuidador2);
        zoologico.adicionarCuidador(cuidador1); 

        zoologico.listarAnimais();
        zoologico.listarCuidadores();

        System.out.println("\n🔊 Sons dos animais:");
        leao.emitirSom();
        arara.emitirSom();
        cobra.emitirSom();

        zoologico.removerAnimal("Dumbo");
        zoologico.listarAnimais();
    }
}
