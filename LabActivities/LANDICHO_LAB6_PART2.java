public class LANDICHO_LAB6_PART2 {
    public static void main(String[] args) {
        
        double s, d = 0;
        double l;

        System.out.println("  Span      Diameter          Length         ");

        for (s = 10; s <= 500; s += 10) {
           
		   if (s < 200) {
                d = 3.0 / 8;
            } else if (200 <= s  && s < 400) {
                d = 3.0 / 4;
            } else if(400<=s && s <=500){
                d = 7.0 / 8;
            }

            l = s * 1 + ((8 * Math.pow(d, 2)) / (3 * Math.pow(s,2)));

            System.out.printf("   %-9.0f  %-13.2f  %-24.5f \n", s, d, l);
        }

    }
}