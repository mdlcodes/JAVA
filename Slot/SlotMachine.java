import java.util.Scanner;

public class SlotMachine{
    public static void main(String[] args){
        
        //Declare variables needed
        Scanner sc = new Scanner(System.in);
        int balance = 100; 
        int bet;
        int payout;
        String[] row;

        //Welcome Message
        System.out.println("The JAVA SLOT GAME");
        System.out.println("  1  2  3  4  5");

        //CHECK IF BAL IS GREATER THAN 0
        while(balance > 0){
            System.out.println("Your balance is :" + balance);
            System.out.println("Enter your bet: ");
            bet = sc.nextInt();
                
            if(balance < bet){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            } 
            else if(bet <= 0){
                System.out.println("Your bet SHOULD be greater the 0. ");
                continue;
            } else 
                balance -= bet;
               
        }
        
    }

}
