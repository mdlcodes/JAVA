import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input;
        int sum = 0;

        //Print the sum of the input
        System.out.print("Enter a number: ");
        input = sc.nextInt();

        for(int i = 1; i<=input; i++ ){
            sum += i;
        }

        System.out.println(sum);
 

    }
    
}
