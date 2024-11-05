package mapinterface.conferencia;

import java.time.LocalDateTime;

public class Reserva {
    private LocalDateTime horario;
    private Funcionario funcionario;

    public Reserva(LocalDateTime horario, Funcionario funcionario) {
        this.horario = horario;
        this.funcionario = funcionario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        return "Reserva [Horário: " + horario + ", Funcionario: " + funcionario.getNome() + "]";
    }
}
