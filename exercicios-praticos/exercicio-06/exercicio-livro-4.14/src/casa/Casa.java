package casa;

public class Casa {
    private String cor;      
   

    public Casa(String cor) {
        this.cor = cor;
    }

    public void pinta(String s) {
        cor = s;
        System.out.println("A casa foi pintada de " + cor + ".");
    }

    public int quantasPortasEstaoAbertas() {
        int abertas = 0;
        return abertas;
    }

    public static void main(String[] args) {
        Casa casa = new Casa("verde");
        casa.pinta("azul");
        

        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
    }
}


