import java.util.Random;
import java.util.Scanner;

public class SlotMachine{
    public static void main(String[] args){
        
        //Declare variables needed
        Scanner sc = new Scanner(System.in);
        int balance = 100; 
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //Welcome Message
        System.out.println ("The JAVA SLOT GAME");
        System.out.println("  1  2  3  4  5");

        //CHECK IF BAL IS GREATER THAN 0
        while(balance > 0){
            System.out.println("YOur balance is : " + balance);
            System.out.println("Enter your bet: ");
            bet = sc.nextInt();
            sc.nextLine();
                
            if(balance < bet){
                System.out.println("INSUFFICIENT BALANCE");
                continue;
            } 
            else if(bet <= 0){
                System.out.println("Your bet SHOULD be greater the 0. ");
                continue;
            } else 
                balance -= bet;

                System.out.println("spinning...");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);

                if(payout > 0){
                    System.out.println("Congrats! You win " + payout);
                    balance += payout;
                } else{
                    System.out.println("You lose.");
                }

                System.out.print("Do you want to play again (Y/N) ? ");

                playAgain = sc.nextLine().toUpperCase();

                         if(!playAgain.equals("Y")){
                      break;
                }
        }
            System.out.println("TAMA NAH~ 1 GEYM OBER!! UR BALANS IZ " + balance);
        
    }

    static String[] spinRow(){

        String[] symbols = {"1", "2", "3", "4", "5"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(5)];
        }
 
        return row;
    }
    static void printRow(String[] row){
        System.out.println("************");
        System.out.println(" " + String.join(" | " , row));
        System.out.println("************");

    }
    static int getPayout(String[] row, int bet){
       
        if(row[0].equals(row[1]) && row[1].equals(row[2])){

            return switch(row[0]){
                case "1" -> bet *= 5;
                case "2" -> bet *= 6;
                case "3" -> bet *= 8;
                case "4" -> bet *= 10;
                case "5" -> bet *= 20;
                default -> 0;
            };
        } else if(row[0].equals(row[1])){

            return switch(row[0]){
                case "1" -> bet *= 2;
                case "2" -> bet *= 3;
                case "3" -> bet *= 4;
                case "4" -> bet *= 4;
                case "5" -> bet *= 5;
                default -> 0;
            };
        }else if(row[1].equals(row[2])){

            return switch(row[1]){
                case "1" -> bet *= 2;
                case "2" -> bet *= 3;
                case "3" -> bet *= 4;
                case "4" -> bet *= 4;
                case "5" -> bet *= 5;
                default -> 0;
            };
        }

        

     
        

        return 0;
    }
}
