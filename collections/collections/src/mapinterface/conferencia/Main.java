package mapinterface.conferencia;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        SalaConferencia sala1 = new SalaConferencia("101", 50);
        SalaConferencia sala2 = new SalaConferencia("202", 30);

        Funcionario alice = new Funcionario("Alice", "F001");
        Funcionario bob = new Funcionario("Bob", "F002");

        SistemaReservaSalas sistema = new SistemaReservaSalas();

        sistema.adicionarReserva(sala1, LocalDateTime.of(2024, 10, 12, 10, 0), alice);
        sistema.adicionarReserva(sala1, LocalDateTime.of(2024, 10, 12, 14, 0), bob);
        sistema.adicionarReserva(sala2, LocalDateTime.of(2024, 10, 13, 9, 0), alice);

        System.out.println("\nReservas da Sala 101:");
        sistema.listarReservas(sala1);

        System.out.println("\nReservas da Sala 202:");
        sistema.listarReservas(sala2);

        System.out.println("\nTodas as Reservas:");
        sistema.listarTodasReservas();
    }
}
