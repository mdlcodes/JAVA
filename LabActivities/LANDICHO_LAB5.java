import java.util.Scanner;
public class LANDICHO_LAB5
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		final double z = 2.5;
		double V = 0.0;
		
		System.out.println("Enter the value of x: ");
		x = sc.nextInt();
		
		System.out.println("Enter the value of y: ");
		y = sc.nextInt();
		
		switch(x){
			case 1: if (y >= 5){
				V = x + y /z;
			}  else {
				V = x * y * z;
			}
			
			break;
			
			case 2: if(y > 5){
				V = x - Math.sqrt(y) + z;
			} else {
				V = (x - y) / z; 
			} 
		
			break;
			
			default: V = x + y + z;
		}
			System.out.printf("%.3f",V);
	}
}