package porta;

public class Porta {
    boolean aberta;    
    String cor;        
    double dimensaoX; 
    double dimensaoY;  
    double dimensaoZ;  

    public Porta(String cor, double x, double y, double z) {
        this.aberta = false;  
        this.cor = cor;
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }

    public void abre() {
        aberta = true;
        System.out.println("A porta foi aberta.");
    }

    public void fecha() {
        aberta = false;
        System.out.println("A porta foi fechada.");
    }

    public void pinta(String s) {
        cor = s;
        System.out.println("A porta foi pintada de " + cor + ".");
    }

    public boolean estaAberta() {
        return aberta;
    }

    public void alteraDimensao(double x, double y, double z) {
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
        System.out.println("As dimensões da porta foram alteradas para: " + x + " x " + y + " x " + z);
    }

    public static void main(String[] args) {
        Porta porta = new Porta("azul", 0.8, 2.0, 0.1);
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());
        porta.fecha();
        porta.pinta("vermelha");
        porta.alteraDimensao(0.9, 2.1, 0.12);
        System.out.println("A porta está aberta? " + porta.estaAberta());
    }
}
