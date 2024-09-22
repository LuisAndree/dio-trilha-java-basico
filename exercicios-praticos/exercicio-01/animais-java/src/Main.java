public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Testando o comportamento do Dog
        myDog.makeSound();
        myDog.move();

        // Testando o comportamento do Cat
        myCat.makeSound();
        myCat.move();
    }
}