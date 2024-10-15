package list.eventoesportivo;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Lucas", "Atacante", 9);
        Jogador jogador2 = new Jogador("Pedro", "Goleiro", 1);
        Jogador jogador3 = new Jogador("Carlos", "Zagueiro", 3);
        Jogador jogador4 = new Jogador("João", "Meio-campo", 8);

        Time time1 = new Time("Equipe A");
        time1.adicionarJogador(jogador1);
        time1.adicionarJogador(jogador2);

        Time time2 = new Time("Equipe B");
        time2.adicionarJogador(jogador3);
        time2.adicionarJogador(jogador4);

        time1.listarJogadores();
        time2.listarJogadores();

        Partida partida1 = new Partida("10/10/2024", "Estádio Central");
        partida1.adicionarTime(time1);
        partida1.adicionarTime(time2);

        Campeonato campeonato = new Campeonato("Campeonato Estadual");
        campeonato.adicionarPartida(partida1);

        campeonato.listarPartidas();

        Arbitro arbitro1 = new Arbitro("Jorge", 15);
        System.out.println(arbitro1);
    }
}
