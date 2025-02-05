package setinterface.zoologico;

import java.util.Objects;

public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEspecie() {
        return especie;
    }

    public abstract void emitirSom();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return Objects.equals(nome, animal.nome) && Objects.equals(especie, animal.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especie);
    }

    @Override
    public String toString() {
        return "🐾 " + especie + " | Nome: " + nome + " | Idade: " + idade;
    }
}

