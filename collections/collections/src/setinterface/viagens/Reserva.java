package setinterface.viagens;

public class Reserva {
    private Passageiro passageiro;
    private Destino destino;

    public Reserva(Passageiro passageiro, Destino destino) {
        this.passageiro = passageiro;
        this.destino = destino;
    }

    public void realizarReserva() {
        System.out.println("\nReserva realizada:");
        System.out.println("Passageiro: " + passageiro.getNome() + " reservado para: " + destino.getCidade());
        destino.adicionarPassageiro(passageiro);
    }
}
