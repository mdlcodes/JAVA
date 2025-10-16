import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[] args){

        //Declare variables
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choice = {"rock", "paper", "scissors"};
        String playerChoice;
        String compChoice;
        String playAgain = "yes";

        //Get user input (scanner)
        System.out.print("Enter your move (rock, paper, scissors) : ");
        playerChoice = sc.nextLine().toLowerCase();
        //Check if user inpupt is valid

        if(!playerChoice.equals("rock") && 
           !playerChoice.equals("paper") && 
           !playerChoice.equals("scissors"))
        {
            System.out.println("Invalid Choice!");
			    return;
        }
        
    
        //Random choice of computer

        compChoice = choice[random.nextInt(3)];
        System.out.println("computer choice: " + compChoice);

        //Check who won
        if(playerChoice.equals(compChoice)){
            System.out.println("It's a tie.");
        } else if ((playerChoice.equals("rock") && compChoice.equals("scissors")) ||
                  (playerChoice.equals("paper") && compChoice.equals("rock")) || 
                  (playerChoice.equals("scissors") &&  compChoice.equals("paper")))
        {
            System.out.println("You won!");
        } else
        {
         System.out.println("You lose.");
        }

        sc.close();
        //Ask to pllay again?
        //Exit
    }
}