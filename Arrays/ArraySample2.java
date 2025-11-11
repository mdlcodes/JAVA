import java.util.Scanner;
public class ArraySample2{
	public static void main(String [] args){
		
		int sum = 0, avg =0, num = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number of quizzes: ");
		num = sc.nextInt();
		
		int quiz[] = new int[num];
		
		for(int i = 0; i < quiz.length; i++){
			System.out.print("Input score in quiz " + (i + 1) + ":");
			quiz[i] = sc.nextInt();
			sum += quiz[i];
		}
		
		avg = sum/quiz.length;
		System.out.println("Your average is " + avg);
		
	}
}