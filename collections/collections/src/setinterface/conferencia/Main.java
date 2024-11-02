package setinterface.conferencia;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        GerenteSalas gerenteSalas = new GerenteSalas();
        GerenteReservas gerenteReservas = new GerenteReservas();

        Sala sala1 = new Sala("A101", 50);
        Sala sala2 = new Sala("B202", 30);
        gerenteSalas.adicionarSala(sala1);
        gerenteSalas.adicionarSala(sala2);

        Cliente cliente1 = new Cliente("João Silva", "11122233344");
        Cliente cliente2 = new Cliente("Maria Oliveira", "55566677788");

        Reserva reserva1 = new Reserva(sala1, cliente1, LocalDateTime.of(2024, 10, 20, 10, 0));
        Reserva reserva2 = new Reserva(sala1, cliente2, LocalDateTime.of(2024, 10, 20, 10, 0)); 

        gerenteReservas.adicionarReserva(reserva1); 
        gerenteReservas.adicionarReserva(reserva2); 

        System.out.println("\nSalas Cadastradas:");
        gerenteSalas.listarSalas();

        System.out.println("\nReservas Realizadas:");
        gerenteReservas.listarReservas();
    }
}
