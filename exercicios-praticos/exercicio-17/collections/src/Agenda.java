import java.util.Map;
import java.util.TreeMap;

public class Agenda {
    private Map<String, String> contatos;

    public Agenda() {
        contatos = new TreeMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.put(nome, telefone);
        System.out.println("Contato adicionado: " + nome + " - " + telefone);
    }

    public void removerContato(String nome) {
        if (contatos.remove(nome) != null) {
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    public void listarContatos() {
        System.out.println("Contatos:");
        for (Map.Entry<String, String> entry : contatos.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + " | Telefone: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionarContato("Luis", "9999-9999");
        agenda.adicionarContato("Ana", "8888-8888");
        agenda.listarContatos();
        agenda.removerContato("Ana");
        agenda.listarContatos();
    }
}
