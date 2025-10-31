import java.util.Scanner;
public class LoopPractice {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // Make a Multiplication table 10x10
        /* 
        int i;
        int j;
        //For Loop
        for(i = 1; i <= 10 ; i++){
            for(j = 1; j <=10; j++){
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
            

        //Do While Loop
        int i =1;
          do {
            int j = 1;
            do {
                System.out.print(i * j + "\t");
                j++;
            } while (j <= 10);
                System.out.println();
                i++;
        } while (i <= 10);
    
        */

        //While Loop
        int j, start, end;
        System.out.println("start");
        start = sc.nextInt();
        System.out.println("end");
        end = sc.nextInt();
j =1;
        while (j <= end) {
    if (j % 2 == 0)
        System.out.println(j);
    j++;
}
        int i = 1;
/* 
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.print(i * j + "\t");
                j++;
            }
            System.out.println();
            i++; 
        } */
    }
}
