package list.consultorioodontologico;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();

        Paciente paciente1 = new Paciente("Carlos Silva", "123.456.789-00", 30);
        Paciente paciente2 = new Paciente("Ana Souza", "987.654.321-00", 25);

        Dentista dentista1 = new Dentista("Dr. João Pereira", "CRO-12345", "Ortodontia");
        Dentista dentista2 = new Dentista("Dra. Mariana Lopes", "CRO-67890", "Endodontia");

        consultorio.adicionarPaciente(paciente1);
        consultorio.adicionarPaciente(paciente2);
        consultorio.adicionarDentista(dentista1);
        consultorio.adicionarDentista(dentista2);

        Consulta consulta1 = new Consulta(paciente1, dentista1, LocalDateTime.of(2024, 3, 12, 14, 0), "Aparelho ortodôntico");
        Consulta consulta2 = new Consulta(paciente2, dentista2, LocalDateTime.of(2024, 3, 15, 10, 30), "Canal dentário");

        consultorio.agendarConsulta(consulta1);
        consultorio.agendarConsulta(consulta2);

        consultorio.listarPacientes();
        consultorio.listarDentistas();
        consultorio.listarConsultas();
    }
}
