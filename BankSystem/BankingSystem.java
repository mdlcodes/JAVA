import java.util.Scanner;
public class BankingSystem 
{
	public static void main(String []args)
	{
		//Ask tehe user what he wants to do
		// 1: Show Balance 2: Deposit 3:Withdraw 4: Exit
		//case 1: show balance : print the balance
		// case 2: deposti : ask how much (cannot be negative) add to balance present new balance
		// case 3: withdraw: ask hm to withdraw (cannot be negative), subtract the amount from the balance
		Scanner sc = new Scanner(System.in);
		
		int balance;
		int withdraw;
		int deposit;
		boolean isRunning;
		char choice;
		
		System.out.println("Banking System");
		System.out.println("Choose what you want to do:\n 1: Show Balance \n 2: Withdraw \n 3: Deposit \n 4: Exit");
		choice = sc.next().charAt();
		
		switch(choice){
			case '1' -> System.out.println("Gumana");
		}
		
		
	}
}