public class SalaVIP extends Sala {
    private boolean servicoDeGarcon;

    public SalaVIP(int numeroSala, int capacidade, boolean servicoDeGarcon) {
        super(numeroSala, capacidade);
        this.servicoDeGarcon = servicoDeGarcon;
    }

    public boolean isServicoDeGarcon() {
        return servicoDeGarcon;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Serviço de Garçom: " + (servicoDeGarcon ? "Sim" : "Não"));
    }
}
