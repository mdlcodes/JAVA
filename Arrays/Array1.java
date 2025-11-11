public class Array1 {
	public static void main(String[] args){
		
		String coffee[] = {"Barako", "3 in 1", "Coffee mate", "Starbucks"};
		
		for(String coffees : coffee){
			System.out.println(coffees);
		}
		
		System.out.println();
		
		for(int i = 0; i<=3 ; i++){
			System.out.println(coffee[i]);
		}
	}
}