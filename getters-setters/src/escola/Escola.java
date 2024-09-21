package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno andre = new Aluno();

       andre.setNome("Andre");
       andre.setIdade(26);
       andre.setSexo("M");

        System.out.println("nome: " + andre.getNome() + "\nidade: " + andre.getIdade() + "\nsexo: " + andre.getSexo());
    }
}
