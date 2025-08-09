package oop;

public class Student {
    private String firstName;
    private String lastName;
    private Course[] courses;

    public Student(String firstName, String lastName, Course[] courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Course[] getCourses() {
        return courses;
    }

    public boolean hasFailures() {
        for (Course c : courses) {
            if (!c.isPassed()) return true;
        }
        return false;
    }

    public double getAverageGrade() {
        int sum = 0;
        int count = 0;
        for (Course c : courses) {
            if (c.isPassed()) {
                sum += c.getGrade();
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    public void printCoursesBySemester(int sem) {
        for (Course c : courses) {
            if (c.getSemester() == sem) {
                System.out.println(c.getName() + " - grade: " + c.getGrade());
            }
        }
    }
}
