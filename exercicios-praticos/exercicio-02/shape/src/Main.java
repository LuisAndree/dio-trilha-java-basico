public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);  // Cria um círculo com raio 5
        Shape square = new Square(4);  // Cria um quadrado com lado 4

        // Testando o círculo
        System.out.println("Círculo:");
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());

        // Testando o quadrado
        System.out.println("\nQuadrado:");
        System.out.println("Área: " + square.getArea());
        System.out.println("Perímetro: " + square.getPerimeter());
    }
}