package setinterface.cadastro;

public class Main {
    public static void main(String[] args) {
        CadastroPessoas cadastro = new CadastroPessoas();

        Endereco endereco1 = new Endereco("Rua das Flores", "São Paulo", "SP", "12345678");
        Contato contato1 = new Contato("11999999999", "joao@gmail.com");

        Endereco endereco2 = new Endereco("Avenida Paulista", "São Paulo", "SP", "87654321");
        Contato contato2 = new Contato("11888888888", "maria@gmail.com");

        try {
            PessoaFisica pessoa1 = new PessoaFisica("João", "12345678901", endereco1, contato1);
            cadastro.adicionarPessoa(pessoa1);

            PessoaFisica pessoa2 = new PessoaFisica("Maria", "98765432100", endereco2, contato2);
            cadastro.adicionarPessoa(pessoa2);

            PessoaFisica pessoa3 = new PessoaFisica("Carlos", "12345678901", endereco1, contato1); 
            cadastro.adicionarPessoa(pessoa3);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            PessoaFisica pessoaInvalida = new PessoaFisica("Pedro", "12345", endereco2, contato2);
            cadastro.adicionarPessoa(pessoaInvalida);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        cadastro.listarPessoas();
    }
}
