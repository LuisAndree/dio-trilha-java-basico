package livrearia;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    private List<Livro> catalogo;
    private List<Pedido> pedidos;

    public Livraria() {
        this.catalogo = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        catalogo.add(livro);
    }

    public Livro buscarLivroPorISBN(String isbn) {
        for (Livro livro : catalogo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
}
