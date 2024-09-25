package casa;

import porta.Porta;

public class Casa {
    String cor;
    Porta[] portas;
    int totalDePortas;
    int contadorPortas;

    public Casa(String cor, int totalDePortas) {
        this.cor = cor;
        this.totalDePortas = totalDePortas;
        this.portas = new Porta[totalDePortas];
        this.contadorPortas = 0;
    }

    public void pinta(String s) {
        this.cor = s;
        System.out.println("A casa agora é " + s);
    }

    public int quantasPortasEstaoAbertas() {
        int portasAbertas = 0;
        for (int i = 0; i < contadorPortas; i++) {
            if (portas[i].isAberta()) {
                portasAbertas++;
            }
        }
        return portasAbertas;
    }

    public void adicionaPorta(Porta p) {
        if (contadorPortas < totalDePortas) {
            portas[contadorPortas] = p;
            contadorPortas++;
        } else {
            System.out.println("Não é possível adicionar mais portas.");
        }
    }

    public int totalDePortas() {
        return contadorPortas;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Branca", 3);
        minhaCasa.pinta("Azul");

        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        minhaCasa.adicionaPorta(porta1);
        minhaCasa.adicionaPorta(porta2);
        minhaCasa.adicionaPorta(porta3);

        porta1.abrir();
        porta2.abrir();

        System.out.println("Portas abertas: " + minhaCasa.quantasPortasEstaoAbertas());

        System.out.println("Total de portas na casa: " + minhaCasa.totalDePortas());
    }
}
