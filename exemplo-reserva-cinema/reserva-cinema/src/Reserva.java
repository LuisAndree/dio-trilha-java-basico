public class Reserva {
    private Cliente cliente;
    private Filme filme;
    private Sala sala;
    private boolean ativa;

    public Reserva(Cliente cliente, Filme filme, Sala sala) {
        this.cliente = cliente;
        this.filme = filme;
        this.sala = sala;
        this.ativa = true;
    }

    public void realizarReserva() {
        System.out.println("Reserva realizada para " + cliente.getNome() + " no filme " + filme.getTitulo() + " na sala " + sala.getNumeroSala());
        this.ativa = true;
    }

    public void cancelarReserva() {
        if (ativa) {
            System.out.println("Reserva cancelada para " + cliente.getNome() + " no filme " + filme.getTitulo());
            this.ativa = false;
        } else {
            System.out.println("Reserva já foi cancelada.");
        }
    }
}
