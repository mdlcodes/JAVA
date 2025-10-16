public class ReviewForPrelims 
{
	public static void main(String[]args)
	{
		/*
		int a = 8;
		int b =15;
		int c = 20;
		int d = 22;
		char first = 'N';
		int x = 81;
		int y = 27;
		String result;
		
		result = (a > b)? "tama": "mali";
		System.out.println(result);
			
			System.out.println("shte");
		System.out.println("a + b = "+(a + b));
		System.out.println("a % b = " +(a % b));
		System.out.println("++a = " + (++a));
		System.out.println("a++ = " + (a++));
		System.out.println("--b = " + (--b));
		System.out.println(first == 'j' || first == 'n' );
		System.out.println(d != 22);
		System.out.println("X & Y = " + (x & y)); */
		
		String country = "Philippines";
		String c2 = "PHIlippines";
		String a = "abc";
		String b = "     def";
		String c = a.concat(b);
	

	String str = "aaa:bb:ccc";
	String result[] = str.split(":");
	for (String r: result) {
		System.out.println(r);
	}
	
	
	
		
		System.out.println(b.trim());
		System.out.println(country.equals(c2));
		System.out.println(country.equalsIgnoreCase(c2));
		System.out.println(c + "ghi");
		System.out.println(country.replace('p', 'a'));
		System.out.println(country.toUpperCase());
		System.out.println(country.substring(2,11));
		System.out.println(country.length());
		System.out.println(country.substring(country.length()-1));
		System.out.println(country.charAt(3));
		System.out.println("Philippines".charAt(3));
		
		//ili
		
	}
}