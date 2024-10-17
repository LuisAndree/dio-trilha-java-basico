package setinterface.viagens;

import java.util.HashSet;
import java.util.Set;

public class Agencia {
    private String nome;
    private Set<Destino> destinos;

    public Agencia(String nome) {
        this.nome = nome;
        this.destinos = new HashSet<>();
    }

    public void adicionarDestino(Destino destino) {
        if (destinos.add(destino)) {
            System.out.println("Destino adicionado: " + destino.getCidade());
        } else {
            System.out.println("Destino já existe na agência: " + destino.getCidade());
        }
    }

    public void listarDestinos() {
        System.out.println("\nDestinos disponíveis na agência " + nome + ":");
        for (Destino destino : destinos) {
            System.out.println(destino.getCidade());
        }
    }
}
