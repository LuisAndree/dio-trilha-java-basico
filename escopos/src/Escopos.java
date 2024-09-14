public class Escopos {
     // Escopo de classe (variável de instância)
    // Esta variável é acessível em qualquer método da instância desta classe.
    private int idade;

    // Escopo de classe (variável estática)
    // Esta variável é compartilhada entre todas as instâncias da classe e pode ser acessada em métodos estáticos.
    private static String nome;

    // Escopo de método (variáveis locais)
    public void definirIdade(int novaIdade) {
        // "novaIdade" é uma variável local que só existe dentro deste método.
        // Ela não pode ser acessada fora deste método.
        idade = novaIdade;  // Acessando a variável de instância dentro do método.
    }

    public void exibirIdade() {
        // "idade" é uma variável de instância, então pode ser acessada em qualquer método não estático da classe.
        System.out.println("Idade: " + idade);
    }

    public static void definirNome(String novoNome) {
        // "novoNome" é uma variável local, acessível apenas dentro deste método.
        nome = novoNome;  // Acessando a variável estática dentro do método estático.
    }

    public static void exibirNome() {
        // "nome" é uma variável estática, então pode ser acessada dentro de métodos estáticos.
        System.out.println("Nome: " + nome);
    }

    // Escopo de bloco
    public void exemploBloco() {
        // Variáveis declaradas dentro de blocos (if, for, while) têm escopo restrito ao bloco.
        if (idade > 18) {
            // "mensagem" só existe dentro deste bloco "if".
            String mensagem = "Maior de idade";
            System.out.println(mensagem);
        }

        // A linha abaixo causaria erro de compilação porque "mensagem" não é acessível fora do bloco.
        // System.out.println(mensagem);
    }

    public static void main(String[] args) {
        // Escopo de método principal
        // Cria uma instância da classe para acessar variáveis de instância.
        Escopos exemplo = new Escopos();

        // Variáveis de instância e estáticas podem ser acessadas conforme seu escopo.
        exemplo.definirIdade(26);
        exemplo.exibirIdade();  // Acessando variável de instância.

        definirNome("Andre");
        exibirNome();  // Acessando variável estática.
        
        // Chamando o exemplo de escopo de bloco.
        exemplo.exemploBloco();
    }
}
