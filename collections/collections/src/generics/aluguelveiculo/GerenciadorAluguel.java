package generics.aluguelveiculo;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluguel {
    private List<Aluguel<? extends Veiculo>> alugueis;

    public GerenciadorAluguel() {
        this.alugueis = new ArrayList<>();
    }

    public void adicionarAluguel(Aluguel<? extends Veiculo> aluguel) {
        alugueis.add(aluguel);
        System.out.println("Aluguel registrado: " + aluguel);
    }

    public void listarAlugueis() {
        System.out.println("Lista de Aluguéis:");
        alugueis.forEach(System.out::println);
    }

    public List<Aluguel<? extends Veiculo>> getAlugueis() {
        return alugueis;
    }
}
