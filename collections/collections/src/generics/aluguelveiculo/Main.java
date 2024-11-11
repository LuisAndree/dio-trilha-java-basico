package generics.aluguelveiculo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", "(11) 91234-5678");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00", "(21) 99876-5432");

        Carro carro1 = new Carro("ABC-1234", "Toyota Corolla", 150.0, 4);
        Moto moto1 = new Moto("XYZ-5678", "Honda CG 160", 80.0, "Esportiva");
        Caminhao caminhao1 = new Caminhao("JKL-9101", "Volvo FH16", 500.0, 20000.0);

        Aluguel<Carro> aluguel1 = new Aluguel<>(cliente1, carro1, LocalDate.of(2024, 4, 1), LocalDate.of(2024, 4, 5));
        Aluguel<Moto> aluguel2 = new Aluguel<>(cliente2, moto1, LocalDate.of(2024, 4, 3), LocalDate.of(2024, 4, 4));
        Aluguel<Caminhao> aluguel3 = new Aluguel<>(cliente1, caminhao1, LocalDate.of(2024, 4, 2), LocalDate.of(2024, 4, 10));

        GerenciadorAluguel gerenciador = new GerenciadorAluguel();
        gerenciador.adicionarAluguel(aluguel1);
        gerenciador.adicionarAluguel(aluguel2);
        gerenciador.adicionarAluguel(aluguel3);

        gerenciador.listarAlugueis();
    }
}
