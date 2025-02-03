package list.consultorioodontologico;

import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Dentista dentista;
    private LocalDateTime dataHora;
    private String descricao;

    public Consulta(Paciente paciente, Dentista dentista, LocalDateTime dataHora, String descricao) {
        this.paciente = paciente;
        this.dentista = dentista;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "🦷 Consulta: " + dataHora +
                "\n👤 Paciente: " + paciente.getNome() +
                "\n👨‍⚕️ Dentista: " + dentista.getNome() +
                "\n📋 Descrição: " + descricao;
    }
}
