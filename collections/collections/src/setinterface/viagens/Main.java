package setinterface.viagens;

public class Main {
    public static void main(String[] args) {
        Passageiro passageiro1 = new Passageiro("Lucas", "12345678910");
        Passageiro passageiro2 = new Passageiro("Ana", "98765432100");
        Passageiro passageiro3 = new Passageiro("Lucas", "12345678910");

        Destino destino1 = new Destino("Rio de Janeiro");
        Destino destino2 = new Destino("Paris");

        Agencia agencia = new Agencia("Viagens Mundo");
        agencia.adicionarDestino(destino1);
        agencia.adicionarDestino(destino2);

        agencia.listarDestinos();

        Reserva reserva1 = new Reserva(passageiro1, destino1);
        reserva1.realizarReserva();

        Reserva reserva2 = new Reserva(passageiro2, destino1);
        reserva2.realizarReserva();

        Reserva reserva3 = new Reserva(passageiro3, destino1); 
        reserva3.realizarReserva();

        destino1.listarPassageiros();
    }
}

