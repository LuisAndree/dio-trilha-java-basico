package exceptions;

public class TesteErro {
    public static void main(String[] args) {
        System.out.println("inicio do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("inicio do metodo1");
        try {
            metodo2();
        } catch (

        Exception e) {
            System.out.println("error " + e);
        }

        System.out.println("fim do metodo1");
    }

    static void metodo2() {
        System.out.println("inicio do metodo2");
        int[] array = new int[10];

        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);
        }

        System.out.println("fim do metodo2");
    }
}
