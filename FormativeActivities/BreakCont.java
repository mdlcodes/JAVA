public class BreakCont{
	public static void main(String[]args){
/*  We can use break and continue here since it is a for loop, BUT
	if it is a single or an if-else statement only, they cannot be use.
		for(int i = 1; i <= 5; i++){
			if(i % 3 == 0){
				break;
			} 
			System.out.println(i);
		}
		
		for(int i = 1; i <=5; i++){
			if(i % 3 == 0){
				continue;
			} System.out.println(i);
		} */
		
		outerLoop:
		for(int i =1; i<=5; i++){
			innerLoop:
			for(int j=1; j<=2; j++){
				System.out.println(i);
			}continue outerLoop;

		}
	}
}