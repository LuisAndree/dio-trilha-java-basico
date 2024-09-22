class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("O cachorro late: Au au!");
    }

    @Override
    public void move() {
        System.out.println("O cachorro corre.");
    }
}