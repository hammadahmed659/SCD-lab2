import java.util.Scanner;

public class MarkSheet {

    private String studentName;
    private int totalMarks;
    private int obtainedMarks;
    private double percentage;
    private String grade;
    private double gpa;

    // Constructor
    public MarkSheet(String studentName, int totalMarks, int obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
        calculateResults();
    }

    // Method to calculate percentage, grade, and GPA
    private void calculateResults() {
        if (totalMarks > 0) {
            this.percentage = ((double) obtainedMarks / totalMarks) * 100;
            this.grade = calculateGrade(this.percentage);
            this.gpa = calculateGPA(this.percentage);
        } else {
            System.out.println("Total marks must be greater than zero.");
        }
    }

    // Method to calculate grade based on percentage
    private String calculateGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to calculate GPA based on percentage
    private double calculateGPA(double percentage) {
        if (percentage >= 90) {
            return 4.0;
        } else if (percentage >= 80) {
            return 3.7;
        } else if (percentage >= 70) {
            return 3.0;
        } else if (percentage >= 60) {
            return 2.0;
        } else if (percentage >= 50) {
                return 1.0;
        } else {
            return 0.0;
        }
    }

    // Method to display the mark sheet
    public void displayMarkSheet() {
        System.out.println("\n----- Mark Sheet -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        int totalMarks = scanner.nextInt();

        System.out.print("Enter Obtained Marks: ");
        int obtainedMarks = scanner.nextInt();

        // Create MarkSheet object and display it
        MarkSheet markSheet = new MarkSheet(studentName, totalMarks, obtainedMarks);
        markSheet.displayMarkSheet();

        scanner.close();
    }
}
