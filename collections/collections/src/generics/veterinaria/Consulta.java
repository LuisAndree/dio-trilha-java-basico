package generics.veterinaria;

import java.time.LocalDateTime;

public class Consulta {
    private Animal animal;
    private Veterinario veterinario;
    private LocalDateTime dataHora;
    private String descricao;

    public Consulta(Animal animal, Veterinario veterinario, LocalDateTime dataHora, String descricao) {
        this.animal = animal;
        this.veterinario = veterinario;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "📅 Consulta: " + dataHora + "\n" +
               "🐾 Animal: " + animal.getNome() + "\n" +
               "👨‍⚕️ Veterinário: " + veterinario.getNome() + "\n" +
               "📋 Descrição: " + descricao;
    }
}
