import java.util.Scanner;

public class EvenNumbers{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int start, end;

        System.out.println("************");
        System.out.println("EVEN NUMBERS");
        System.out.println("************");

        System.out.println();

        System.out.print("Enter your starting number: ");
        start = sc.nextInt();

        System.out.print("Enter your ending number: ");
        end = sc.nextInt();



        for(int i = start; i<= end; i++ ){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}