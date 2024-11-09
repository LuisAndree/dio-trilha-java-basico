package list.cardapio;

public class Main {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        cardapio.adicionarItem(new ItemCardapio("Hambúrguer", "Hambúrguer de carne com queijo", 15.0));
        cardapio.adicionarItem(new ItemCardapio("Pizza", "Pizza de calabresa", 30.0));
        cardapio.adicionarItem(new ItemCardapio("Refrigerante", "Lata de refrigerante", 5.0));

        Cliente cliente1 = new Cliente("João", "99999-9999");
        Cliente cliente2 = new Cliente("Maria", "98888-8888");

        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarItem(cardapio.getItens().get(0)); 
        pedido1.adicionarItem(cardapio.getItens().get(2)); 

        Pedido pedido2 = new Pedido(cliente2);
        pedido2.adicionarItem(cardapio.getItens().get(1)); 

        Mesa mesa1 = new Mesa(1);
        mesa1.adicionarPedido(pedido1);
        mesa1.adicionarPedido(pedido2);

        Garcom garcom1 = new Garcom("Carlos");
        garcom1.adicionarMesa(mesa1);

        Conta contaMesa1 = new Conta(mesa1);

        System.out.println("Cardápio:");
        cardapio.listarItens();

        System.out.println("\nPedidos na Mesa 1:");
        mesa1.listarPedidos();

        System.out.println("\nConta Final:");
        System.out.println(contaMesa1);
    }
}
