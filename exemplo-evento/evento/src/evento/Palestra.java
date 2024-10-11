package evento;

public class Palestra {
    private String titulo;
    private Palestrante palestrante;
    private String horario;

    public Palestra(String titulo, Palestrante palestrante, String horario) {
        this.titulo = titulo;
        this.palestrante = palestrante;
        this.horario = horario;
    }
    public String getTitulo() {
        return titulo;
    }

    public void detalhes() {
        System.out.println("Palestra: " + titulo + ", Palestrante: " + palestrante.getNome() + ", Horário: " + horario);
    }
}
