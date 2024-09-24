import java.util.Scanner;

public class Fibonacci {
    public static int calculaFibonacci(int n) {
        // if (n <= 1) {
        //     return n;
        // }
        // return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
        //Q3
        return (n <= 1) ? n : calculaFibonacci(n - 1) + calculaFibonacci(n - 2);
    }

    //Q2
    //A abordagem recursiva simples para calcular a sequência de Fibonacci é extremamente mais lenta em comparação com a abordagem iterativa por causa de como as chamadas recursivas são feitas, resultando em muitas repetições desnecessárias de cálculos
    //Na abordagem recursiva simples, a complexidade de tempo é O(2^n), o que significa que o número de chamadas cresce exponencialmente com o aumento de n. Cada número da sequência depende de dois números anteriores, e as chamadas se multiplicam em uma árvore de recursão.

    public static void imprimeFibonacci(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(calculaFibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.println("Digite a quantidade de números da sequência de Fibonacci que vc deseja:");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        imprimeFibonacci(n);

        scanner.close();
    }
}
