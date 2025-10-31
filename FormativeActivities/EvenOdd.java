import java.util.Scanner;
public class EvenOdd{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		//Print even numbers
		int start, end;
		int i;
		
		System.out.println("Enter your starting number: ");
		start= sc.nextInt();
		
		System.out.println("Enter your ending number: ");
		end = sc.nextInt();
/*
		for(i = start; i <= end; i++){
			if(i%2 == 0){
				System.out.println(i);
			}
		}*/
		
		//while loop
		/*
		while(start<= end){
			if(start % 2 == 0){
				System.out.println(start);
			}
			start++;
		}*/
		
		//do while
		do{
			if(start % 2 == 0){
				System.out.println(start);
			} start++;
		}while(start<=end);
		
	}
}