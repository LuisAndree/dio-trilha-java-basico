public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);  
        Shape square = new Square(4);  

        System.out.println("Círculo:");
        System.out.println("Área: " + circle.getArea());
        System.out.println("Perímetro: " + circle.getPerimeter());

        System.out.println("\nQuadrado:");
        System.out.println("Área: " + square.getArea());
        System.out.println("Perímetro: " + square.getPerimeter());
    }
}