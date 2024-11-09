package list.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Garcom {
    private String nome;
    private List<Mesa> mesasResponsaveis;

    public Garcom(String nome) {
        this.nome = nome;
        this.mesasResponsaveis = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMesa(Mesa mesa) {
        mesasResponsaveis.add(mesa);
    }

    public List<Mesa> getMesasResponsaveis() {
        return mesasResponsaveis;
    }

    public void listarMesas() {
        mesasResponsaveis.forEach(m -> System.out.println("Mesa " + m.getNumero()));
    }
}
