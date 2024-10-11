package evento;

public class Palestrante extends Pessoa {
    private String tema;

    public Palestrante(String nome, String email, String tema) {
        super(nome, email);
        this.tema = tema;
    }

    @Override
    public void apresentar() {
        System.out.println("Palestrante: " + getNome() + ", Email: " + getEmail() + ", Tema: " + tema);
    }
}
