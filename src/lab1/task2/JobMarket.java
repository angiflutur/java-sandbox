package lab1.task2;

public class JobMarket {
    public static void main(String[] args) {
        Student s1 = new Student("Gigel", 8.7);
        Student s2 = new Student("Dorel", 6.4);
        Student s3 = new Student("Marcel", 7);
        Student s4 = new Student("Ionel", 9.4);

        Student[] students = {s1, s2, s3, s4};

        Internship i1 = new Internship("Google", "7", students);
        Internship i2 = new Internship("Amazon", "8", students);
        Internship i3 = new Internship("Facebook", "9.2", students);
        Internship i4 = new Internship("Microsoft", "6", students);

        i1.chooseCandidatesForInterview();
        i2.chooseCandidatesForInterview();
        i3.chooseCandidatesForInterview();
        i4.chooseCandidatesForInterview();
    }
}
