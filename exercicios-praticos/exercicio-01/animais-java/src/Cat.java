class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O gato mia: Miau!");
    }

    @Override
    public void move() {
        System.out.println("O gato caminha silenciosamente.");
    }
}