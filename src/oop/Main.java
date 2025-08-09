package oop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Human> friends = new ArrayList<>();

        // 1 завдання
//        Book book = new Book();
//        book.inputData();
//        book.printInfo();

        //2 завдання
//        friends.add(new Builder("Ivan", 40, 2, "Concrete"));
//        friends.add(new Sailor("Oleg", 35, 1, "Black Pearl"));
//        friends.add(new Pilot("Anna", 32, 3, "AirUkraine"));
//
//        int totalChildren = 0;
//
//        System.out.println("=== Friends Info ===");
//        for (Human h : friends) {
//            h.printInfo();
//            System.out.println();
//            totalChildren += h.getChildren();
//        }
//
//        System.out.println("Total number of children: " + totalChildren);

        // 3 завдання

//        Course[] c1 = {
//                new Course("Math", 1, 95),
//                new Course("Physics", 1, 55),
//                new Course("History", 2, 78)
//        };
//
//        Course[] c2 = {
//                new Course("Math", 1, 88),
//                new Course("Physics", 1, 90),
//                new Course("History", 2, 84)
//        };
//
//        Course[] c3 = {
//                new Course("Math", 1, 30),
//                new Course("Physics", 1, 40),
//                new Course("History", 2, 100)
//        };
//
//        Student s1 = new Student("Ivan", "Petrov", c1);
//        Student s2 = new Student("Olga", "Koval", c2);
//        Student s3 = new Student("Max", "Shevchenko", c3);
//
//        Group group = new Group();
//        group.addStudent(s1);
//        group.addStudent(s2);
//        group.addStudent(s3);
//
//        group.printFailedStudents();
//        group.printSuccessfulStudents();
//        group.printMostFailedCourse();
//        group.printAllAverages();
//
//        System.out.println("\nCourses for Max Shevchenko in semester 1:");
//        group.printCoursesForStudentInSemester("Max Shevchenko", 1);
//    }


        // 4 завдання

        Zoo zoo = new Zoo();

        zoo.addAnimal(new Tiger("Sheru"));
        zoo.addAnimal(new Rabbit("Bunny"));
        zoo.addAnimal(new Wolf("Gray"));
        zoo.addAnimal(new Kangaroo("Joey"));
        zoo.addAnimal(new Tiger("Tigran"));

        zoo.printZooInfo();

        System.out.println("\nPredators in zoo: " + zoo.countPredators());
        System.out.println("Total food needed per day: " + zoo.calculateTotalFood() + " kg");


    }

}
