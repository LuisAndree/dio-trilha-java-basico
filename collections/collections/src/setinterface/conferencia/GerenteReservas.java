package setinterface.conferencia;

import java.util.HashSet;
import java.util.Set;

public class GerenteReservas {
    private Set<Reserva> reservas = new HashSet<>();

    public boolean adicionarReserva(Reserva reserva) {
        for (Reserva r : reservas) {
            if (r.getSala().equals(reserva.getSala()) && r.getHorario().equals(reserva.getHorario())) {
                System.out.println("Horário já reservado para a sala: " + reserva.getSala().getIdentificador());
                return false;
            }
        }
        reservas.add(reserva);
        System.out.println("Reserva realizada para: " + reserva.getCliente().getNome());
        return true;
    }

    public void listarReservas() {
        reservas.forEach(System.out::println);
    }
}
