package casa;
import porta.Porta;

public class Casa {
    private String cor;      
    private Porta porta1;    
    private Porta porta2;    
    private Porta porta3;    

    public Casa(String cor) {
        this.cor = cor;
        this.porta1 = new Porta("branca", 0.8, 2.0, 0.1);
        this.porta2 = new Porta("preta", 0.8, 2.0, 0.1);
        this.porta3 = new Porta("cinza", 0.8, 2.0, 0.1);
    }

    public void pinta(String s) {
        cor = s;
        System.out.println("A casa foi pintada de " + cor + ".");
    }

    public int quantasPortasEstaoAbertas() {
        int abertas = 0;
        if (porta1.estaAberta()) abertas++;
        if (porta2.estaAberta()) abertas++;
        if (porta3.estaAberta()) abertas++;
        return abertas;
    }

    public static void main(String[] args) {
        Casa casa = new Casa("verde");
        casa.pinta("azul");
        casa.porta1.abre();
        casa.porta2.abre();
        casa.porta3.fecha();
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
        casa.porta1.fecha();

        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}


