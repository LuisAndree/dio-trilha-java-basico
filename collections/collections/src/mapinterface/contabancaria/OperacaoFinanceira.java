package mapinterface.contabancaria;

public class OperacaoFinanceira {
    private Conta conta;
    private double valor;
    private String tipoOperacao; 

    public OperacaoFinanceira(Conta conta, double valor, String tipoOperacao) {
        this.conta = conta;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
    }

    public Conta getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    @Override
    public String toString() {
        return "Operação: " + tipoOperacao + ", Conta: " + conta.getNumeroConta() + ", Valor: " + valor;
    }
}
