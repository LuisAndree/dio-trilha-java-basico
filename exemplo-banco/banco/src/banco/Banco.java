package banco;

public class Banco {
    protected Conta contas[];
    private int contador = 0;
    private static int totalDeContas;

    public Banco(int capacidadeDeContas) {
        this.contas = new Conta[capacidadeDeContas];
    }

    public void setContas(Conta conta) {
        if (contador >= this.contas.length) {
            Conta[] novaArray = new Conta[this.contas.length * 2];
            for (int i = 0; i < this.contas.length; i++) {
                novaArray[i] = this.contas[i];
            }
            this.contas = novaArray;
            this.contas[contador] = conta;
            contador++;
            totalDeContas++;
        } else if (contador < this.contas.length) {
            this.contas[contador] = conta;
            contador++;
            totalDeContas++;
        }
    }
    
    public void getContas() {
        for (int i = 0; i < contador; i++) {
            System.out.println(this.contas[i]);
        }
    }

    public void getConta(int id) {
        System.out.println(this.contas[id - 1]);
    }

    public int getQuantidadeDeContas() {
        return Banco.totalDeContas;
    }
}
