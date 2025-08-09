package oop;

import java.util.ArrayList;
import java.util.HashMap;

public class Group {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printFailedStudents() {
        System.out.println("Failed students:");
        for (Student s : students) {
            if (s.hasFailures()) {
                System.out.println(s.getFullName());
            }
        }
    }

    public void printSuccessfulStudents() {
        System.out.println("Students without failed courses:");
        for (Student s : students) {
            if (!s.hasFailures()) {
                System.out.println(s.getFullName());
            }
        }
    }

    public void printMostFailedCourse() {
        HashMap<String, Integer> failCount = new HashMap<>();

        for (Student s : students) {
            for (Course c : s.getCourses()) {
                if (!c.isPassed()) {
                    failCount.put(c.getName(), failCount.getOrDefault(c.getName(), 0) + 1);
                }
            }
        }

        String worst = null;
        int max = 0;

        for (String course : failCount.keySet()) {
            int count = failCount.get(course);
            if (count > max) {
                max = count;
                worst = course;
            }
        }

        if (worst != null) {
            System.out.println("Most failed course: " + worst + " (" + max + " failures)");
        } else {
            System.out.println("No failures found.");
        }
    }

    public void printAllAverages() {
        System.out.println("Student ratings:");
        for (Student s : students) {
            System.out.printf("%s — avg: %.2f\n", s.getFullName(), s.getAverageGrade());
        }
    }

    public void printCoursesForStudentInSemester(String fullName, int semester) {
        for (Student s : students) {
            if (s.getFullName().equalsIgnoreCase(fullName)) {
                s.printCoursesBySemester(semester);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
