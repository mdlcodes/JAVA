import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int students = 3;
        int subjects = 3;
        double[][] grades = new double[students][subjects];
        double[] average = new double[students];

        // Input grades
        for (int i = 0; i < students; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + ":");
            double sum = 0;
            for (int j = 0; j < subjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = input.nextDouble();
                sum += grades[i][j];
            }
            average[i] = sum / subjects;
        }

        // Display results
        System.out.println("\n--- Student Averages ---");
        for (int i = 0; i < students; i++) {
            System.out.println("Student " + (i + 1) + ": " + average[i]);
        }
    }
}
