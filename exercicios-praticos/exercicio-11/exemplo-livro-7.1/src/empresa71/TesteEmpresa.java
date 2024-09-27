package empresa71;

public class TesteEmpresa {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Data dataDeIngresso;

        Funcionario f1 = new Funcionario("Luis", "1231231", 50000, "Ti", dataDeIngresso = new Data(5, 11, 2024));
        Funcionario f2 = new Funcionario("Andre", "1231231", 60000, "Ti", dataDeIngresso = new Data(7, 5, 2024));
        Funcionario f3 = new Funcionario("Maria", "1231231", 70000, "Ti", dataDeIngresso = new Data(9, 8, 2024));
        Funcionario f4 = new Funcionario("Ticia", "1231231", 30000, "Ti", dataDeIngresso = new Data(11, 6, 2024));
        Funcionario f5 = new Funcionario("Marta", "1231231", 80000, "Ti", dataDeIngresso = new Data(15, 11, 2024));
        Funcionario f6 = new Funcionario("Jao", "1231231", 80000, "Ti", dataDeIngresso = new Data(15, 11, 2024));

        Empresa empresa = new Empresa(5); 

        empresa.setEmpregados(f1);
        empresa.setEmpregados(f2);
        empresa.setEmpregados(f3);
        empresa.setEmpregados(f4);
        empresa.setEmpregados(f5);
        empresa.setEmpregados(f6);

        empresa.getEmpregados(); 
        System.out.println(empresa.contemFuncionario(f6));
        empresa.getEmpregado(6);
        System.out.println(f1.getGanhoAnual());

        empresa.atualizaFuncionario(6);
        
        
    }
}
