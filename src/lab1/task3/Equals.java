package lab1.task3;

import lab1.task2.Student;

public class Equals {
    public static void main(String[] args) {
    Student s1 = new Student("Gigel", 8.7);
    Student s2 = new Student("Gigel", 8.7);

    if (s1.equals(s2)) {
        System.out.println("s1 and s2 are equal.");
    } else {
        System.out.println("s1 and s2 are not equal.");
    }
}
}
