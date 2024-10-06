import java.util.HashMap;
import java.util.Map;

public class ContagemDePalavras {
    private Map<String, Integer> contagem;

    public ContagemDePalavras() {
        contagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra) {
        contagem.put(palavra, contagem.getOrDefault(palavra, 0) + 1);
    }

    public void exibirContagem() {
        for (Map.Entry<String, Integer> entry : contagem.entrySet()) {
            System.out.println("Palavra: " + entry.getKey() + " | Contagem: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContagemDePalavras contador = new ContagemDePalavras();
        contador.adicionarPalavra("java");
        contador.adicionarPalavra("codigo");
        contador.adicionarPalavra("java");
        contador.exibirContagem();
    }
}
