import java.util.Scanner;

public class FormativeAct4 {
    public static void main(String[] args) {
        
        //Goal: To ask a string from a user then reverse the given string and determine if its palindrome or no

        Scanner sc = new Scanner(System.in);
        String userInput;
        String reversed ="";
        int i;

        System.out.println("Enter your String: ");
        userInput = sc.nextLine();

        userInput  = userInput.replaceAll(" ", ""); 

        System.out.println();
        System.out.println("The reverse of your string: ");
       
	    for(i = userInput.length() - 1; i >= 0; i--){
			reversed += userInput.charAt(i);
        }
        
		System.out.println(reversed);

        if(userInput.equalsIgnoreCase(reversed)){
            System.out.println("It is a palindrome.");
        } else
            System.out.println("Not a palindrome.");

    }
}
