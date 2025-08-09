package oop;

import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public int countPredators() {
        int count = 0;
        for (Animal a : animals) {
            if (a.isPredator()) count++;
        }
        return count;
    }

    public int calculateTotalFood() {
        int total = 0;
        for (Animal a : animals) {
            total += a.getFoodPerDay();
        }
        return total;
    }

    public void printZooInfo() {
        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName() + " " + a.getName() + " says: " + a.makeSound());
        }
    }
}
