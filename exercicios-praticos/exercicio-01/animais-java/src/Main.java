public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound();
        myDog.move();

        myCat.makeSound();
        myCat.move();
    }
}