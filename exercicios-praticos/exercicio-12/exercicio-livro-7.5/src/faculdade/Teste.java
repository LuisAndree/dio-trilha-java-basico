package faculdade;

public class Teste {
    public static void main(String[] args) {

        Reitor r1 = new Reitor("Luis", 15000);
        ProfessorDaFaculdade p1 = new ProfessorDaFaculdade("Andre", 10000, 60);

        EmpregadoDaFaculdade e1 = r1;
        EmpregadoDaFaculdade e2 = p1;

        System.out.println(e1.getInfo());
        System.out.println(e2.getInfo());
    }
}
