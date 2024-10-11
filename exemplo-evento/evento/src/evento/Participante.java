package evento;

public class Participante extends Pessoa {
    public Participante(String nome, String email) {
        super(nome, email);
    }

    @Override
    public void apresentar() {
        System.out.println("Participante: " + getNome() + ", Email: " + getEmail());
    }
}
