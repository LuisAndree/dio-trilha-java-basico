import java.util.PriorityQueue;
import java.util.Comparator;

public class RankingJogadores {
    private PriorityQueue<Jogador> ranking;

    public RankingJogadores() {
        ranking = new PriorityQueue<>(Comparator.comparingInt(Jogador::getPontuacao).reversed());
    }

    public void adicionarJogador(String nome, int pontuacao) {
        Jogador jogador = new Jogador(nome, pontuacao);
        ranking.add(jogador);
        System.out.println("Jogador adicionado: " + jogador);
    }

    public void exibirRanking() {
        System.out.println("Ranking dos Jogadores:");
        for (Jogador jogador : ranking) {
            System.out.println(jogador);
        }
    }

    public static void main(String[] args) {
        RankingJogadores ranking = new RankingJogadores();
        ranking.adicionarJogador("Luis", 1500);
        ranking.adicionarJogador("André", 2000);
        ranking.adicionarJogador("Ana", 1800);
        ranking.exibirRanking();
    }
}