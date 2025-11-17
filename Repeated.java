import java.util.Scanner;

public class Repeated{
    public static void main(String[] args){
        //ask for string length
        //accept string
        //check for repeated string

        Scanner sc = new Scanner(System.in);
        int l;

        System.out.println("Enter your String length: ");
        l = sc.nextInt();

        String userInput[]  = new String[l];

        for(int i = 0; i < userInput.length; i++){
            System.out.println("Enter your text: ");
            userInput[i] = sc.next();
        }

        countRepeat(userInput);
    }
    public static void countRepeat(String[] inputs){
        boolean alreadyChecked[] = new  boolean[inputs.length];
        boolean isRepeated = false;   


        for(int i = 0; i < inputs.length; i++){
            
            if(alreadyChecked[i] == true){
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < inputs.length; j++){
                if(inputs[i].equals(inputs[j])){
                    count++;
                    alreadyChecked[j] = true;
                }
            }

            if(count > 1){
                System.out.println("The String " + inputs[i] + " appears " + count + " times.");
                isRepeated = true;
            }
        }

        if(!isRepeated){
            System.out.println("There is no repetition. ");

        }

    }
}