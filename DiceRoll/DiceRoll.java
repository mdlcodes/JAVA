import java.util.Random;
import java.util.Scanner;

public class DiceRoll 
{
	public static void main(String[] args)
	{
		//Declare variables needed
		//Get user input in number of dice
		//check if the input is less than 0
		//roll the dice
		//show symbol
		//get total
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numberOfRoll;
		int total = 0;
		
		System.out.println("Enter the # of dice to roll: ");
		numberOfRoll = sc.nextInt();
		
		if(numberOfRoll > 0){
			
			for(int i=0; i < numberOfRoll; i++){
				int roll = random.nextInt(1,7);
				printDie(roll);
				System.out.println("You got: " + roll);
				total = total + roll;
				
			}
		} else {
			System.out.println("The number of roll cannot be 0.");
		}
		System.out.println("Your total points is " + total);2
		
	}
	
	static void printDie(int roll){
		
		String dice1 = 
		""" 
		 -------
		|       |
		|   ●   |
		|       |
		 -------
		""";
		
		String dice2 = 
		""" 
		 -------
		| ●     |
		|       |
		|     ● |
		 -------
		""";
		
		String dice3 = 
		""" 
		 -------
		| ●     |
		|   ●   |
		|     ● |
		 -------
		""";
		
		String dice4 = 
		""" 
		 -------
		| ●   ● |
		|       |
		| ●   ● |
		 -------
		""";
		
		String dice5 = 
		""" 
		 -------
		| ●   ● |
		|   ●   |
		| ●   ● |
		 -------
		""";
		
		String dice6 = 
		""" 
		 -------
		| ●   ● |
		| ●   ● |
		| ●   ● |
		 -------
		""";
		
		switch(roll){
			case 1 -> System.out.println(dice1);
			case 2 -> System.out.println(dice2);
			case 3 -> System.out.println(dice3);
			case 4 -> System.out.println(dice4);
			case 5 -> System.out.println(dice5);
			case 6 -> System.out.println(dice6);
			default -> System.out.println("Invalid roll");
		}
		}
	
}