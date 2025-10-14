import java.util.Scanner;

class Subject {
    int subjectMarks;
    int grade;
    int credits;
}

class Student {
    String name, USN;
    double SGPA;
    Subject subjects[];
    Scanner s;
    Student() {
        s = new Scanner(System.in);
        subjects = new Subject[8];
        for (int i = 0; i < 8; i++) {
            subjects[i] = new Subject();
        }
    }
    void getStudentDetails() {
        System.out.print("Enter Student Name: ");
        name = s.nextLine();
        System.out.print("Enter Student USN: ");
        USN = s.nextLine();
    }
    void getMarks()
     {
        for (int i = 0; i < 8; i++) 
        {
            System.out.println("Enter marks for Subject"+(i + 1)+":");
            subjects[i].subjectMarks = s.nextInt();
            System.out.print("Enter credits for Subject"+(i+1)+":");
            subjects[i].credits= s.nextInt();
            subjects[i].grade = (subjects[i].subjectMarks / 10)+1;
            if (subjects[i].grade == 11) 
            {
                subjects[i].grade = 10;
            } 
            else if (subjects[i].grade <= 4) 
            {
                subjects[i].grade = 0;
            }
        }
    }
    void computeSGPA() {
        int effectiveScore = 0, totalCredits = 0;
        for (int i = 0; i < 8; i++) {
            effectiveScore += subjects[i].grade * subjects[i].credits;
            totalCredits += subjects[i].credits;
        }
        if (totalCredits > 0)
            SGPA = (double) effectiveScore / totalCredits;
        else
            SGPA = 0.0;
    }
    void displayResult() {
        System.out.println("\nStudent result:");
        System.out.println("Name: " + name);
        System.out.println("USN: " + USN);
        System.out.printf("SGPA: %.2f\n", SGPA);
    }
}
public class Main
 {
    public static void main(String args[]) {
        Student st1 = new Student();
        st1.getStudentDetails();
        st1.getMarks();
        st1.computeSGPA();
        st1.displayResult();
        Student st2 = new Student();
        st2.getStudentDetails();
        st2.getMarks();
        st2.computeSGPA();
        st2.displayResult();
    }
}