package oop;

public class Wolf extends Animal{
    public Wolf(String name) {
        super(name, true, 7);
    }

    @Override
    public String makeSound() {
        return "Howl!";
    }
}
