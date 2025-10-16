import java.util.Scanner;
public class VendingMachine{
	static void kanta() {
        try {
            System.out.println("Pagka't");

            // wait for 2 seconds (2000 ms)
            Thread.sleep(1400);

            System.out.println("ikaw lang ang nais makatabi");
			
			Thread.sleep(5000);

            System.out.println("malamig man o");
			
			Thread.sleep(3500);

            System.out.println("mainit ang gabi");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	public static void main(String[]args){
		//LIST OF THINGS IN THE VENDING MACHINE
		//ASSIGN IT TO CASE 1- COKE
		//PUT VALUE ON CASE COKE = 30 CHOSEN
		//QUANTITY IF CHOOSEN = MULTIPLY 
		
		Scanner scanner = new Scanner(System.in);
		char decision;
		int total =0;
		int quantity;
		
		System.out.println("1 : Coke $10 \n2 : Sprite $19");
		decision = scanner.next().charAt(0);
		
		switch(decision){
			case '1' -> total = total + 10;
			case '2' -> total = total + 19;
		}
		
		System.out.println("Quantity? ");
		quantity = scanner.nextInt();
		total = total * quantity;
		
		kanta();
		
		
	}
}