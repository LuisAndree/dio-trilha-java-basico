package generics.veterinaria;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ClinicaVeterinaria<Cachorro> clinicaCachorros = new ClinicaVeterinaria<>();
        ClinicaVeterinaria<Gato> clinicaGatos = new ClinicaVeterinaria<>();
        ClinicaVeterinaria<Consulta> clinicaConsultas = new ClinicaVeterinaria<>();

        Veterinario vet1 = new Veterinario("Dr. João", "Dermatologia");
        Veterinario vet2 = new Veterinario("Dra. Ana", "Ortopedia");

        Cachorro cachorro1 = new Cachorro("Rex", 5, "Carlos", "Labrador");
        Cachorro cachorro2 = new Cachorro("Thor", 3, "Mariana", "Golden Retriever");
        Gato gato1 = new Gato("Mia", 2, "Paula", true);
        Gato gato2 = new Gato("Tom", 4, "Lucas", false);

        clinicaCachorros.adicionarRegistro(cachorro1);
        clinicaCachorros.adicionarRegistro(cachorro2);
        clinicaGatos.adicionarRegistro(gato1);
        clinicaGatos.adicionarRegistro(gato2);

        Consulta consulta1 = new Consulta(cachorro1, vet1, LocalDateTime.of(2024, 3, 10, 14, 30), "Check-up geral");
        Consulta consulta2 = new Consulta(gato1, vet2, LocalDateTime.of(2024, 3, 15, 10, 0), "Exame ortopédico");

        clinicaConsultas.adicionarRegistro(consulta1);
        clinicaConsultas.adicionarRegistro(consulta2);

        System.out.println("\n🐶 Lista de Cachorros Cadastrados:");
        clinicaCachorros.listarRegistros();

        System.out.println("\n🐱 Lista de Gatos Cadastrados:");
        clinicaGatos.listarRegistros();

        System.out.println("\n📋 Lista de Consultas Agendadas:");
        clinicaConsultas.listarRegistros();
    }
}
