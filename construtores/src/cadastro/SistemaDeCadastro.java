package cadastro;
import alunos.Alunos;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        Alunos andre = new Alunos("Andre", "611.490.743-45");

        andre.setIdade(26);
        andre.setEndereco("Rua 06, casa n°20, Novo Cohatrac");

        System.out.println("Nome: " + andre.getNome() + "\nCpf: " + andre.getCpf() + "\nIdade: " + andre.getIdade()
                + "\nEndereco: " + andre.getEndereco());

    }
}
