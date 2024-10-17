package setinterface.viagens;

import java.util.HashSet;
import java.util.Set;

public class Destino {
    private String cidade;
    private Set<Passageiro> passageiros;

    public Destino(String cidade) {
        this.cidade = cidade;
        this.passageiros = new HashSet<>();
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        if (passageiros.add(passageiro)) {
            System.out.println("Passageiro adicionado: " + passageiro.getNome());
        } else {
            System.out.println("Passageiro já está registrado para este destino: " + passageiro.getNome());
        }
    }

    public void listarPassageiros() {
        System.out.println("\nPassageiros indo para " + cidade + ":");
        for (Passageiro passageiro : passageiros) {
            System.out.println(passageiro);
        }
    }

    public String getCidade() {
        return cidade;
    }
}

