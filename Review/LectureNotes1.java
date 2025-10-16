public class LectureNotes1 {
	public static void main(String[]args){
		
		String country = "Philippines";
		String message = "Welcome";
		String name = "     Mylene Domingo      ";
		
		System.out.println(country.length());
			System.out.println(country.substring(1,3));
			System.out.println(country.substring(11));
			System.out.println(country.substring(10));
			System.out.println(country.substring(0,11));
			System.out.println(country.substring(country.length()-1));
			System.out.println(country.charAt(0));
			System.out.println(country.charAt(country.length()-1));
			System.out.println("India".charAt("India".length() -1));
			System.out.println(message.concat(country));
			System.out.println(country.replace('i', '!'));
			System.out.println(country.toLowerCase());
			System.out.println(country.toUpperCase());
			System.out.println(country.equals("Philippines"));
			System.out.println(country.equalsIgnoreCase("philippinEs"));
			System.out.println(name.trim()+"How are you?");
			//index start at 0
			// length start at 1
			
			String str = "aa:bb:cc";
			String result [] =str.split(":");
			//result(0) = aa
			//resrult(1) = bb
			//result(2) = cc
			 
			 for (String r : result){
				 System.out.println(r);
			 }
	}
}