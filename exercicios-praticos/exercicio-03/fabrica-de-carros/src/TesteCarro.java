public class TesteCarro {
    public static void main(String[] args) {
        Carro meuCarro;
        meuCarro = new Carro();
        meuCarro.cor = "azul";
        meuCarro.modelo = "fusca";
        meuCarro.velocidadeAtual = 0;
        meuCarro.velocidadeMaxima = 80;

        meuCarro.liga();
        meuCarro.acelera(40);

        meuCarro.motor.setPotencia(59);
        meuCarro.motor.setTipo("boxer");

        System.out.println(meuCarro.cor + "\n" + meuCarro.modelo + "\n" + meuCarro.motor.getPotencia() + "\n"
                + meuCarro.motor.getTipo() + "\n" + meuCarro.velocidadeMaxima + "\n");
        System.out.println(meuCarro.velocidadeAtual);
    }
}
