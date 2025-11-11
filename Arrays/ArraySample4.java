import java.util.Scanner;
public class ArraySample4
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int orig[] = {1, 2, 3, 4, 5};
		int temp[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
				
		System.out.println("Orig before array copy");
		for(int n: orig){
			System.out.print(n + "\t");
		}
		
		System.out.println("\nTemp before array copy");
		for(int n: temp){
			System.out.print(n + "\t");
		}
			
		System.arraycopy(orig, 1, temp, 1, 4);
		
		System.out.println("\nOrig after array copy");
		for(int n: orig){
			System.out.print(n + "\t");
		}
		
		System.out.println("\nTemp after array copy");
		for(int n: temp){
			System.out.print(n + "\t");
		}
	}
}