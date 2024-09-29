package faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
     private int horasDeAula;

     public ProfessorDaFaculdade(String nome, double salario, int horasDeAula) {
        super(salario, nome);
        this.horasDeAula = horasDeAula;
     }

     @Override
     double getGastos() {
         return super.getGastos() + this.horasDeAula * 10;
     }

     @Override
     String getInfo() {
         return super.getInfo() + " horas de aula " + this.horasDeAula;
     }
}
