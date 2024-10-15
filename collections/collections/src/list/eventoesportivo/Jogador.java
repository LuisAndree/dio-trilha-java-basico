package list.eventoesportivo;

public class Jogador {
    private String nome;
    private String posicao;
    private int numero;

    public Jogador(String nome, String posicao, int numero) {
        this.nome = nome;
        this.posicao = posicao;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Jogador: " + nome + " (Posição: " + posicao + ", Número: " + numero + ")";
    }
}
