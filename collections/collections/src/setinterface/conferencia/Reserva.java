package setinterface.conferencia;

import java.time.LocalDateTime;

public class Reserva {
    private Sala sala;
    private Cliente cliente;
    private LocalDateTime horario;

    public Reserva(Sala sala, Cliente cliente, LocalDateTime horario) {
        this.sala = sala;
        this.cliente = cliente;
        this.horario = horario;
    }

    public Sala getSala() {
        return sala;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Reserva: " + sala.getIdentificador() + ", Cliente: " + cliente.getNome() + ", Horário: " + horario;
    }
}
