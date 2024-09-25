package porta;

public class Porta {
    boolean aberta;

    public Porta() {
        this.aberta = false; 
    }

    public void abrir() {
        this.aberta = true;
    }

    public void fechar() {
        this.aberta = false;
    }

    public boolean isAberta() {
        return this.aberta;
    }
}
