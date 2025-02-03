package list.consultorioodontologico;

import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private List<Paciente> pacientes;
    private List<Dentista> dentistas;
    private List<Consulta> consultas;

    public Consultorio() {
        this.pacientes = new ArrayList<>();
        this.dentistas = new ArrayList<>();
        this.consultas = new ArrayList<>();
    }

    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void adicionarDentista(Dentista dentista) {
        dentistas.add(dentista);
    }

    public void agendarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listarPacientes() {
        System.out.println("\n📋 Lista de Pacientes:");
        pacientes.forEach(System.out::println);
    }

    public void listarDentistas() {
        System.out.println("\n📋 Lista de Dentistas:");
        dentistas.forEach(System.out::println);
    }

    public void listarConsultas() {
        System.out.println("\n📅 Lista de Consultas Agendadas:");
        consultas.forEach(System.out::println);
    }
}
