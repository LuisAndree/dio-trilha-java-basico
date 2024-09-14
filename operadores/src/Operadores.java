public class Operadores {
    public static void main(String[] args) throws Exception {
        int a = 10;
        int b = 5;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;

        boolean maiorQue = a > b;
        boolean menorQue = a < b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;
        boolean igual = a == b;
        boolean diferente = a != b;

        a += 2;
        a -= 2;
        a *= 2;
        a /= 2;
        a %= 2;

        boolean eLogico = (a > b) && (b < 10);
        boolean ouLogico = (a > b) || (b < 10);
        boolean naoLogico = !(a > b);

        int incremento = ++a;
        int decremento = --b;

        System.out.println("Operações aritméticas:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Módulo: " + modulo);

        System.out.println("\nComparações:");
        System.out.println("Maior que: " + maiorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);

        System.out.println("\nAtribuições:");
        System.out.println("a após += 2: " + a);
        System.out.println("a após -= 2: " + a);
        System.out.println("a após *= 2: " + a);
        System.out.println("a após /= 2: " + a);
        System.out.println("a após %= 2: " + a);

        System.out.println("\nOperadores lógicos:");
        System.out.println("E lógico (&&): " + eLogico);
        System.out.println("Ou lógico (||): " + ouLogico);
        System.out.println("Não lógico (!): " + naoLogico);

        System.out.println("\nIncremento e decremento:");
        System.out.println("Incremento (++a): " + incremento);
        System.out.println("Decremento (--b): " + decremento);

        //Operador ternario
        boolean variavel = true;

        String resultado = variavel == true ? "É verdadeira" : "É falsa";
        System.out.println(resultado);

        //Metodo equals -> usado para comparar os conteudos dos objetos
        String nome1 = "Andre";
        String nome2 = new String("Andre");

        System.out.println(nome1 == nome2); // false
        System.out.println(nome1.equals(nome2)); // true
    }
}
