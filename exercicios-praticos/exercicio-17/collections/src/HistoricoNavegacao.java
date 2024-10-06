import java.util.Stack;

public class HistoricoNavegacao {
    private Stack<String> historico;

    public HistoricoNavegacao() {
        historico = new Stack<>();
    }

    public void visitarPagina(String url) {
        historico.push(url);
        System.out.println("Visitando: " + url);
    }

    public void voltarPagina() {
        if (!historico.isEmpty()) {
            String ultimaPagina = historico.pop();
            System.out.println("Voltando da página: " + ultimaPagina);
        } else {
            System.out.println("Nenhuma página no histórico.");
        }
    }

    public void mostrarHistorico() {
        System.out.println("Histórico de navegação:");
        for (String url : historico) {
            System.out.println(url);
        }
    }

    public static void main(String[] args) {
        HistoricoNavegacao navegador = new HistoricoNavegacao();
        navegador.visitarPagina("www.google.com");
        navegador.visitarPagina("www.github.com");
        navegador.mostrarHistorico();
        navegador.voltarPagina();
        navegador.mostrarHistorico();
    }
}
