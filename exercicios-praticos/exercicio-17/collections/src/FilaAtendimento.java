import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {
    private Queue<String> fila;

    public FilaAtendimento() {
        fila = new LinkedList<>();
    }

    public void adicionarCliente(String cliente) {
        fila.add(cliente);
        System.out.println("Cliente " + cliente + " adicionado à fila.");
    }

    public void atenderCliente() {
        String clienteAtendido = fila.poll();
        if (clienteAtendido != null) {
            System.out.println("Atendendo cliente: " + clienteAtendido);
        } else {
            System.out.println("Nenhum cliente na fila.");
        }
    }

    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
        fila.adicionarCliente("Luis");
        fila.adicionarCliente("Ana");
        fila.atenderCliente();
        fila.atenderCliente();
        fila.atenderCliente();
    }
}
