
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==================================");
        System.out.println("     STUDENT GRADE CALCULATOR");
        System.out.println("==================================");

        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Number of subjects must be positive.");
            sc.close();
            return;
        }

        int totalMarks = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i
                    + " (out of 100): ");

            int marks = sc.nextInt();

            while (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Enter marks from 0 to 100.");
                System.out.print("Enter marks for subject " + i + ": ");
                marks = sc.nextInt();
            }

            totalMarks = totalMarks + marks;
        }

        double percentage = (double) totalMarks / subjects;

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n==================================");
        System.out.println("          RESULT SUMMARY");
        System.out.println("==================================");
        System.out.println("Number of subjects: " + subjects);
        System.out.println("Total marks: " + totalMarks
                + " out of " + (subjects * 100));
        System.out.printf("Average percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);

        if (percentage >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        System.out.println("==================================");

        sc.close();
    }
}
