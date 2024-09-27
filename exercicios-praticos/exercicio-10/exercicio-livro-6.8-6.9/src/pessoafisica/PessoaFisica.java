package pessoafisica;

public class PessoaFisica {
    //private String nome;
    private String cpf = "611.490.743-45";

    public static void main(String[] args) {
        PessoaFisica p1 = new PessoaFisica();
        ValidaCpf validaCpf = new ValidaCpf(p1.cpf);
        if (validaCpf.valida()) {
            System.out.println("O CPF " + p1.cpf + " é válido.");
        } else {
            System.out.println("O CPF " + p1.cpf + " é inválido.");
        }
    }
}
