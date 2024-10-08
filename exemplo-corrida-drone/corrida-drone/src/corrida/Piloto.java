package corrida;

public class Piloto {
    private String nome;
    private int experiencia; 

    public Piloto(String nome, int experiencia) {
        this.nome = nome;
        this.experiencia = experiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getExperiencia() {
        return experiencia;
    }
}
