package setinterface.conferencia;

import java.util.HashSet;
import java.util.Set;

public class GerenteSalas {
    private Set<Sala> salas = new HashSet<>();

    public void adicionarSala(Sala sala) {
        if (salas.add(sala)) {
            System.out.println("Sala adicionada: " + sala.getIdentificador());
        } else {
            System.out.println("A sala " + sala.getIdentificador() + " já está cadastrada.");
        }
    }

    public Sala buscarSalaPorIdentificador(String identificador) {
        return salas.stream()
                .filter(s -> s.getIdentificador().equals(identificador))
                .findFirst()
                .orElse(null);
    }

    public void listarSalas() {
        salas.forEach(System.out::println);
    }
}
