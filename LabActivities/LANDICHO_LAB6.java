public class LANDICHO_LAB6{
	static double crossSection(int height, int base){
		return(base*height);
	}
	
	static double mInertia(int height, int base){
		return((base * Math.pow(height, 3))/12);
	}
	
	static double secMod(int height, int base){
		return((base * Math.pow(height,2) / 6));
	}
	
	public static void main(String[]args){
	
	
		int base, height;
		double c,m,s;
		
		System.out.println(" Lumber Size     Cross-sectional Area     Moment of Inertia     Section Modulus");
		
		for(base = 2; base <= 10; base += 2){
			for(height = 2; height <= 12; height += 2){
				
				c = crossSection(base, height);
				m = mInertia(base, height);
				s = secMod (base, height);
				
				System.out.printf("    %-18s %-24.2f %-21.2f %-25.2f%n", 
                    base + "x" + height, c, m, s);
				
			}
		}
		
	}
}