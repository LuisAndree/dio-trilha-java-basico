package fibonaccicomarray;

public class FibonacciArray {
    public static void fibonacci(int n) {
        int[] memo = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }

        fibonacciRecursivo(n, memo);

        for (int i = 0; i <= n; i++) {
            System.out.print(memo[i] + " ");
        }
    }

    private static int fibonacciRecursivo(int n, int[] memo) {
        if (n == 0 || n == 1) {
            memo[n] = n;
            return n;
        }

        if (memo[n] != -1) {
            return memo[n];
        }

        memo[n] = fibonacciRecursivo(n - 1, memo) + fibonacciRecursivo(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Sequência de Fibonacci até " + n + ":");
        fibonacci(n);
    }
}
