package evento;

public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante("Alice", "alice@example.com");
        Participante participante2 = new Participante("Bob", "bob@example.com");

        Palestrante palestrante1 = new Palestrante("Carlos", "carlos@example.com", "Inteligência Artificial");
        Palestrante palestrante2 = new Palestrante("Diana", "diana@example.com", "Desenvolvimento Ágil");

        Palestra palestra1 = new Palestra("Futuro da IA", palestrante1, "10:00 - 11:00");
        Palestra palestra2 = new Palestra("Scrum na Prática", palestrante2, "11:30 - 12:30");

        Evento evento = new Evento("Tech Conference 2024");

        evento.adicionarPalestra(palestra1);
        evento.adicionarPalestra(palestra2);
        evento.adicionarParticipante(participante1);
        evento.adicionarParticipante(participante2);

        evento.listarPalestras();
        evento.listarParticipantes();
    }
}

