import java.util.Scanner;

public class LANDICHO_LAB4
{
	public static void main(String[]args){
		
		Scanner sc = new Scanner (System.in);
		
		String school1 = "University of Santo Tomas";
		String school2 = "university of santo tomas";
		String message = "        I love";
		String userInput;

		System.out.println("Question 1: " + school1);
		
		System.out.println("Question 2: " + school2);
		
		System.out.println("Question 3: " + message);
		
		System.out.println("Question 4: " + school1.charAt(0));
		
		System.out.println("Question 5: " + school1.length());
		
		System.out.println("Question 6: " + school1.equals(school2));
		
		System.out.println("Question 7: " + school1.equalsIgnoreCase(school2));
		
		System.out.println("Question 8: " + message + school1);
		
		System.out.println("Type your school: ");
		userInput = sc.nextLine();
		
		System.out.println("Question 9: " + userInput.equals(school1));
		
		System.out.println("Question 10: " + school2.toUpperCase());
		
		System.out.println("Question 11: " + school1.toUpperCase());

		System.out.println("Question 12: " + school2.charAt(24)); 
		
		System.out.println("Question 13: " + message.charAt(0)); 
		
		System.out.println("Question 14: " + school2.length());
		
		System.out.println("Question 15: " + school2.replace('i', '!')); 
		
		System.out.println("Question 16: " + school1.substring(14));
		
		System.out.println("Question 17: " + message.trim());
		
		System.out.println("Question 18: " + message.length()); 
		
		System.out.println("Question 19: " + school1.compareTo(school2)); 
		
		System.out.println("Question 20: " + message.substring(10)); 
		
		
		

	}
}