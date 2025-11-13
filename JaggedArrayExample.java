public class JaggedArrayExample {
    public static void main(String[] args) {
        int[][] scores = {
            {90, 85},           // Student 1 has 2 quizzes
            {78, 80, 82, 84},   // Student 2 has 4 quizzes
            {95}                // Student 3 has only 1 quiz
        };

        // Print all scores
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
    }
}
