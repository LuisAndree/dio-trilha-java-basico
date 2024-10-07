import java.util.HashMap;
import java.util.Map;

public class Eleicao {
    private Map<String, Integer> votos;

    public Eleicao() {
        votos = new HashMap<>();
    }

    public void votar(String candidato) {
        votos.put(candidato, votos.getOrDefault(candidato, 0) + 1);
        System.out.println("Voto computado para: " + candidato);
    }

    public void exibirResultados() {
        System.out.println("Resultados da Eleição:");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println("Candidato: " + entry.getKey() + " | Votos: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();
        eleicao.votar("Luis");
        eleicao.votar("Ana");
        eleicao.votar("Luis");
        eleicao.exibirResultados();
    }
}
