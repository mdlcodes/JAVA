
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int start;
        int end;


        System.out.println("Enter your starting number: ");
        start = sc.nextInt();

        System.err.println("Enter your ending number: ");
        end = sc.nextInt();

        for(int i = start; i <= end; i++ ){
            System.out.println(i);
        }

    }
}
