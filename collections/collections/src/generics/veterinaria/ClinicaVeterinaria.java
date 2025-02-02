package generics.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria<T> {
    private List<T> registros;

    public ClinicaVeterinaria() {
        this.registros = new ArrayList<>();
    }

    public void adicionarRegistro(T registro) {
        registros.add(registro);
    }

    public void listarRegistros() {
        if (registros.isEmpty()) {
            System.out.println("Nenhum registro encontrado.");
        } else {
            registros.forEach(System.out::println);
        }
    }

    public void removerRegistro(T registro) {
        registros.remove(registro);
    }
}
