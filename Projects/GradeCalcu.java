import java.util.Scanner;
public class GradeCalcu {
    public static void main(String[] args) {
        
        //Initialized variable
            // student name; number of subjects; grades; letter equivalent
        //Get Student Name
        //Get number of subjects(array)
           // sub[1] = grades
           // sub[2] = grades
        //if-else statement for letter equivalent
        //output letter

        Scanner sc = new Scanner(System.in);
        String name;
        int numS;
        int sum = 0;
        double avg = 0;


        System.out.print("Input your name: ");
        name = sc.next();

        System.out.println();
        
        System.out.println("Welcome " + name + "!");
        System.out.print("How many subjects do you have? ");
        numS = sc.nextInt();

        double sub[] = new double[numS];

        for(int i = 0; i < sub.length; i++){
            System.out.print("Subject " + (i + 1) + " = ");
            sub[i] = sc.nextInt();

            sum += sub[i];
        }

        avg = sum/sub.length;
        System.out.println(avg);

        // 89-100 A
        // 85-88 B
        // 80 - 84 C
        // the rest are D

        if(avg >= 89 && avg <= 100){
            System.out.println("GWA: A");
        } else if(avg >= 85 && avg <= 88){
            System.out.println("GWA: B");
        } else if(avg >= 80 && avg <= 84){
            System.out.println("GWA: C");
        } else if(avg >= 75 && avg < 80){
            System.out.println("GWA: D");
        } else 
            System.out.println("You failed!");

    
    }
}
