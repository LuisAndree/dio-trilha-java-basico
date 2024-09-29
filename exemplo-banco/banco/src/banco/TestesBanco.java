package banco;

public class TestesBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Luis", "Andre", "611.490.743-45");
        Cliente cliente2 = new Cliente("Leticia", "Cely", "123.321.456-78");

        Conta c1 = new Conta(cliente1);
        Conta c2 = new Conta(cliente2);

        cliente2.updateCpf("611.490.743-45");

        c1.depositar(10000);
        c1.setLimite(5000);

        c2.depositar(10000);
        c2.setLimite(5000);

        Banco b1 = new Banco(2);

        b1.setContas(c1);
        b1.setContas(c2);

        b1.getContas();
        b1.getConta(2);

        c1.transferirPara(c2, 5000);
        b1.getConta(1);
        b1.getConta(2);

        System.out.println(c2.getTitular());

        System.out.println(b1.getQuantidadeDeContas());

        Gerente g1 = new Gerente();

        g1.setNome("Cely");
        g1.setCpf("612.688.043-98");
        g1.setSalario(15000);
        System.out.println(g1.toString());

        Funcionario funcionario = g1;

        funcionario.setSalario(10000);
        System.out.println(funcionario.getBonificacao());

        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(10000);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000);
        controle.registra(funcionario2);

        System.out.println(controle.getTotalDeBonificacoes());
    }
}
