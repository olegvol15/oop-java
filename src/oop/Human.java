package oop;

import java.util.ArrayList;

class Human {
    private String name;
    private int age;
    private int children;

    public Human(String name, int age, int children) {
        this.name = name;
        this.age = age;
        this.children = children;
    }

    public int getChildren() {
        return children;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Children: " + children);
    }
}

class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, int children, String specialization) {
        super(name, age, children);
        this.specialization = specialization;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Profession: Builder, Specialization: " + specialization);
    }
}

class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, int children, String shipName) {
        super(name, age, children);
        this.shipName = shipName;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Profession: Sailor, Ship: " + shipName);
    }
}

class Pilot extends Human {
    private String airline;

    public Pilot(String name, int age, int children, String airline) {
        super(name, age, children);
        this.airline = airline;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Profession: Pilot, Airline: " + airline);
    }
}







