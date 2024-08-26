package lab1.task2;

public class Student {
    String name;
    double grade;

    public Student(double grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }
}
