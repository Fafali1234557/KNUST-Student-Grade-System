import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        String studentFullName;
        int studentAge, studentId;
        int javaScore, databaseSystems, linearAlgebra;
        float average;
        int choice;

        Scanner scan = new Scanner(System.in);

        System.out.println("===== KNUST STUDENT GRADE SYSTEM =====");

        System.out.print("Enter Full Name: ");
        studentFullName = scan.nextLine();

        System.out.print("Enter Age: ");
        studentAge = scan.nextInt();

        System.out.print("Enter Student ID: ");
        studentId = scan.nextInt();

        System.out.print("Enter Java Score: ");
        javaScore = scan.nextInt();

        System.out.print("Enter Database Systems Score: ");
        databaseSystems = scan.nextInt();

        System.out.print("Enter Linear Algebra Score: ");
        linearAlgebra = scan.nextInt();

        average = (javaScore + databaseSystems + linearAlgebra) / 3.0f;

        System.out.println("\n===== MENU =====");
        System.out.println("1. Student Information");
        System.out.println("2. Academic Results");
        System.out.println("3. Pass/Fail Status");

        System.out.print("Enter a choice: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("\n===== STUDENT INFORMATION =====");
                System.out.println("Full Name: " + studentFullName);
                System.out.println("Age: " + studentAge);
                System.out.println("Student ID: " + studentId);
                break;

            case 2:
                System.out.println("\n===== ACADEMIC RESULTS =====");
                System.out.printf("Average: %.2f%n", average);

                if (average >= 70) {
                    System.out.println("Grade A");
                } else if (average >= 60) {
                    System.out.println("Grade B");
                } else if (average >= 50) {
                    System.out.println("Grade C");
                } else if (average >= 40) {
                    System.out.println("Grade D");
                } else {
                    System.out.println("Grade F");
                }
                break;

            case 3:
                System.out.println("\n===== PASS/FAIL STATUS =====");

                if (average >= 50) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
        }

        scan.close();
    }
}
