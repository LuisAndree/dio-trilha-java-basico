package faculdade;

public class Reitor extends EmpregadoDaFaculdade{

    public Reitor(String nome, double salario){
        super(salario, nome);
    }
    @Override
    String getInfo() {
        return super.getInfo() + " esse é um reitor";
    }
}
