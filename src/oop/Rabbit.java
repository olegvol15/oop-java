package oop;

public class Rabbit extends Animal{
    public Rabbit(String name) {
        super(name, false, 2);
    }

    @Override
    public String makeSound() {
        return "Squeak!";
    }
}
