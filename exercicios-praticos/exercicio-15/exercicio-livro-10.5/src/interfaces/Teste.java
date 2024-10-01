package interfaces;

public class Teste {
    public static void main(String[] args) {
        AreaCalculavel q = new Quadrado(10);
        AreaCalculavel r = new Retangulo(10, 15);
        AreaCalculavel c = new Circulo(10);

        System.out.println(q.calculaArea());
        System.out.println(r.calculaArea());
        System.out.println(c.calculaArea());
    }
}
