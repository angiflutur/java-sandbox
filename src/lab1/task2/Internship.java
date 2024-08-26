package lab1.task2;

import java.util.Random;

public class Internship {
    private String name;
    private String minGrade;

    Student[] students = new Student[10];

    public Internship(String name, String minGrade, Student[] students) {
        this.name = name;
        this.minGrade = minGrade;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    public String getName() {
        return name;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public Student choseCandidateRandomly()
    {
        Random rand = new Random();
        int index = rand.nextInt(students.length);
        return students[index];
    }

    public void chooseCandidatesForInterview(){
        for(int i = 0; i < students.length; i++)
            if(students[i].getGrade() >= Float.parseFloat(minGrade))
            {
                System.out.println("Candidate " + students[i].getName() + " got a phone interview at " + getName());
            }
    }
}
