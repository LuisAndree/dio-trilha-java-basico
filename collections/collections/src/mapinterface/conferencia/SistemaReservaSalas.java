package mapinterface.conferencia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaReservaSalas {
    private Map<SalaConferencia, List<Reserva>> reservas = new HashMap<>();

    public void adicionarReserva(SalaConferencia sala, LocalDateTime horario, Funcionario funcionario) {
        Reserva reserva = new Reserva(horario, funcionario);
        reservas.computeIfAbsent(sala, k -> new ArrayList<>()).add(reserva);
        System.out.println("Reserva adicionada para " + funcionario.getNome() + " na " + sala.getNumero() + " às " + horario);
    }

    public void listarReservas(SalaConferencia sala) {
        System.out.println("Reservas para a sala " + sala.getNumero() + ":");
        List<Reserva> listaReservas = reservas.get(sala);
        if (listaReservas != null) {
            listaReservas.forEach(System.out::println);
        } else {
            System.out.println("Nenhuma reserva encontrada.");
        }
    }

    public void listarTodasReservas() {
        System.out.println("Todas as Reservas:");
        for (Map.Entry<SalaConferencia, List<Reserva>> entrada : reservas.entrySet()) {
            System.out.println(entrada.getKey().toString() + ":");
            entrada.getValue().forEach(System.out::println);
        }
    }
}
