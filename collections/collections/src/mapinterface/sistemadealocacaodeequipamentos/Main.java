package mapinterface.sistemadealocacaodeequipamentos;

public class Main {
    public static void main(String[] args) {
        Funcionario alice = new Funcionario("Alice");
        Funcionario bob = new Funcionario("Bob");

        Laptop laptopAlice = new Laptop("L001", "Laptop Dell", "Windows 10");
        Laptop laptopBob = new Laptop("L002", "Laptop MacBook", "macOS");

        Cadeira cadeiraErgonomica = new Cadeira("C001", "Cadeira Ergonomica", "Couro");
        Cadeira cadeiraSimples = new Cadeira("C002", "Cadeira Simples", "Plástico");

        AlocacaoEquipamentos alocacao = new AlocacaoEquipamentos();
        alocacao.adicionarEquipamento(alice, laptopAlice);
        alocacao.adicionarEquipamento(alice, cadeiraErgonomica);
        alocacao.adicionarEquipamento(bob, laptopBob);
        alocacao.adicionarEquipamento(bob, cadeiraSimples);

        System.out.println("\nAlocações de Alice:");
        alocacao.listarEquipamentos(alice);

        System.out.println("\nAlocações de Bob:");
        alocacao.listarEquipamentos(bob);

        System.out.println("\nTodas as Alocações:");
        alocacao.listarAlocacoes();
    }
}
