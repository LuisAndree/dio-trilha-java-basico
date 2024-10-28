package generics.cardapiomenu;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.adicionarItem(new ItemMenu("Pizza Margherita", 25.00, "Prato Principal"));
        menu.adicionarItem(new ItemMenu("Sorvete", 12.00, "Sobremesa"));
        menu.adicionarItem(new ItemMenu("Refrigerante", 6.00, "Bebida"));

        Restaurante restaurante = new Restaurante(menu);
        Mesa mesa1 = new Mesa(1);
        restaurante.adicionarMesa(mesa1);

        Cliente cliente = new Cliente("Carlos Silva", 101);
        Garcom garcom = new Garcom("João", "G123");

        Mesa mesa = restaurante.buscarMesa(1);
        if (mesa != null) {
            garcom.adicionarItemPedido(mesa, menu.listarItens().get(0)); 
            garcom.adicionarItemPedido(mesa, menu.listarItens().get(1)); 
            garcom.finalizarPedido(mesa); 
        }

        System.out.println("Pedido finalizado para a mesa " + mesa.getNumero() + " para o cliente " + cliente.getNome() + ":");
        System.out.println(mesa.getPedidoAtual());
    }
}
