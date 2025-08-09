package oop;

public class Animal {
    protected String name;
    protected boolean isPredator;
    protected int foodPerDay; // у кг

    public Animal(String name, boolean isPredator, int foodPerDay) {
        this.name = name;
        this.isPredator = isPredator;
        this.foodPerDay = foodPerDay;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public int getFoodPerDay() {
        return foodPerDay;
    }

    public String getName() {
        return name;
    }

    public String makeSound() {
        return "Some animal sound";
    }
}


