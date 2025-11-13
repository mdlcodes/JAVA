public class MultiArrayExample {
    public static void main(String[] args) {
        int[][] grades = {
            {90, 85, 88},
            {78, 80, 82},
            {95, 92, 93}
        };

        System.out.println("Student 1, Quiz 2: " + grades[0][1]); // 85

        // Print all grades
        for (int i = 0; i < grades.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.println();
        }
    }
}
