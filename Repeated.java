import java.util.Scanner;
public class Repeated {
    public static void main(String[] args){

        //Get the number of inputs
        //Get inputs
            //arrays
        //Check for repeated inputs

        Scanner sc = new Scanner(System.in);
        int num;
        int ctr = 1;

        System.out.println("Enter the length of your inputs: ");
        num = sc.nextInt();

        String[] userInputs = new String[num];

        for(int i = 0; i < num; i++){
            System.out.println("Enter your text " + (i+1) + ": ");
            userInputs[i] = sc.next();
        }

        for(int j = 0; j < userInputs.length; j++){
           if(j < userInputs.length){
             // input = 5 ------ 1-2 2-3 3-4 
             // 5 == 5? check  4-5
            if(userInputs[j]. equals(userInputs[j + 1])){
                ctr++;
             }
           } else if(j == userInputs.length){
                if(userInputs[j]. equals(userInputs[j - 1])){
                ctr++;
             }
            }
        }
        System.out.println(ctr);
    }
    
}
