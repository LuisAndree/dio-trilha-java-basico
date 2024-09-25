public class ExemplosArrays {

    public void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Conta[] minhasContas;
        minhasContas = new Conta[10];

        Conta contaNova = new Conta();
        contaNova.numero = 12345;
        contaNova.setSaldo(10000);

        minhasContas[0] = contaNova;

        minhasContas[1] = new Conta();
        minhasContas[1].setSaldo(5000);

        int[] idades = new int[10];
        for (int i = 0; i < 10; i++) {
            idades[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(idades[i]);
        }
        for (int x : idades) {
            System.out.println(x);
        }

    }
}
