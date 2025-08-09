package oop;

public class Course {
    private String name;
    private int semester;
    private int grade;

    public Course(String name, int semester, int grade) {
        this.name = name;
        this.semester = semester;
        this.grade = grade;
    }

    public String getName() { return name; }
    public int getSemester() { return semester; }
    public int getGrade() { return grade; }

    public boolean isPassed() {
        return grade >= 60;
    }
}
