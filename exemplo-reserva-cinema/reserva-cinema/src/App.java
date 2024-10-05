public class App {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Senhor dos Anéis", "Fantasia", 180);

        Sala sala1 = new Sala(1, 200);

        Cliente cliente1 = new Cliente("Luis", "123.456.789-00");

        Reserva reserva1 = new Reserva(cliente1, filme1, sala1);
        reserva1.realizarReserva();

        filme1.exibirInformacoes();
        sala1.exibirInformacoes();

        reserva1.cancelarReserva();
    }
}
