package list.lojagames;

import java.util.ArrayList;
import java.util.List;

public class HistoricoVendas {
    private List<Venda> vendas;

    public HistoricoVendas() {
        this.vendas = new ArrayList<>();
    }

    public void registrarVenda(Venda venda) {
        vendas.add(venda);
    }

    public void listarVendas() {
        vendas.forEach(System.out::println);
    }
}
