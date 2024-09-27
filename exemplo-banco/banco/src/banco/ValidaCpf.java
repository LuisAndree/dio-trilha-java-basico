package banco;

public class ValidaCpf {
    private final String cpfLimpo;

    public ValidaCpf(String cpfEnviado) {
        this.cpfLimpo = cpfEnviado.replaceAll("\\D+", "");
    }

    public boolean valida() {
        if (cpfLimpo == null || cpfLimpo.length() != 11 || isSequencia()) {
            return false;
        }

        String cpfParcial = cpfLimpo.substring(0, 9);
        String digito1 = criaDigito(cpfParcial);
        String digito2 = criaDigito(cpfParcial + digito1);

        String novoCpf = cpfParcial + digito1 + digito2;
        return novoCpf.equals(cpfLimpo);
    }

    private String criaDigito(String cpfParcial) {
        char[] cpfArray = cpfParcial.toCharArray();
        int regressivo = cpfArray.length + 1;
        int total = 0;

        for (char c : cpfArray) {
            total += regressivo * Character.getNumericValue(c);
            regressivo--;
        }

        int digito = 11 - (total % 11);
        return digito > 9 ? "0" : Integer.toString(digito);
    }

    private boolean isSequencia() {
        String sequencia = cpfLimpo.substring(0, 1).repeat(cpfLimpo.length());
        return sequencia.equals(cpfLimpo);
    }
}
