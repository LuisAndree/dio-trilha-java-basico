public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        // Tipos primitivos:
        byte idade = 26;
        short ano = 2024;
        int cep = 65020260; // se começar com 0 vc precisa usar outro tipo como string
        long cpf = 61149074345L; // precisa por o L no final
        float pi = 3.14F; // precisa por o F no final
        double flutuante = 0.10;

        // Nao primitivos
        String meuNome = "Luis Andre";

        // constante
        final double VALOR_DE_PI = 3.14;

        System.out.println(idade + " " + ano + " " + cep + " " + cpf + " " + pi + " " + flutuante);
        System.out.println(meuNome);
        System.out.println(VALOR_DE_PI);
    }
}
