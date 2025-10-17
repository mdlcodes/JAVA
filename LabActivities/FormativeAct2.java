import java.util.Scanner;
public class FormativeAct2{
	public static void main(String[] args){
		
		int x = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your number: ");
		x = sc.nextInt();
		
		for(int i = 1; i <= x ; i++){
			if(i % 2 == 0){
				System.out.println(i);
			} 
		}
	}
}