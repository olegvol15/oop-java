package oop;

public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name, false, 4);
    }

    @Override
    public String makeSound() {
        return "Grunt!";
    }
}
